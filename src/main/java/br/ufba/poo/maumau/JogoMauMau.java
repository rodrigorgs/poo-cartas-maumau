package br.ufba.poo.maumau;

import com.googlecode.lanterna.TextColor;

import br.ufba.myterminal.MyTerminal;
import br.ufba.poo.Ponto;
import br.ufba.poo.Retangulo;
import br.ufba.poo.Rotulo;

public class JogoMauMau {

	// Ponto(x, y)
	// Rotulo(origem, texto, corDeFrente, corDeFundo)
	// Retangulo(origem, cantoOposto/largura&altura, caractere, corDeFrente,
	// corDeFundo)
	public static void main(String[] args) {
		Baralho baralho = new Baralho();
		Carta carta = baralho.getCartaNaPosicao(20);

		CartaView[] maoDoJogador = new CartaView[] {
				new CartaView(baralho.getCartaNaPosicao(0)),
				new CartaView(baralho.getCartaNaPosicao(10)),
				new CartaView(baralho.getCartaNaPosicao(20)),
				new CartaView(baralho.getCartaNaPosicao(30)),
				new CartaView(baralho.getCartaNaPosicao(40))
		};
		
		for (int i = 0; i < maoDoJogador.length; i++) {
			maoDoJogador[i].setOrigem(new Ponto(1 + i * 6, 3));
		}

		Rotulo titulo = new Rotulo(new Ponto(1, 1), "Mau-mau: o jogo");
		
		// desenha
		
		MyTerminal terminal = new MyTerminal();

		titulo.desenha(terminal);
		for (CartaView view : maoDoJogador) {
			view.desenha(terminal);
		}
		
		terminal.draw();

	}

}
