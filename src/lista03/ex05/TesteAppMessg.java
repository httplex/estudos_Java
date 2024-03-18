package lista03.ex05;

public class TesteAppMessg {

		    public static void main(String[] args) {
		    	 Contato contato = new Contato("Kim Jennie");

		         contato.enviarMensagem("Olá, tudo bem?");
		         
		         contato.mostrarQuantidadeMensagensNaoLidas();
		        		 
		         contato.receberMensagens(5);

		         contato.mostrarQuantidadeMensagensNaoLidas();

		         contato.mostrarMensagensNaoLidas();
		     }
		
	}
