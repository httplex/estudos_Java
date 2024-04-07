package unDF.ExOO.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BibliotecaUnDF {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Livro> listaLivros = new ArrayList<>();
		
		Livro livro;
		
		int opcao;
		do {
		System.out.println("╔══════════════════════════════════════════════════════════════════╗");
		System.out.println("║               Bem Vindo a biblioteca virtual UnDF!               ║");
		System.out.println("║══════════════════════════════════════════════════════════════════║");
		System.out.println("║                                                                  ║");
		System.out.println("║   Para interação com o sistema escolha uma das opções a seguir:  ║");
		System.out.println("║                                                                  ║");
		System.out.println("║   1 - Cadastro de livros;                                        ║");
		System.out.println("║   2 - Empréstimos;                                               ║");
		System.out.println("║   3 - Devolução;                                                 ║");
		System.out.println("║   4 - Livros disponíveis.                                        ║");
		System.out.println("║                                                                  ║");
		System.out.println("╚══════════════════════════════════════════════════════════════════╝");
		
		opcao = sc.nextInt();
		sc.nextLine();
		
		switch(opcao) {
			case 1:
				char tipo;
				
				System.out.println("╔══════════════════════════════════════════════════════════════════╗");
				System.out.println("║                        Cadastro de livro                         ║");
				System.out.println("╚══════════════════════════════════════════════════════════════════╝");
				
				do {
					System.out.println("O livro a ser cadastado é físico (digite: f) ou digital (digite: d)?");
					tipo = sc.next().charAt(0);
				
					if(tipo == 'f') {
						System.out.println("Cadastre o livro físico: ");
						System.out.println();
						
						//Dados principais do livro
						System.out.println("Informe o título do livro: ");
						String titulo = sc.nextLine();
						System.out.println("Informe o autor: ");
						String autor = sc.nextLine();
						System.out.println("Informe o ano de publicação: ");
						int anoPublicacao = sc.nextInt();
						System.out.println("Informe o ISBN(apenas os 13 caracteres): ");
						int ISBN = sc.nextInt();
						
						System.out.println();
						
						//Dados específicos do livro
						System.out.println("Informe o peso: ");
						double peso = sc.nextDouble();
						System.out.println("Informe a largura: ");
						double largura = sc.nextDouble();
						System.out.println("Informe a altura: ");
						double altura = sc.nextDouble();
						System.out.println("Informe a espessura: ");
						double espessura = sc.nextDouble();
						
						//Objeto criado com as informações digitadas
						Fisico fisico = new Fisico(titulo, autor, anoPublicacao, ISBN, peso, largura, altura, espessura);
						
						listaLivros.add(fisico); //Adicionar novo livro ao array
					
					} else if (tipo == 'd') {
						System.out.println("Cadastre o livro digital: ");
						System.out.println();
						
						//Dados principais do livro
						System.out.println("Informe o título do livro: ");
						String titulo = sc.nextLine();
						sc.nextLine();
						System.out.println("Informe o autor: ");
						String autor = sc.nextLine();
						System.out.println("Informe o ano de publicação: ");
						int anoPublicacao = sc.nextInt();
						System.out.println("Informe o ISBN(apenas os 13 caracteres): ");
						long ISBN = sc.nextLong();
						sc.nextLine();
						
						System.out.println();
						
						//Dados específicos do livro
						System.out.println("Informe o formato: ");
						String formato = sc.nextLine();
						System.out.println("Informe o tamanho: ");
						String tamanho = sc.nextLine();
						
						//Objeto criado com as informações digitadas
						Digital digital = new Digital(titulo, autor, anoPublicacao, ISBN, formato, tamanho);
						
						listaLivros.add(digital); //Adicionar novo livro ao array
						
						System.out.println("Livro cadastrado com sucesso!");
						
					} else {
						System.out.println("Opção inválida. Por favor, digite 'f' para físico ou 'd' para digital.");
					}
				} while (tipo != 'd' && tipo != 'f');
				break;
				
				case 2: 
		
		}
						
		} while (opcao != 0);
		
		sc.close();
}
}
