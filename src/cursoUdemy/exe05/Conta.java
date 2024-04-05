package cursoUdemy.exe05;

public class Conta {
	int numeroConta;
	String nomeTitular;
	double depositoInicial;
	
	public Conta() {

	}
	
	public Conta(int numeroConta, String nomeTitular, double depositoInicial) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		this.depositoInicial = depositoInicial;
	}
	
	public Conta(String nomeTitular, double depositoInicial) {
		this.nomeTitular = nomeTitular;
		this.depositoInicial = depositoInicial;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getDepositoInicial() {
		return depositoInicial;
	}

	public void setDepositoInicial(double depositoInicial) {
		this.depositoInicial = depositoInicial;
	}
	
	public String toString() {
		return "";
	}
	
	
	
	
}
