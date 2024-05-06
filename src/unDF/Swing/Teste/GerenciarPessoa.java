package unDF.Swing.Teste;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class GerenciarPessoa extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nomePessoa;
	private JTextField pessoaCPF;
	Cadastro cadastro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GerenciarPessoa frame = new GerenciarPessoa();
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
	public GerenciarPessoa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastro de Pessoa");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 11, 146, 14);
		contentPane.add(lblNewLabel);
		
		JLabel nome = new JLabel("Nome: ");
		nome.setFont(new Font("Tahoma", Font.BOLD, 15));
		nome.setBounds(22, 48, 59, 14);
		contentPane.add(nome);
		
		JLabel cpf = new JLabel("CPF: ");
		cpf.setFont(new Font("Tahoma", Font.BOLD, 15));
		cpf.setBounds(22, 91, 46, 14);
		contentPane.add(cpf);
		
		nomePessoa = new JTextField();
		nomePessoa.setBounds(91, 47, 86, 20);
		contentPane.add(nomePessoa);
		nomePessoa.setColumns(10);
		
		pessoaCPF = new JTextField();
		pessoaCPF.setBounds(91, 90, 86, 20);
		contentPane.add(pessoaCPF);
		pessoaCPF.setColumns(10);
		
		cadastro = new Cadastro();
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(91, 188, 89, 23);
		contentPane.add(btnSalvar);
		
		JButton btnListar = new JButton("Listar");
		btnListar.setBounds(235, 188, 89, 23);
		contentPane.add(btnListar);
		
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cadastro cadastro = new Cadastro();
				String nome = nomePessoa.getText();
				String cpf = pessoaCPF.getText();
				
				cadastro.SalvarEmArquivo("pessoa.txt", nome, cpf);
				JOptionPane.showMessageDialog(null, "Tudo OK");
				
			}
		});
		
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadastro.ListarDados();
				
			}
			
		});
	}
}
