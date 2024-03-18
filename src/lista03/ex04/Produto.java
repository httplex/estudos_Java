package lista03.ex04;

public class Produto {
	public String nome;
	public double preco;
	public int quantidadeDisponivel;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidadeDisponivel() {
		return quantidadeDisponivel;
	}

	public void setQuantidadeDisponivel(int quantidadeDisponivel) {
		if(quantidadeDisponivel < 0) {
			quantidadeDisponivel = 0;
		}
		this.quantidadeDisponivel = quantidadeDisponivel;
	}

	public Produto(String nome, double preco, int quantidadeDisponivel){
		this.nome = nome;
		this.preco = preco;
		this.quantidadeDisponivel = quantidadeDisponivel;
	}
	
	public int comprarProduto(int comprar) {
		setQuantidadeDisponivel(quantidadeDisponivel - comprar);
		return getQuantidadeDisponivel(); 
	}
	
	public String toString() {
		return "Dados do produto: " + 
				"\nNome: " + nome + 
				"\nPreço: " + preco +
				"\nQuantidade disponível: " + quantidadeDisponivel;
	}
}
