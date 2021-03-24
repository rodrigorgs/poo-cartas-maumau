package br.ufba.poo.maumau;

public class Baralho {
	private Carta[] cartas = new Carta[52];
	
	public Baralho() {
		int i = 0;
		for (Naipe naipe : Naipe.values()) {
			for (Valor valor : Valor.values()) {
				Carta carta = new Carta(naipe, valor);
				cartas[i] = carta;
				i++;
			}
		}
	}
	
	public Carta getCartaNaPosicao(int pos) {
		return cartas[pos];
	}
}
