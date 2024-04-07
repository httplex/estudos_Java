package unDF.ExOO.ex02;

public class Digital extends Livro{
	String formato;
	String tamanho;
	
	public Digital(String titulo, String autor, int anoPublicacao, long iSBN, String formato, String tamanho) {
		super(titulo, autor, anoPublicacao, iSBN);
		this.formato = formato;
		this.tamanho = tamanho;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	
}
