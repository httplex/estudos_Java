package lista02_exercicio04;

public class TesteFacebook {

	public static void main(String[] args) {
		Post post1 = new Post("Você é capaz de tudo, acredite!", "https://universidade.df.gov.br", 5, 10);
		
		post1.curtir();
		post1.curtir();
		post1.curtir();
		
		System.out.println("Número de curtidas do post: " + post1.numeroCurtidas);
	
		post1.compartilhar();
		post1.compartilhar();
		
		System.out.println("Número de compartilhamentos do post: " + post1.numeroCompartilhamentos);
	
	}

}
