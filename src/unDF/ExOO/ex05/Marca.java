package unDF.ExOO.ex05;

import java.util.HashSet;
import java.util.Set;

public class Marca {
	private Set <String> nomeMarca;

	public Marca(Set<String> nomeMarca) {
		this.nomeMarca = new HashSet <>();
	}

	public Set<String> getNomeMarca() {
		return nomeMarca;
	}

	public void setNomeMarca(Set<String> nomeMarca) {
		this.nomeMarca = nomeMarca;
	}
	
	public void adicionarMarca(String nomeMarca) {
		this.nomeMarca.add(nomeMarca);
	}
	
	
}
