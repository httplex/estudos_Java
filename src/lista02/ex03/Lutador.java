package lista02.ex03;

public class Lutador {
	String nome;
	int energia, forca;
	
	public Lutador(String nome, int energia, int forca) {
		this.nome = nome;
		this.energia = energia;
		this.forca = forca;
	}
	
	public void reduzirEnergia(int quantidade) {
		if(quantidade > energia) {
			energia = 0;
		} else {
			energia -= quantidade;
		}
	}
	
	public void aplicarGolpe(Lutador outroLutador) {
		int quantidadeDeEnergiaReduzida = forca * 2;
		outroLutador.reduzirEnergia(quantidadeDeEnergiaReduzida);
	}
	
	public String toString() {
		return "Dados do Lutador: " + 
				"Nome: " + nome +
				"Energia: " + energia +
				"Força: " + forca ;
	}
}
