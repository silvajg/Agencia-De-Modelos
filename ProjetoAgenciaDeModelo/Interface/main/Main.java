package main;

import java.util.Scanner;

import br.ucsal.bes.poo20222.contratarmodelo.domain.ContratarModelo;
import br.ucsal.bes.poo20222.modelodao.dao.ModeloDAO;
import br.ucsal.bes.poo20222.modelodao.dao.ModeloInfantilDAO;
import br.ucsal.bes.poo20222.modelodao.dao.ModeloMasculinoDAO;
import br.ucsal.bes.poo20222.negocioexception.exception.NegocioException;
import br.ucsal.bes.poo20222.tui.interfaces.ModeloInfantilTUI;
import br.ucsal.bes.poo20222.tui.interfaces.ModeloMasculinoTUI;
import br.ucsal.bes.poo20222.tui.interfaces.ModeloTUI;


public class Main {
	
	static Scanner read = new Scanner(System.in);
	
	public static void main(String[] args) throws NegocioException {
		
	      Menu();
		
	}
	
	public static void Menu() throws NegocioException {
		
		int i = 0;
		
		do {
			System.out.println("\n********** SISTEMA DE CADASTRO DE MODELOS ********** AGENCIA MODELO **********\n");
			System.out.println("Digite 1 caso queira cadastrar uma modelo, 2 para cadastrar um modelo masculino, 3 para cadastrar uma/um modelo infantil, \n"
					+ "4 para contratar modelo, 5 para mostrar modelos femininas cadastradas, 6 para mostrar modelos masculinos cadastrados, \n"
					+ "7 para mostrar modelos infantis cadastradas ou 8 para 'SAIR' da página -->\n");
			System.out.println(" (1) Cadastrar Modelo Feminino");
			System.out.println(" (2) Cadastrar Modelo Masculino");
			System.out.println(" (3) Cadastrar Modelo Infantil");
			System.out.println(" (4) Contratar Modelo");
			System.out.println(" (5) Mostrar Modelos Femininas Cadastradas" );
			System.out.println(" (6) Mostrar Modelos Masculinos Cadastrados");
			System.out.println(" (7) Mostrar Modelos Infantis Cadastradas");
			System.out.println(" (8) SAIR");
			System.out.println("\nEscolha uma opção: ");
			int opcao = read.nextInt();
			
		    switch(opcao) {
		    case 1:
		    	System.out.println("\n*********************************************\n");
		    	System.out.println("SISTEMA DE CADASTRO DE MODELO");
		    	System.out.println("\n*********************************************\n");
		    	ModeloTUI.cadastroDeModelos();
		    	break;
		     case 2:
		    	System.out.println("\n*********************************************\n");
		        System.out.println("SISTEMA DE CADASTRO DE MODELO MASCULINO");
		        System.out.println("\n*********************************************\n");
		    	ModeloMasculinoTUI.cadastroDeModelosMasculino();
		        break;
		     case 3:
		    	System.out.println("\n*********************************************\n");
		    	 System.out.println("SISTEMA DE CADASTRO DE MODELO INFANTIL");
		    	 System.out.println("\n*********************************************\n");
		    	 ModeloInfantilTUI.cadastroDeModelosInfantil();
		    	break;
		    case 4:
		    	System.out.println("\n*********************************************\n");
		    	System.out.println("SISTEMA DE CONTRATO DE MODELO");
		    	System.out.println("\n*********************************************\n");
		    	new ContratarModelo(read);
		    	break;
		    case 5:
		    	System.out.println("\n*********************************************\n");
		    	System.out.println("TODAS AS MODELOS FEMININAS CADASTRADAS: ");
		    	System.out.println("\n*********************************************\n");
		    	for (int j = 0; j < ModeloDAO.modelos.size(); j++) {
		    		ModeloTUI.apresentarAgenciaModelo(ModeloDAO.modelos.get(j));
				}
		    	break;
		    case 6:
		    	System.out.println("\n*********************************************\n");
		    	System.out.println("TODOS OS MODELOS MASCULINOS CADASTRADOS: ");
		    	System.out.println("\n*********************************************\n");
		    	for (int j = 0; j < ModeloMasculinoDAO.modelosmasculino.size(); j++) {
		    		ModeloMasculinoTUI.apresentarAgenciaModelo(ModeloMasculinoDAO.modelosmasculino.get(j));
				}
		    	break;
		    case 7:
		    	System.out.println("\n*********************************************\n");
		    	System.out.println("TODOS(AS) OS(AS) MODELOS INFANTIS CADASTRADOS(AS): ");
		    	System.out.println("\n*********************************************\n");
		    	for (int j = 0; j < ModeloInfantilDAO.modelosinfantil.size(); j++) {
		    		ModeloInfantilTUI.apresentarAgenciaModelo(ModeloInfantilDAO.modelosinfantil.get(j));
				}
		    	break;
		    case 8:
		    	System.out.println("\n*********************************************\n");
		    	System.out.println("\n\nOpção: Sair! ***** \n\nSaindo da página...  ***** \n\nVocê saiu da página!");
		    	System.out.println("\n*********************************************\n");
		    	System.exit(0);
		    	break;
		    default:
		    	System.out.println("\n*********************************************\n");
		    	System.out.println("\n\nOpção inválida, tente novamente.\n\n");
		    	System.out.println("\n*********************************************\n");
		    }
		} while (i == 0);
		
		
		
		
		
		
	}
	
}


