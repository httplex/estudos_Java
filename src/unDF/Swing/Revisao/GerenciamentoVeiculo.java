package unDF.Swing.Revisao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.Font;

public class GerenciamentoVeiculo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private CadastroVeiculo cadastroVeiculo; 
	private JTable table;
	private DefaultTableModel model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GerenciamentoVeiculo frame = new GerenciamentoVeiculo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GerenciamentoVeiculo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 600, 350);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.text);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Escolha a opção desejada:");
		lblNewLabel_2.setFont(new Font("Sitka Subheading", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(34, 54, 172, 20);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Bem vindo ao CadVec!");
		lblNewLabel_1.setFont(new Font("Sitka Subheading", Font.BOLD, 20));
		lblNewLabel_1.setBounds(24, 11, 214, 52);
		contentPane.add(lblNewLabel_1);
		
		JButton btnCadastro = new JButton("Cadastrar veículo");
		btnCadastro.setBounds(55, 126, 135, 31);
		contentPane.add(btnCadastro);
		
		JButton btnListar = new JButton("Listar Veículos");
		btnListar.setBounds(55, 184, 135, 31);
		contentPane.add(btnListar);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(SystemColor.activeCaptionText);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\desuf\\Desktop\\7820319a2cf056d034ba063ccdbaa6e8.jpg"));
		lblNewLabel.setBounds(142, 0, 498, 311);
		contentPane.add(lblNewLabel);
		
		btnCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadastroVeiculo = new CadastroVeiculo();
				cadastroVeiculo.setVisible(true);
				setVisible(false);
			}
		});
		
		btnListar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listarVeiculos();
            }
        });
    }

	private void listarVeiculos() {
	    DefaultTableModel model = new DefaultTableModel();
	    model.addColumn("Marca");
	    model.addColumn("Modelo");
	    model.addColumn("Ano");
	    model.addColumn("Tipo");
	    model.addColumn("Combustível");

	    try (BufferedReader reader = new BufferedReader(new FileReader("dados_veiculo.txt"))) {
	        String line;
	        while ((line = reader.readLine()) != null) {
	            String[] parts = line.split(", ");
	            if (parts.length == 5) {
	                model.addRow(parts);
	            }
	        }
	    } catch (IOException ex) {
	        ex.printStackTrace();
	    }

	    JTable table = new JTable(model);
	    JScrollPane scrollPane = new JScrollPane(table);

	    JButton btnAlterar = new JButton("Alterar");
	    btnAlterar.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            int selectedRow = table.getSelectedRow();
	            int selectedColumn = table.getSelectedColumn();
	            if (selectedRow != -1 && selectedColumn != -1) {
	                String columnName = table.getColumnName(selectedColumn);
	                String currentValue = (String) table.getValueAt(selectedRow, selectedColumn);
	                String newValue = JOptionPane.showInputDialog(null, "Novo valor para " + columnName + ":", currentValue);
	                if (newValue != null && !newValue.isEmpty()) {
	                    table.setValueAt(newValue, selectedRow, selectedColumn);
	                    salvarAlteracoes(table, model); // Chamada para salvar as alterações no arquivo
	                }
	            } else {
	                JOptionPane.showMessageDialog(null, "Selecione um campo para alterar.");
	            }
	        }
	    });

	    JPanel panel = new JPanel(new BorderLayout());
	    panel.add(scrollPane, BorderLayout.CENTER);
	    panel.add(btnAlterar, BorderLayout.SOUTH);

	    JOptionPane.showMessageDialog(null, panel, "Lista de Veículos", JOptionPane.PLAIN_MESSAGE);
	}
	
	private void salvarAlteracoes(JTable table, DefaultTableModel model) {
	    try (BufferedWriter writer = new BufferedWriter(new FileWriter("dados_veiculo.txt"))) {
	        for (int i = 0; i < model.getRowCount(); i++) {
	            for (int j = 0; j < model.getColumnCount(); j++) {
	                writer.write(model.getValueAt(i, j).toString());
	                if (j < model.getColumnCount() - 1) {
	                    writer.write(", ");
	                }
	            }
	            writer.newLine();
	        }
	        writer.flush();
	        JOptionPane.showMessageDialog(null, "Alterações salvas com sucesso!");
	    } catch (IOException ex) {
	        ex.printStackTrace();
	        JOptionPane.showMessageDialog(null, "Erro ao salvar as alterações.");
	    }
	}


}
