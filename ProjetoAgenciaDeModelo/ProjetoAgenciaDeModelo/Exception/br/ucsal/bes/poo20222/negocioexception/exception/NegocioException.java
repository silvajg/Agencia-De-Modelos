package br.ucsal.bes.poo20222.negocioexception.exception;

public class NegocioException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public NegocioException(String message) {
		super(message);
	}

	public NegocioException(String message, Exception e) {
		super(message, e);
	}

}
