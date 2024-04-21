package unDF.Swing;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.github.lgooddatepicker.components.DatePicker;

public class Swing02 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("A T T E N T I O N");
        frame.setSize(700, 650);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridBagLayout());

        JLabel nomeLabel = new JLabel("Nome:");
        panel.add(nomeLabel, posicionar(0, 0));
        JTextField nomeField = new JTextField(20);
        panel.add(nomeField, posicionar(1, 0));

        
        JLabel surnameLabel = new JLabel("Sobreome:");
        panel.add(surnameLabel, posicionar(0, 1));
        JTextField surnameField = new JTextField(20);
        panel.add(surnameField, posicionar(1, 1));
        
        JLabel cpfLabel = new JLabel("CPF:");
        panel.add(cpfLabel, posicionar(0, 2));
        JTextField cpfField = new JTextField(20);
        panel.add(cpfField, posicionar(1, 2));
        
        JLabel emailLabel = new JLabel("E-mail:");
        panel.add(emailLabel, posicionar(0, 3));
        JTextField emailField = new JTextField(20);
        panel.add(emailField, posicionar(1, 3));
        
        JLabel estadoCivilLabel = new JLabel("Estado Civil:");
        panel.add(estadoCivilLabel, posicionar(0, 4));
        String[] options = {"Solteiro(a)", "Casado(a)", "Viúvo(a)"}; 
        JComboBox<String> estadoCivil = new JComboBox<>(options);
        estadoCivil.addActionListener(e -> System.out.println("Estado Civi: " + estadoCivil.getSelectedItem()));
        panel.add(estadoCivil, posicionar(1,4));
        
        JLabel dataDeNascLabel = new JLabel("Data de Nascimento:");
        panel.add(dataDeNascLabel, posicionar(0, 5));
        DatePicker dataNasc = new DatePicker();
        panel.add(dataNasc, posicionar(1,5));
        
        JLabel genderLabel = new JLabel("Gênero:");
        panel.add(genderLabel, posicionar(0, 6));
        var option1 = new JRadioButton("Cisgênero");
        var option2 = new JRadioButton("Transgênero");
        var option3 = new JRadioButton("Outro");
        panel.add(option1, posicionar(0, 7));
        panel.add(option2, posicionar(1, 7));
        panel.add(option3, posicionar(2, 7));
        
        JCheckBox checkBox1 = new JCheckBox("Possui filhos?");
        panel.add(checkBox1, posicionar(0, 8));

        JButton btnEnviar = new JButton("Enviar");
        btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int response = JOptionPane.showConfirmDialog(null, "Salvar as alterações?", "Confirmação", JOptionPane.YES_NO_OPTION);
				if(response == JOptionPane.YES_OPTION) {
					System.out.println("Salvo com sucesso!");
        }
			}
				});
        
        
        JButton btnLimpar = new JButton("Limpar");
        btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int response = JOptionPane.showConfirmDialog(null, "Deseja limpar os campos?", "Confirmação", JOptionPane.YES_NO_OPTION);
				if(response == JOptionPane.YES_OPTION) {
					nomeField.setText("");
					surnameField.setText("");
					cpfField.setText("");
					emailField.setText("");
					
					dataNasc.clear();
		            option1.setSelected(false);
		            option2.setSelected(false);
		            option3.setSelected(false);
		            checkBox1.setSelected(false);
					
					System.out.println("Campos limpos com sucesso!");
        }
			}
				});
        
        JButton btnSair = new JButton("Sair");
        btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int response = JOptionPane.showConfirmDialog(null, "Deseja mesmo sair?", "Confirmação", JOptionPane.YES_NO_OPTION);
				if(response == JOptionPane.YES_OPTION) {
					System.out.println("Saindo...");
					frame.dispose();
        }
			}
				});
        
        panel.add(btnEnviar, posicionar(2,11));
        panel.add(btnLimpar, posicionar(3,11));
        panel.add(btnSair, posicionar(4,11));
        
        frame.add(panel);
        frame.setVisible(true);
    }

    static GridBagConstraints posicionar(int x, int y) {
        var cts = new GridBagConstraints();
        cts.gridx = x;
        cts.gridy = y;
        cts.anchor = GridBagConstraints.WEST;
        cts.insets = new Insets(10, 5, 10, 10); //cima, esqueda, baixo, direita 
        return cts;
    }
    
}
