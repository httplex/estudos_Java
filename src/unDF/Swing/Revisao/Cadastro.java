package unDF.Swing.Revisao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Cadastro {
	private List<CadastroVeiculo>veiculos;
	
	public Cadastro() {
		this.veiculos = new ArrayList<>();
	}
	
	public void adicionarVeiculo(CadastroVeiculo veiculo) {
		veiculos.add(veiculo);
	}
	
	public void SalvarEmArquivo(String nomeArquivo, String marca, String modelo, String ano, String tipo, String combustivel) {
		try(BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo, true))) {
				writer.write(marca + ", "+ modelo + ", " + ano + ", "+ tipo + ", " + combustivel);
				writer.newLine();
				System.out.println("Dados salvos em "+ nomeArquivo+ ".");
			
		} catch (IOException e) {
				e.printStackTrace();
			}		
		
	}
	
}
