package lista02_exercicio03;

public class TesteStreetFighter {
	public static void main(String[] args) {
		Lutador lutador1 = new Lutador("Ruy", 100, 10);
		Lutador lutador2 = new Lutador("Bison", 100, 12);
		
		lutador1.aplicarGolpe(lutador2);
		lutador1.aplicarGolpe(lutador2);
		lutador1.aplicarGolpe(lutador2);
		
		System.out.println("Energia: " + lutador2.energia);
		
		lutador2.aplicarGolpe(lutador1);
		lutador2.aplicarGolpe(lutador1);
		lutador2.aplicarGolpe(lutador1);
		lutador2.aplicarGolpe(lutador1);
		lutador2.aplicarGolpe(lutador1);
		lutador2.aplicarGolpe(lutador1);
		lutador2.aplicarGolpe(lutador1);
		lutador2.aplicarGolpe(lutador1);
		
		System.out.println("\nEnergia: " + lutador1.energia);
	}
}
