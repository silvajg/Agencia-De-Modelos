package br.ucsal.bes.poo20222.modeloinfantil.domain;

import br.ucsal.bes.poo20222.agenciamodelo.domain.AgenciaModelo;
import br.ucsal.bes.poo20222.negocioexception.exception.NegocioException;

public class ModeloInfantil extends AgenciaModelo {

	private String nome;
	private String nacionalidade;
	private String biotipo;
	private Integer idade;
	private Integer concurso;
	private Double altura;
    private Double peso;
	
    public ModeloInfantil(double salario, String nomeAgencia, String grife, String nome, String nacionalidade, String biotipo, Integer idade, Integer concurso,
			Double altura, Double peso) throws NegocioException {
		super(salario, nomeAgencia, grife);
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.biotipo = biotipo;
		this.idade = idade;
		this.concurso = concurso;
		this.altura = altura;
		this.peso = peso;
	}
    
    public ModeloInfantil() {
    	
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
		
		if(this.peso <= 23){
			this.biotipo = "Modelo infantil de corpo retangulo.";
	        } else if(this.peso <= 49){
	        	this.biotipo = "Modelo infantil de corpo ampulheta.";
	        }else if(this.peso <= 100){
	        	this.biotipo = "Modelo infantil de corpo oval/plus size.";
	        }else{
	            throw new NegocioException("A(O) modelo infantil inserida(o) não pode ter menos de 0kg ou mais de 200kg. É impossível ou totalmente fora do padrao.");   
	        }
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	

	public Integer getConcurso() {
		return concurso;
	}

	public void setConcurso(Integer concurso) {
		this.concurso = concurso;
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
		return "ModeloInfantil [nome=" + nome + ", nacionalidade=" + nacionalidade + ", biotipo=" + biotipo + ", idade="
				+ idade + ", concurso=" + concurso + ", altura=" + altura + ", peso=" + peso + "]";
	}
	
	
    
}
	

