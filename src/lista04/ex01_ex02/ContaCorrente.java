package lista04.ex01_ex02;

public class ContaCorrente extends Conta{
	
	public ContaCorrente(int numeroConta, double saldo) {
		super(numeroConta, saldo);
	}
	
	public String toString() {
		return  "Número da conta: " + numeroConta +
				"\nSaldo: " + saldo;
	}
}

