package br.ufba.poo.maumau;

import com.googlecode.lanterna.TextColor;

import br.ufba.myterminal.MyTerminal;
import br.ufba.poo.Ponto;
import br.ufba.poo.Retangulo;
import br.ufba.poo.Rotulo;

public class CartaView {
	private Carta carta;
	private Retangulo retangulo;
	private Rotulo rotulo;

	public CartaView(Carta carta) {
		super();
		this.carta = carta;

		TextColor cor = carta.getNaipe().getCor() == CorNaipe.PRETO ? TextColor.ANSI.BLACK : TextColor.ANSI.RED;

		retangulo = new Retangulo(new Ponto(0, 0), 5, 5);
		retangulo.setCaractere(' ');
		retangulo.setCorDeFundo(TextColor.ANSI.WHITE);

		rotulo = new Rotulo(retangulo.getOrigem().comDeslocamento(1, 1), carta.toString(), cor,
				TextColor.ANSI.WHITE);
	}

	public Ponto getOrigem() {
		return retangulo.getOrigem();
	}

	public void setOrigem(Ponto origem) {
		retangulo.setOrigem(origem);
		rotulo.setOrigem(origem.comDeslocamento(1, 1));
	}

	public Carta getCarta() {
		return carta;
	}

	public void desenha(MyTerminal terminal) {
		retangulo.desenha(terminal);
		rotulo.desenha(terminal);
	}
}
