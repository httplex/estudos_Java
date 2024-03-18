package lista02_exercicio02;

public class Medico {
	int codigo;
	String nome, especialidade;
	char sexo;
	Endereco endereco;
	
	public Medico(int codigo, String nome, String especialidade, char sexo, Endereco endereco) {
		this.codigo = codigo;
		this.nome = nome;
		this.especialidade = especialidade;
		this.sexo = sexo;
		this.endereco = endereco;
	}
	
	public String toString() {
		return  "\nDados do Médico: " + 
				"\nCódigo: " + codigo + 
				"\nNome: " + nome + 
				"\nEspecialidade: " + especialidade + 
				"\nSexo: " + sexo + 
				"\nEndereço: " + endereco;
	}
}
