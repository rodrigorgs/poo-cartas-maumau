package br.ufba.poo.maumau;

public enum Valor {
	AS("A"),
	DOIS("2"),
	TRES("3"),
	QUATRO("4"),
	CINCO("5"),
	SEIS("6"),
	SETE("7"),
	OITO("8"),
	NOVE("9"),
	DEZ("10"),
	VALETE("J"),
	DAMA("Q"),
	REI("K");
	
	private String representacao;
	
    private Valor(String representacao) {
    	this.representacao = representacao;
    }
    
    @Override
    public String toString() {
    	return representacao;
    }
}
