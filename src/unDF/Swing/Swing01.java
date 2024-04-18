package unDF.Swing;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Swing01 {

	public void iniciar() {
		JFrame frame = new JFrame();
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		JPanel panel = new JPanel();
		JTextField fieldA = new JTextField(20);	
		JLabel labelPlus = new JLabel(" + ");
		JTextField fieldB = new JTextField(20);	
		JLabel labelEquals = new JLabel(" = ");
		JLabel result = new JLabel("");
		
		JButton button = new JButton("Calcular");
		button.addActionListener((e) ->{
			int numeroA = Integer.parseInt(fieldA.getText());
			int numeroB = Integer.parseInt(fieldB.getText());
			Integer soma = numeroA + numeroB;
			result.setText(soma.toString());
		});
		
		panel.add(fieldA);
		panel.add(labelPlus);
		panel.add(fieldB);
		panel.add(labelEquals);
		panel.add(result);
		panel.add(button);
		
		frame.add(panel);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Swing01().iniciar();

	}

}
