package ExOO.ex03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TechConvert {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("~~~~ Conversor de Unidades: ~~~~");

			int opcao = -1;
			
			do {
				try {
					
				System.out.println("Informe o tipo de conversão que você deseja fazer: ");
				System.out.println(" 1 - Quilogramas");
				System.out.println(" 2 - Libras");
				System.out.println(" 3 - Onças");
				
				opcao = sc.nextInt();
				
				switch(opcao) {
				case 1:
					System.out.println("Informe o valor em gramas: ");
					double valorEmGramas = sc.nextDouble();
					Conversor conversor = new Conversor(valorEmGramas);
					System.out.println("O valor em Quilogramas é de: \n" + conversor.converterEmQuilogramas() + "\n");
					break;
					
				case 2:
					System.out.println("Informe o valor em gramas: ");
					valorEmGramas = sc.nextDouble();
					conversor = new Conversor(valorEmGramas);
					System.out.println("O valor em Libras é de: \n" + conversor.converterEmLibras() + "\n");
					break;
					}
				}catch(InputMismatchException e) {
					 System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
					 sc.nextLine();
					}
				
			} while(opcao != 0);
			
			sc.close();
	}

}
