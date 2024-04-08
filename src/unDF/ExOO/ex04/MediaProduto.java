package unDF.ExOO.ex04;

import java.util.Scanner;

public class MediaProduto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome do produto: ");
		String nome = sc.nextLine();
		Produto produto = new Produto(nome);
		
		for(int i = 0; i <12; i++) {
			System.out.println("Digite o preço do produto " + (i + 1) + " mês: ");
			double valor = sc.nextDouble();
			produto.adicionarPreco(valor);
		}
		
		double media = 0;
		
		for(double preco : produto.getPreco()) {
			media += preco;
		}
		
		System.out.println(media);
		
		sc.close();
	}

}
