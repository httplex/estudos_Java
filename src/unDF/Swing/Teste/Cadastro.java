package unDF.Swing.Teste;

import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Cadastro {
	private List<GerenciarPessoa>pessoa;
	
	Cadastro(){
		this.pessoa = new ArrayList<>();
	}
	
	public void AdicionarPessoa(GerenciarPessoa pessoas) {
		pessoa.add(pessoas);
	}
	
	public void SalvarEmArquivo(String nomeArquivo, String nome, String cpf) {
		try(BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo, true))){
			writer.write(nome + ", " + cpf);
			writer.newLine();
			System.out.println("Salvo em " + nomeArquivo + ".");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void ListarDados() {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Nome");
		model.addColumn("CPF");
		
		try(BufferedReader reader = new BufferedReader(new FileReader("pessoa.txt"))){
			String line;
			while((line = reader.readLine()) != null) {
				String[] parts = line.split(", ");
				if(parts.length == 2) {
					model.addRow(parts);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		JTable table = new JTable(model);
		JScrollPane scrollPane = new JScrollPane(table);
		JPanel panel = new JPanel(new BorderLayout());
		panel.add(scrollPane, BorderLayout.CENTER);
		JOptionPane.showMessageDialog(null, panel, "Lista de Dados", JOptionPane.PLAIN_MESSAGE);
	}
}
