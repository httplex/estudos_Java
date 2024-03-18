package lista03.ex04;

public class TesteAmazon {

	public static void main(String[] args) {
		Produto produto1 = new Produto("Água mineral", 10.99, 10);
		
		System.out.println(produto1);
		
		produto1.comprarProduto(1);
		System.out.println("\nProdutos no estoque: " + produto1.quantidadeDisponivel);
		
		produto1.comprarProduto(1);
		System.out.println("\nProdutos no estoque: " + produto1.quantidadeDisponivel);
	
		produto1.comprarProduto(9);
		System.out.println("\nProdutos no estoque: " + produto1.quantidadeDisponivel);

	}

}
