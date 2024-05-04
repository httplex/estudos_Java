package unDF.Swing.Revisao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class CadastroVeiculo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField marcaVeiculo;
	private JTextField modeloVeiculo;
	private JTextField anoVeiculo;
	private JTextField tipoVeiculo;
	private JTextField textField;
	private GerenciamentoVeiculo gerenciamentoVeiculo; 
	private Cadastro cadastro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroVeiculo frame = new CadastroVeiculo();
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
	public CadastroVeiculo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 580);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.text);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(25, 25, 340, 490);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Cadastro de Veículo");
		lblNewLabel_1.setBounds(20, 21, 183, 26);
		lblNewLabel_1.setFont(new Font("Sitka Subheading", Font.BOLD, 20));
		panel.add(lblNewLabel_1);
		
		JLabel marca = new JLabel("Marca: ");
		marca.setFont(new Font("Tahoma", Font.BOLD, 15));
		marca.setBounds(30, 68, 62, 14);
		panel.add(marca);
		
		JLabel modelo = new JLabel("Modelo: ");
		modelo.setFont(new Font("Tahoma", Font.BOLD, 15));
		modelo.setBounds(30, 114, 67, 14);
		panel.add(modelo);
		
		JLabel ano = new JLabel("Ano: ");
		ano.setFont(new Font("Tahoma", Font.BOLD, 15));
		ano.setBounds(30, 160, 46, 14);
		panel.add(ano);
		
		JLabel tipo = new JLabel("Informe o tipo de veículo: ");
		tipo.setFont(new Font("Tahoma", Font.BOLD, 15));
		tipo.setBounds(30, 225, 200, 14);
		panel.add(tipo);
		
		modeloVeiculo = new JTextField();
		modeloVeiculo.setBounds(95, 67, 150, 20);
		panel.add(modeloVeiculo);
		modeloVeiculo.setColumns(10);
		
		marcaVeiculo = new JTextField();
		marcaVeiculo.setColumns(10);
		marcaVeiculo.setBounds(95, 113, 150, 20);
		panel.add(marcaVeiculo);
		
		anoVeiculo = new JTextField();
		anoVeiculo.setColumns(10);
		anoVeiculo.setBounds(95, 159, 150, 20);
		panel.add(anoVeiculo);
		
		tipoVeiculo = new JTextField();
		tipoVeiculo.setBounds(30, 265, 215, 20);
		panel.add(tipoVeiculo);
		tipoVeiculo.setColumns(10);
		
		JLabel opcoes = new JLabel("(Carro, moto ou caminhão)");
		opcoes.setFont(new Font("Tahoma", Font.BOLD, 15));
		opcoes.setBounds(30, 245, 200, 14);
		panel.add(opcoes);
		
		JLabel combustivel = new JLabel("Combustível:");
		combustivel.setFont(new Font("Tahoma", Font.BOLD, 15));
		combustivel.setBounds(30, 310, 100, 14);
		panel.add(combustivel);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(53, 410, 89, 23);
		panel.add(btnVoltar);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(172, 410, 89, 23);
		panel.add(btnSalvar);
		
		textField = new JTextField();
		textField.setBounds(29, 330, 100, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\desuf\\Desktop\\pngtree-blue-transparent-watercolor-smudge-background-picture-image_1311689.jpg"));
		lblNewLabel.setBounds(0, 0, 384, 580);
		contentPane.add(lblNewLabel);
		
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gerenciamentoVeiculo = new GerenciamentoVeiculo();
				gerenciamentoVeiculo.setVisible(true);
				setVisible(false);
			}
		});
		
		btnSalvar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Ao clicar no botão salvar, cria-se uma instância da classe Cadastro
                cadastro = new Cadastro();
                
                // Obtém os dados dos campos de texto
                String marca = marcaVeiculo.getText();
                String modelo = modeloVeiculo.getText();
                String ano = anoVeiculo.getText();
                String tipo = tipoVeiculo.getText();
                String combustivel = textField.getText();
                
                // Chama o método SalvarEmArquivo da classe Cadastro
                cadastro.SalvarEmArquivo("dados_veiculo.txt", modelo, marca, tipo, ano, combustivel);
                
                // Imprime mensagem de confirmação no console
                System.out.println("Dados salvos em dados_veiculo.txt.");
                JOptionPane.showMessageDialog(null, "Dados salvos em dados_veiculo.txt.", "Confirmação", JOptionPane.INFORMATION_MESSAGE);
            }
        });
	}
}
