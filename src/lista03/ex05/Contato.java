package lista03.ex05;

import java.util.ArrayList;
import java.util.List;

public class Contato {

	private String nome;
    private List<String> mensagensNaoLidas;

    public Contato(String nome) {
        this.nome = nome;
        this.mensagensNaoLidas = new ArrayList<>();
    }

    public void enviarMensagem(String mensagem) {
        System.out.println("Mensagem enviada para " + nome + ": " + mensagem);
        mensagensNaoLidas.add(mensagem);
    }

    public int getQuantidadeMensagensNaoLidas() {
        return mensagensNaoLidas.size();
    }

    public void receberMensagens(int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            String mensagem = (i + 1) + " Mensagem " + " de " + nome;
            System.out.println("Mensagem recebida de " + nome + ": " + mensagem);
            mensagensNaoLidas.add(mensagem);
        }
    }

    public void mostrarMensagensNaoLidas() {
        System.out.println("Mensagens não lidas de " + nome + ":");
        for (String mensagem : mensagensNaoLidas) {
            System.out.println(mensagem);
        }
    }

    public void mostrarQuantidadeMensagensNaoLidas() {
        System.out.println("Quantidade de mensagens não lidas com " + nome + ": " + getQuantidadeMensagensNaoLidas() + "\n");
    }
}
