package unDF.ExOO.ex01;

public class Programador extends Funcionario{
	public Programador(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}
	
	@Override
	public double calcularBonificacao() {
		double bonificacao = salario * 0.15;
		return bonificacao;
	}
}
