package unDF.ExOO.ex01;

public abstract class Funcionario {
	public String nome;
	public String cpf;
	public double salario;
	
	Funcionario(String nome, String cpf, double salario){
		this.nome = nome;
		this.cpf = cpf;
		this.salario= salario;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public abstract double calcularBonificacao();
	public double calcularSalarioTotal() {
        return salario + calcularBonificacao();
    }
	
	public String toString() {
		return  "\n********** Dados do Funcionário **********" + 
				"\nNome: " + nome +
				"\nCPF: " + cpf + 
				"\nSalário: " + salario + 
				"\nBonificação: " + String.format("R$ %.2f", calcularBonificacao()) + 
				"\nSalário Total: " + String.format("R$ %.2f", calcularSalarioTotal());
	}
	

}

	
