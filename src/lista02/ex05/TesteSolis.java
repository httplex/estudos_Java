package lista02.ex05;

public class TesteSolis {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Lady Gaga", "890.343.678-90");
		
		aluno1.nota1 = 4.5;
		aluno1.nota2 = 5.0;
		aluno1.nota3 = 9.4;
		aluno1.nota4 = 10.0;
		
		double media = aluno1.calcularMedia();
		
		System.out.printf("Média do aluno: %.2f", media);
		
		aluno1.nota2 = 0.0;
		
		double media2 = aluno1.calcularMedia();
		
		System.out.printf("\nMédia do aluno: %.2f", media2);
	}

}
