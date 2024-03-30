package ExOO.ex01;

public class Gerente extends Funcionario{
	public Gerente(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}
	
	@Override
	public double calcularBonificacao() {
		double bonificacao = salario * 0.2;
		return bonificacao;
	}
}
