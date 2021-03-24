package br.ufba.poo.maumau;

/**
 * 
 * @author rodrigorgs
 */
public class Carta {
	private Naipe naipe;
	private Valor valor;

	public Carta(Naipe naipe, Valor valor) {
		this.naipe = naipe;
		this.valor = valor;
	}

	public Naipe getNaipe() {
		return naipe;
	}

	public Valor getValor() {
		return valor;
	}

	@Override
	public String toString() {
		return "" + valor + naipe;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((naipe == null) ? 0 : naipe.hashCode());
		result = prime * result + ((valor == null) ? 0 : valor.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carta other = (Carta) obj;
		if (naipe != other.naipe)
			return false;
		if (valor != other.valor)
			return false;
		return true;
	}
	

}
