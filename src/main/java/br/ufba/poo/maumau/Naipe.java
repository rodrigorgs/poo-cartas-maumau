package br.ufba.poo.maumau;

public enum Naipe {
    PAUS("♣"),
    COPAS("♥"),
    ESPADAS("♠"),
    OUROS("♦");
    
	private String representacao;
	
    private Naipe(String representacao) {
    	this.representacao = representacao;
    }
    
    public CorNaipe getCor() {
    	if (this == PAUS || this == ESPADAS) {
    		return CorNaipe.PRETO;
    	} else {
    		return CorNaipe.VERMELHO;
    	}
    }
    
    @Override
    public String toString() {
    	return representacao;
    }
}

/*
public class Naipe {
	public static final Naipe PAUS = new Naipe("♣");
	public static final Naipe COPAS = new Naipe("..");
	public static final Naipe ESPADAS = new Naipe("...");
	public static final Naipe OUROS = new Naipe("...");
	
	private String representacao;
	
    private Naipe(String representacao) {
    	this.representacao = representacao;
    }
    
    public String getRepresentacao() {
    	return representacao;
    }
}

*/