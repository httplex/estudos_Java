package lista02.ex04;

public class Post {
	String texto, link;
	int numeroCurtidas, numeroCompartilhamentos;
	
	public Post(String texto, String link, int numeroCurtidas, int numeroCompartilhamento) {
		this.texto = texto;
		this.link = link;
		this.numeroCurtidas = numeroCurtidas;
		this.numeroCompartilhamentos = numeroCompartilhamento;
	}
	
	public void curtir() {
		numeroCurtidas++;
	}
	
	public void compartilhar() {
		numeroCompartilhamentos++;
	}
	
	public String toString() {
		return "Dados do Post: " + 
				"Curtidas: " + numeroCurtidas +
				"";
	}
}
