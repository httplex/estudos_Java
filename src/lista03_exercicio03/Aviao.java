package lista03_exercicio03;

public class Aviao {
	int altitudeKM, velocidadeKMh;
	
	public Aviao(int velocidadeKM, int altitudeKMh) {
		this.altitudeKM = altitudeKMh;
		this.velocidadeKMh = velocidadeKM;
	}
	
	public int reduzirAltitude(int reduzirAlt) {
		return altitudeKM = altitudeKM - reduzirAlt; 
	}
	
	public int reduzirVelocidade(int reduzirVel) {
		return velocidadeKMh = velocidadeKMh - reduzirVel; 
	}
	
	public String toString() {
		return  "Dados do avião: " + 
				"\nAltitude: " + altitudeKM + " Km" +
				"\nVelocidade: " + velocidadeKMh + " Km/h";
	}
	
}
