package lista03.ex03;

public class Aviao {
	public int altitudeKM, velocidadeKMh;
	
	public Aviao(int velocidadeKM, int altitudeKMh) {
		this.altitudeKM = altitudeKMh;
		this.velocidadeKMh = velocidadeKM;
	}
	
	public int getAltitudeKM() {
		return altitudeKM;
	}

	public void setAltitudeKM(int altitudeKM) {
		if(altitudeKM < 0) {
			altitudeKM = 0;
		}
		this.altitudeKM = altitudeKM;
	}

	public int getVelocidadeKMh() {
		return velocidadeKMh;
	}

	public void setVelocidadeKMh(int velocidadeKMh) {
		this.velocidadeKMh = velocidadeKMh;
	}

	public int reduzirAltitude(int reduzirAlt) {
		setAltitudeKM(altitudeKM - reduzirAlt);
		return getVelocidadeKMh(); 
	}
	
	public int reduzirVelocidade(int reduzirVel) {
		setVelocidadeKMh(velocidadeKMh - reduzirVel);
		return getVelocidadeKMh(); 
	}
	
	public String toString() {
		return  "Dados do avião: " + 
				"\nAltitude: " + altitudeKM + " Km" +
				"\nVelocidade: " + velocidadeKMh + " Km/h";
	}
	
}
