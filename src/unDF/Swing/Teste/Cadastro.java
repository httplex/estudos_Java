package unDF.Swing.Teste;

import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Cadastro {
	private List<GerenciamentoVeiculo>veiculo;
	
	public Cadastro() {
		this.veiculo = new ArrayList<>();
	}
	
	public void AdicionarVeiculo(GerenciamentoVeiculo veiculos) {
		veiculo.add(veiculos);
	}
	
	public void SalvarEmArquivo(String nomeArquivo, String marca, String modelo) {
		try(BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo, true))){
			writer.write(marca + ", " + modelo);
			writer.newLine();
			System.out.println("Dados salvos em " + nomeArquivo + ".");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void listarDados() {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("modelo");
		model.addColumn("marca");
		
		try(BufferedReader reader = new BufferedReader(new FileReader("ana.txt"))){
			String line;
			while((line = reader.readLine()) != null) {
				String [] parts = line.split(",");
				if(parts.length == 2) {
					model.addRow(parts);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		JTable table = new JTable(model);
	    JScrollPane scrollPane = new JScrollPane(table);
	    
	    JPanel panel = new JPanel(new BorderLayout());
	    panel.add(scrollPane, BorderLayout.CENTER);

	    JOptionPane.showMessageDialog(null, panel, "Lista de Veículos", JOptionPane.PLAIN_MESSAGE);
	}
}




















