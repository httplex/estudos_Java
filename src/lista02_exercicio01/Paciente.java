package lista02_exercicio01;

/*
1. Você foi contratad@ para implementar um sistema de clínica médica, crie uma classe “Paciente” com os
atributos e o construtor descritos e depois realize os passos definidos a seguir:

ATRIBUTOS:
codigo, nome, dataNascimento, sexo, planoSaude, alergia, tipoSanguineo.

CONSTRUTOR:
Deve receber os parâmetros para iniciar os atributos: codigo, nome, dataNascimento, sexo,
planoSaude, alergia, tipoSanguineo.

PASSOS:
a. Instanciar um objeto paciente com o seu nome, data de nascimento, sexo, alergia (caso você
tenha) e tipo sanguíneo.
b. Imprimir cada um dos dados do objeto (acessando os atributos).
c. Modificar cada um dos dados do objeto com os valores correspondentes aos dados da sua mãe
ou seu pai (modificando os atributos).
d. Imprimir dados do objeto novamente
 */

public class Paciente {
	int codigo;
	public String nome, dataNascimento;
	public String planoSaude;
	public String alergia;
	public String tipoSanguineo;
	public char sexo;
	
	public Paciente(int codigo, String nome, String dataNascimento, char sexo, String planoSaude, String alergia, String tipoSanguineo) {
		this.codigo = codigo;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.planoSaude = planoSaude;
		this.alergia = alergia;
		this.tipoSanguineo = tipoSanguineo;
	}
	
	public String toString() {
		return "Dados do paciente: " +
				"\nCódigo: " + this.codigo +
				"\nNome: " + this.nome +
				"\nData de Nascimento: " + this.dataNascimento +
				"\nSexo: " + this.sexo +
				"\nPlano de Saúde: " + this.planoSaude +
				"\nAlergias: " + this.alergia + 
				"\nTipo Sanguíneo: " + this.tipoSanguineo;
	}
}
