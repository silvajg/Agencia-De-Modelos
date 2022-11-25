package br.ucsal.bes.poo20222.tui.interfaces;

public enum EscolherMenuComEnum {
	
	CADASTRAR_MODELO(1, " Informar Modelo."),
	SAIR(2, " \n \n Sair! ***** \n \n Saindo da página...  ***** \n \n Você saiu da página!");
	
	private int numero;
	private String texto;
	
	private EscolherMenuComEnum(int numero, String texto) {
		this.numero = numero;
		this.texto = texto;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	
	
	

}
