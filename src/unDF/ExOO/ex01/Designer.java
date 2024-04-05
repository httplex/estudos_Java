package unDF.ExOO.ex01;

public class Designer extends Funcionario{
	public Designer(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}
	
	@Override
	public double calcularBonificacao() {
		double bonificacao = salario * 0.12;
		return bonificacao;
	}
}
