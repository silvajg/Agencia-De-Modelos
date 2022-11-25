package br.ucsal.bes.poo20222.agenciamodelo.domain;

import br.ucsal.bes.poo20222.negocioexception.exception.NegocioException;

public class AgenciaModelo {
	
	private double salario;
	private String nomeAgencia;
	private String grife;
	
	public AgenciaModelo() {
		
	}
	
	public AgenciaModelo(double salario, String nomeAgencia, String grife) {
		try {
			setSalario(salario);
		} catch (NegocioException e) {
			e.printStackTrace();
		}
		setNomeAgencia(nomeAgencia);
	    setGrife(grife);
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(double salario) throws NegocioException{
		
		if(salario <= 0) {
			throw new NegocioException("O valor não pode ser menor ou igual a zero.");
		}
		
		this.salario = salario;
		
	}
	

	public String getNomeAgencia() {
		return nomeAgencia;
	}

	public void setNomeAgencia(String nomeAgencia) {
		this.nomeAgencia = nomeAgencia;
	}

	public String getGrife() {
		return grife;
	}

	public void setGrife(String grife) {
		this.grife = grife;
	}

	@Override
	public String toString() {
		return "AgenciaModelo [salario=" + salario + ", nomeAgencia=" + nomeAgencia + ", grife=" + grife + "]";
	}
	

}
