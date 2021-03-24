package br.ufba.poo.maumau;

public class JogoPaciencia {

	public static void main(String[] args) {
		Baralho baralho1 = new Baralho();
		Baralho baralho2 = new Baralho();
		
		Carta carta1 = baralho1.getCartaNaPosicao(0);
		Carta carta2 = baralho2.getCartaNaPosicao(0);

		System.out.println(carta1);
		System.out.println(carta2);
		
		if (carta1.equals(carta2)) {
			System.out.println("iguais");
		} else {
			System.out.println("diferentes");
		}
	}

}
