package unDF.ExOO.ex04;

import java.util.ArrayList;
import java.util.List;

public class Produto {
	private List <Double> preco;
	private String nome;
	
	public Produto(String nome) {
		this.preco = new ArrayList <>();
		this.nome = nome;
	}

	public List<Double> getPreco() {
		return preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void adicionarPreco(double preco) {
		this.preco.add(preco);
	}
}
