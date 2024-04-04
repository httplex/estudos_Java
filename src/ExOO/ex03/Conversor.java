package ExOO.ex03;

public class Conversor {
public double valorEmGramas;
	
	Conversor(double valorEmGramas){
		this.valorEmGramas = valorEmGramas;
	}
	

	public double getValorEmGramas() {
		return valorEmGramas;
	}

	public void setValorEmGramas(double valorEmGramas) {
		this.valorEmGramas = valorEmGramas;
	}

	public double getValorUnidade() {
		return valorEmGramas;
	}

	public void setValorUnidade(double valorEmGramas) {
		this.valorEmGramas = valorEmGramas;
	}
	
	public double converterEmQuilogramas() {
		double valorConvertido = getValorUnidade() * 0.001;
		return valorConvertido;
	}
	
	public double converterEmLibras() {
		double valorConvertido = getValorUnidade() * 0.00220462;
		return valorConvertido;
	}
	
	public double converterEmOncas() {
		double valorConvertido = getValorUnidade() * 0.03527396;
		return valorConvertido;
	}
	
	public String toString() {
		return "";
	}
}
