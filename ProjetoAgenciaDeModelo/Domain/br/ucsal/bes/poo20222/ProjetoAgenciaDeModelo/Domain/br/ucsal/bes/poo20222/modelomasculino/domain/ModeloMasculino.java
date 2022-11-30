package br.ucsal.bes.poo20222.modelomasculino.domain;

import br.ucsal.bes.poo20222.agenciamodelo.domain.AgenciaModelo;
import br.ucsal.bes.poo20222.negocioexception.exception.NegocioException;

public class ModeloMasculino extends AgenciaModelo {
	
	private String nome;
	private String nacionalidade;
	private String biotipo;
	private Integer idade;
	private Double altura;
    private Double peso;
	
    public ModeloMasculino(double salario, String nomeAgencia, String grife, String nome, String nacionalidade, String biotipo, Integer idade,
			Double altura, Double peso) throws NegocioException {
		super(salario, nomeAgencia, grife);
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.biotipo = biotipo;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
	}
    
    public ModeloMasculino() {
    	
    }
  
	public String getNome() {
    	return nome;
    }
    
    public void setNome(String nome) {
    	this.nome = nome;
    }

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getBiotipo() {
		return biotipo;
	}

	private void setBiotipo() throws NegocioException {
		
		if(this.peso <= 70){
			this.biotipo = "Modelo de corpo retangulo/ectomorfo.";
	        } else if(this.peso <= 90){
	        	this.biotipo = "Modelo de corpo ampulheta/mesomorfo.";
	        }else if(this.peso <= 200){
	        	this.biotipo = "Modelo de corpo oval/endomorfo.";
	        }else{
	            throw new NegocioException("O modelo inserido não pode ter menos de 0kg ou mais de 200kg. É impossível ou totalmente fora do padrao.");   
	        }
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) throws NegocioException {
		this.peso = peso;
		this.setBiotipo();
	}

	@Override
	public String toString() {
		return "ModeloMasculino [nome=" + nome + ", nacionalidade=" + nacionalidade + ", biotipo=" + biotipo
				+ ", idade=" + idade + ", altura=" + altura + ", peso=" + peso + "]";
	}
	
	

}
