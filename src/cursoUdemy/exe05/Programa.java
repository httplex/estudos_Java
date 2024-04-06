package cursoUdemy.exe05;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Conta conta;
		System.out.println("Informe o número da conta: ");
		int numero = sc.nextInt();
		System.out.println("Informe o titular da conta: ");
		sc.nextLine();
		String nomeTitular = sc.nextLine();
		System.out.println("Existe um depósito inicial? (y/n)? ");
		char resposta = sc.next().charAt(0); //ler o caracter
		if(resposta == 'y') {
			System.out.println("Informe um depósito inicial válido:");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(numero, nomeTitular, depositoInicial);
		} else {
			conta = new Conta(numero, nomeTitular);
		}
		
		System.out.println();
		System.out.println("Dados da conta: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Insira um valor de depósito: ");
		double depositoValido = sc.nextDouble();
		conta.depositar(depositoValido);
		System.out.print("Dados da conta atualizados: ");
		System.out.print(conta);
		
		System.out.println();
		System.out.print("Insira um valor de saque: ");
		double saqueValido = sc.nextDouble();
		conta.sacar(saqueValido);
		System.out.print("Dados da conta atualizados: ");
		System.out.print(conta);
		
		/* MINHA VERSÃO
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
		*/
		sc.close();

	}

}
