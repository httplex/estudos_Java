package unDF.ExOO.ex02;

public class Fisico extends Livro{
	double peso;
	double largura, altura, espessura;
	
	public Fisico(String titulo, String autor, int anoPublicacao, int iSBN, double peso, double largura, double altura,
			double espessura) {
		super(titulo, autor, anoPublicacao, iSBN);
		this.peso = peso;
		this.largura = largura;
		this.altura = altura;
		this.espessura = espessura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getEspessura() {
		return espessura;
	}

	public void setEspessura(double espessura) {
		this.espessura = espessura;
	}
	
	
}
