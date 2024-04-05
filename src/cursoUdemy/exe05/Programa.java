package cursoUdemy.exe05;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String opcao;
		
		Conta conta = new Conta();
		System.out.println("Enter account number: ");
		conta.numeroConta = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter account holder: ");
		conta.nomeTitular = sc.nextLine();
		System.out.println("Is there na initial deposit (y/n)? ");
		opcao = sc.nextLine();
		
		if(opcao.equalsIgnoreCase("y")) {
			System.out.println("Enter initial deposit value:");
			conta.depositoInicial = sc.nextDouble();
			sc.nextLine();
			
		} else {
			conta.depositoInicial = 0;
			sc.nextLine();
		}
		
		System.out.println("Account data: ");
		System.out.println("Account " + conta.numeroConta + ", " + "Holder: " + conta.nomeTitular + ", " + "Balance: $ " + conta.depositoInicial);
		
		

	}

}
