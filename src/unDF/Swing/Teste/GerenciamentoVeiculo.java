package unDF.Swing.Teste;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JTextField;
import javax.swing.JButton;

public class GerenciamentoVeiculo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField marcaVeiculo;
	private JTextField modeloVeiculo;
	private Cadastro cadastro;

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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastro de Veículo");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 11, 155, 14);
		contentPane.add(lblNewLabel);
		
		JLabel marca = new JLabel("Marca");
		marca.setBounds(10, 48, 46, 14);
		contentPane.add(marca);
		
		marcaVeiculo = new JTextField();
		marcaVeiculo.setBounds(61, 45, 86, 20);
		contentPane.add(marcaVeiculo);
		marcaVeiculo.setColumns(10);
		
		JLabel modelo = new JLabel("Modelo");
		modelo.setBounds(10, 73, 46, 14);
		contentPane.add(modelo);
		
		modeloVeiculo = new JTextField();
		modeloVeiculo.setBounds(61, 70, 86, 20);
		contentPane.add(modeloVeiculo);
		modeloVeiculo.setColumns(10);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(58, 187, 89, 23);
		contentPane.add(btnSalvar);
		
		JButton btnListar = new JButton("Listar");
		btnListar.setBounds(210, 187, 89, 23);
		contentPane.add(btnListar);
		
		cadastro = new Cadastro();
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cadastro cadastro = new Cadastro();
				String modelo = modeloVeiculo.getText();
				String marca = marcaVeiculo.getText();
				
				cadastro.SalvarEmArquivo("ana.txt", marca, modelo);
				JOptionPane.showMessageDialog(null, "Dados salvos!");
				
			}
		});
		
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadastro.listarDados();
			}
		});
		
	}
	
	
}
