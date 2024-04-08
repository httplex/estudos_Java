package unDF.ExOO.ex05;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MarcaTenis {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<String> marcas = new HashSet<>();
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Informe o nome da marca: ");
			String nome = sc.nextLine();
			marcas.add(nome);
		}
		
		for(String marca : marcas) {
			System.out.println(marca);
		}
		
		sc.close();
		

	}

}
