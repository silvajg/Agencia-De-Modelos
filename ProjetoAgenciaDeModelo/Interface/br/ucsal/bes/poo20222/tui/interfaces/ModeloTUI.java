package br.ucsal.bes.poo20222.tui.interfaces;

import java.util.*;

import br.ucsal.bes.poo20222.modelo.domain.*;
import br.ucsal.bes.poo20222.negocioexception.exception.*;
import br.ucsal.bes.poo20222.modelodao.dao.*;

public class ModeloTUI {

	private static Scanner sc = new Scanner(System.in);
	
	public static void cadastroDeModelos() throws NegocioException {
		
		System.out.println("--------------------------------------------------");
        System.out.println("Informe quantas modelos serao cadastradas: ");
        
       
        int numModelos = Integer.parseInt(sc.nextLine());
        int k = 1;   

        for (int i = 0; i < numModelos; i++) {
        	
        	Modelo m = new Modelo();
        	
        	System.out.println("\n--------------------------------------------------\n");
        	System.out.println("Informe o salario da modelo numero: " + k);
        	m.setSalario(Double.parseDouble(sc.nextLine()));
        	System.out.println("\n--------------------------------------------------\n");
        	System.out.println("Informe o nome da modelo numero: " + k);
            m.setNome(sc.nextLine());
            System.out.println("\n--------------------------------------------------\n");
            System.out.println("Informe o nome da agencia da modelo numero: " + k);
            m.setNomeAgencia(sc.nextLine());
            System.out.println("\n--------------------------------------------------\n");
            System.out.println("Informe a nacionalidade da modelo numero: " + k);
            m.setNacionalidade(sc.nextLine());
            System.out.println("\n--------------------------------------------------\n");
            System.out.println("Informe a idade da modelo numero: " + k);  
            m.setIdade(Integer.parseInt(sc.nextLine()));
            System.out.println("\n--------------------------------------------------\n");
            System.out.println("Informe a altura da modelo numero: " + k);
            m.setAltura(Double.parseDouble(sc.nextLine()));
            System.out.println("\n--------------------------------------------------\n");
            System.out.println("Informe o peso da modelo numero: " + k);
            m.setPeso(Double.parseDouble(sc.nextLine()));
            System.out.println("\n--------------------------------------------------\n");
            System.out.println("Informe o nome da grife patrocinadora da modelo numero: " + k);
            m.setGrife(sc.nextLine());
            System.out.println("\n--------------------------------------------------\n");
            
            ModeloDAO.incluir(m);

           
            k++;
        }
       
    }
  
    public static void apresentarAgenciaModelo(Modelo modelo) {
    	System.out.println("\n---------------Dados--Gerais---------------\n");
        System.out.println("\n----------Apresentacao--Da--Modelo----------\n");
        System.out.println("Nome: " + modelo.getNome() + ".");
        System.out.println("Nacionalidade: " + modelo.getNacionalidade() + ".");
        System.out.println("Possui " + modelo.getIdade() + " anos.");
        System.out.println("Tem " + modelo.getAltura() + " metros de altura!");
        System.out.println("Pesa " + modelo.getPeso() + " KGs.");
        System.out.println("Patrocinada da marca " + modelo.getGrife() + ".");
        System.out.println("Agenciada por " + modelo.getNomeAgencia() + ".");
        System.out.println("Biotipo: " + modelo.getBiotipo() + ".");
        System.out.println("Salario de: " + modelo.getSalario() + ".");
        String disponivel = "Está Disponivel Para Trabalho";
        if(!modelo.isDisponibilidade()) 
        	disponivel = "Está trabalhando na empresa " + modelo.getEmpresa();
        
        System.out.println(disponivel);

    }
    
		
	}
	


