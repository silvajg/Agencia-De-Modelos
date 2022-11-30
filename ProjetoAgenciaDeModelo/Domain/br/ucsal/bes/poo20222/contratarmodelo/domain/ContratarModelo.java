package br.ucsal.bes.poo20222.contratarmodelo.domain;

import java.util.Scanner;

import br.ucsal.bes.poo20222.modelo.domain.Modelo;
import br.ucsal.bes.poo20222.modelodao.dao.ModeloDAO;
import br.ucsal.bes.poo20222.modelodao.dao.ModeloInfantilDAO;
import br.ucsal.bes.poo20222.modelodao.dao.ModeloMasculinoDAO;
import br.ucsal.bes.poo20222.modeloinfantil.domain.ModeloInfantil;
import br.ucsal.bes.poo20222.modelomasculino.domain.ModeloMasculino;
import br.ucsal.bes.poo20222.tui.interfaces.ModeloInfantilTUI;
import br.ucsal.bes.poo20222.tui.interfaces.ModeloMasculinoTUI;
import br.ucsal.bes.poo20222.tui.interfaces.ModeloTUI;

public class ContratarModelo {
      private String tipoModelo;
      private String empresaNome;
      private int modeloEscolhido;
     
      //construtor que inicia o metodo
      //scanner pra n precisar criar outro objeto nesta classe
      public ContratarModelo(Scanner sc) {
    	  contratarModelo(sc);
      }
     
      public void contratarModelo(Scanner sc) {
    	  System.out.println("Informe o nome da sua empresa ");
    	  String empresaNome = sc.next();
    	  int aux = 1;
    	  //pega o nome alterado e altera na classe
    	  setEmpresaNome(empresaNome);
    	  System.out.println();
    	  System.out.println("*********************************************");
    	  System.out.println("Informe o tipo de modelo que está procurando\n");
    	  System.out.println("1 - Modelo Mulher");
    	  System.out.println("2 - Modelo Homem");
    	  System.out.println("3 - Modelo Infantil\n");
    	  //escolhe o tipo de modelo e verá todos os seus dados de acordo com o tipo de modelo escolhido
    	  int escolha = Integer.parseInt(sc.next());
    	  switch(escolha) {
    	  case 1:
    			System.out.println("*********************************************");
		    	System.out.println("TODAS AS MODELOS FEMININAS CADASTRADAS: ");
		    	tipoModelo = "Feminina";
		    	
		    	for (int j = 0; j < ModeloDAO.modelos.size(); j++) {
		    		System.out.println("-----------------------------------------------");
		    		System.out.println("\nModelo Numero " +  aux);
		    		ModeloTUI.apresentarAgenciaModelo(ModeloDAO.modelos.get(j));
		    		aux++;
				}
		    	break;
		    case 2:
		    	System.out.println("*********************************************");
		    	System.out.println("TODAS OS MODELOS MASCULINOS CADASTRADOS: ");
		    	tipoModelo = "Masculino";
		    	for (int j = 0; j < ModeloMasculinoDAO.modelosmasculino.size(); j++) {
		    		System.out.println("-----------------------------------------------");
		    		System.out.println("\nModelo Numero " + aux);
		    		ModeloMasculinoTUI.apresentarAgenciaModelo(ModeloMasculinoDAO.modelosmasculino.get(j));
		    		aux++;
				}
		    	break;
		    case 3:
		    	System.out.println("*********************************************");
		    	System.out.println("TODOS(AS) OS(AS) MODELOS INFANTIS CADASTRADOS(AS): ");
		    	tipoModelo = "Infantil";
		    	for (int j = 0; j < ModeloInfantilDAO.modelosinfantil.size(); j++) {
		    		System.out.println("-----------------------------------------------");
		    		System.out.println("\nModelo Numero " + aux);
		    		ModeloInfantilTUI.apresentarAgenciaModelo(ModeloInfantilDAO.modelosinfantil.get(j));
		    		aux++;
				}
		    	break;
    	  }
    	  System.out.println("\n*********************************************\n");
    	  System.out.println("DIGITE O NUMERO DO MODELO(A) ESCOLHIDO(A)");
    	  modeloEscolhido = Integer.parseInt(sc.next());
    	  //o numero que aparecer voce digita
    	  //dependendo do tipo de modelo, determinada arvore será acessada
    	  
    	  switch(tipoModelo) {
    	  		case "Feminina":
    	  			Modelo modeloEscolhida = ModeloDAO.modelos.get(modeloEscolhido-1);
    	  			if(modeloEscolhida.isDisponibilidade()) {
    	  				modeloEscolhida.setDisponibilidade(false);
    	  				modeloEscolhida.setEmpresa(getEmpresaNome());
    	  				System.out.println("*********************************************");
    	  				System.out.println("MODELO "  +modeloEscolhida.getNome()+ 
    	  						", CONTRATADA PARA A EMPRESA " + getEmpresaNome() + " COM SUCESSO");
    	  				System.out.println("\n*********************************************\n");
    	  			}else {
    	  				System.out.println("\n*********************************************\n");
    	  				System.out.println("MODELO NAO ESTA DISPONIVEL");
    	  				System.out.println("\n*********************************************\n");
    	  			}
    	  			break;
    	  		case "Masculino":
    	  			ModeloMasculino modeloMascEscolhida = ModeloMasculinoDAO.modelosmasculino.get(modeloEscolhido-1);
    	  			if(modeloMascEscolhida.isDisponibilidade()) {
    	  				modeloMascEscolhida.setDisponibilidade(false);
    	  				modeloMascEscolhida.setEmpresa(getEmpresaNome());
    	  				System.out.println("*********************************************");
    	  				System.out.println("MODELO "  +modeloMascEscolhida.getNome()+ 
    	  						", CONTRATADO PARA A EMPRESA " + getEmpresaNome() + " COM SUCESSO");
    	  				System.out.println("\n*********************************************\n");
    	  			}else {
    	  				System.out.println("\n*********************************************\n");
    	  				System.out.println("MODELO NAO ESTA DISPONIVEL");
    	  				System.out.println("\n*********************************************\n");
    	  			}
    	  			break;
    	  		case "Infantil":
    	  			ModeloInfantil modeloInfantEscolhida = ModeloInfantilDAO.modelosinfantil.get(modeloEscolhido-1);
    	  			if(modeloInfantEscolhida.isDisponibilidade()) {
    	  				modeloInfantEscolhida.setDisponibilidade(false);
    	  				modeloInfantEscolhida.setEmpresa(getEmpresaNome());
    	  				System.out.println("*********************************************");
    	  				System.out.println("MODELO: "  +modeloInfantEscolhida.getNome()+ 
    	  						", CONTRATADO PARA A EMPRESA " + getEmpresaNome() + " COM SUCESSO");
    	  				System.out.println("\n*********************************************\n");
    	  			}else {
    	  				System.out.println("\n*********************************************\n");
    	  				System.out.println("MODELO NAO ESTA DISPONIVEL");
    	  				System.out.println("\n*********************************************\n");
    	  			}
    	  			break;
    	  }
    	  
      }
      
      public String getTipoModelo() {
		return tipoModelo;
	}

	public void setTipoModelo(String tipoModelo) {
		this.tipoModelo = tipoModelo;
	}

	public String getEmpresaNome() {
		return empresaNome;
	}

	public void setEmpresaNome(String empresaNome) {
		this.empresaNome = empresaNome;
	}

	@Override
	public String toString() {
		return "ContratarModelo [tipoModelo=" + tipoModelo + ", empresaNome=" + empresaNome + ", modeloEscolhido="
				+ modeloEscolhido + "]";
	}

	
	
}
