package unDF.Swing.Revisao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.Font;

public class GerenciamentoVeiculo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	 private CadastroVeiculo cadastroVeiculo; 

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
		setBounds(200, 200, 560, 350);
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
		btnCadastro.setBounds(55, 126, 123, 31);
		contentPane.add(btnCadastro);
		
		JButton btnListar = new JButton("Listar Veículos");
		btnListar.setBounds(55, 184, 123, 31);
		contentPane.add(btnListar);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(SystemColor.activeCaptionText);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\desuf\\Desktop\\7820319a2cf056d034ba063ccdbaa6e8.jpg"));
		lblNewLabel.setBounds(103, 0, 498, 311);
		contentPane.add(lblNewLabel);
		
		btnCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadastroVeiculo = new CadastroVeiculo();
				cadastroVeiculo.setVisible(true);
				setVisible(false);
			}
		});
	}
}
