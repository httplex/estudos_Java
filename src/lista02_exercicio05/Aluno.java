package lista02_exercicio05;

public class Aluno {
	String nome, cpf;
	double nota1, nota2, nota3, nota4;
	
	public Aluno(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public double calcularMedia() {
		return (nota1 + nota2 +nota3 + nota4) / 4; 
	}
}
