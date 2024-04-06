package cursoUdemy.exe05;

public class Conta {
	private int numeroConta;
	private String nomeTitular;
	private double saldo;
	
	public Conta(int numeroConta, String nomeTitular) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
	}
	
	public Conta(int numeroConta, String nomeTitular, double depositoInicial) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		depositar(depositoInicial); //melhor pra regra de negócio
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void depositar(double quantia) {
		saldo += quantia;
	}
	
	public void sacar(double quantia) {
		saldo -= quantia + 5.0;
	}
	
	public String toString() {
		return  "Conta " + numeroConta +
				", Titular da conta: " + nomeTitular + 
				", Saldo: $ " + String.format("%.2f", saldo);
	}
	
	
	
	
}
