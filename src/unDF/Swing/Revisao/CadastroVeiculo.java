package unDF.Swing.Revisao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;

public class CadastroVeiculo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

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
		
		JLabel lblNewLabel_2_3 = new JLabel("Informe o tipo de veículo: ");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_3.setBounds(30, 242, 50, 14);
		panel.add(lblNewLabel_2_3);
		
		textField = new JTextField();
		textField.setBounds(95, 67, 150, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(95, 113, 150, 20);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(95, 159, 150, 20);
		panel.add(textField_2);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(110, 302, 46, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(83, 382, 46, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\desuf\\Desktop\\pngtree-blue-transparent-watercolor-smudge-background-picture-image_1311689.jpg"));
		lblNewLabel.setBounds(0, 0, 384, 580);
		contentPane.add(lblNewLabel);
	}
}
