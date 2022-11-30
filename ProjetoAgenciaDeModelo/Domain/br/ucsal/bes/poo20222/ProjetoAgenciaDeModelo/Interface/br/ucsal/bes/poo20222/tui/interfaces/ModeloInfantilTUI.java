package br.ucsal.bes.poo20222.tui.interfaces;

import java.util.Scanner;

import br.ucsal.bes.poo20222.negocioexception.exception.*;
import br.ucsal.bes.poo20222.modelodao.dao.*;
import br.ucsal.bes.poo20222.modeloinfantil.domain.ModeloInfantil;

public class ModeloInfantilTUI {
	
private static Scanner sc = new Scanner(System.in);
	
	public static void cadastroDeModelosInfantil() throws NegocioException {
		
		System.out.println("--------------------------------------------------");
        System.out.println("Informe quantas(os) modelos infantis serao cadastradas(os): ");
        
       
        int numModelosInfantil = Integer.parseInt(sc.nextLine());
        int k = 1;   

        for (int i = 0; i < numModelosInfantil; i++) {
        	
        	ModeloInfantil mi = new ModeloInfantil();
        	
        	System.out.println("\n--------------------------------------------------\n");
        	System.out.println("Informe o salario da(o) modelo infantil numero: " + k);
        	mi.setSalario(Integer.parseInt(sc.nextLine()));
        	System.out.println("\n--------------------------------------------------\n");
        	System.out.println("Informe o nome da(o) modelo infantil numero: " + k);
            mi.setNome(sc.nextLine());
            System.out.println("\n--------------------------------------------------\n");
            System.out.println("Informe o nome da agencia da(o) modelo infantil numero: " + k);
            mi.setNomeAgencia(sc.nextLine());
            System.out.println("\n--------------------------------------------------\n");
            System.out.println("Informe a nacionalidade da(o) modelo infantil numero: " + k);
            mi.setNacionalidade(sc.nextLine());
            System.out.println("\n--------------------------------------------------\n");
            System.out.println("Informe a idade da(o) modelo infantil numero: " + k);  
            mi.setIdade(Integer.parseInt(sc.nextLine()));
            System.out.println("\n--------------------------------------------------\n");
            System.out.println("Informe a altura da(o) modelo infantil numero: " + k);
            mi.setAltura(Double.parseDouble(sc.nextLine()));
            System.out.println("\n--------------------------------------------------\n");
            System.out.println("Informe o peso da(o) modelo infantil numero: " + k);
            mi.setPeso(Double.parseDouble(sc.nextLine()));
            System.out.println("\n--------------------------------------------------\n");
            System.out.println("Informe a quantidade de concursos ganhos pelo(a) modelo infantil numero: " + k);
            mi.setConcurso(Integer.parseInt(sc.nextLine()));
            System.out.println("\n--------------------------------------------------\n");
            
            ModeloInfantilDAO.incluir(mi);

           
            k++;
        }
    }
  
    public static void apresentarAgenciaModelo(ModeloInfantil modeloInfantil) {
    	System.out.println("\n---------------Dados--Gerais---------------\n");
        System.out.println("\n----------Apresentacao--Da(o)--Modelo--Infantil--------\n");
        System.out.println("Salario: " + modeloInfantil.getSalario() + ".");
        System.out.println("Nome: " + modeloInfantil.getNome() + ".");
        System.out.println("Nacionalidade: " + modeloInfantil.getNacionalidade() + ".");
        System.out.println("Possui " + modeloInfantil.getIdade() + " anos.");
        System.out.println("Tem " + modeloInfantil.getAltura() + " metros de altura!");
        System.out.println("Pesa " + modeloInfantil.getPeso() + " KGs.");
        System.out.println("Agenciada(o) por " + modeloInfantil.getNomeAgencia() + ".");
        System.out.println("Biotipo: " + modeloInfantil.getBiotipo() + ".");
        System.out.println("Concursos ganhos: " + modeloInfantil.getConcurso() + ".");
        String disponivel = "Está Disponivel Para Trabalho";
        if(!modeloInfantil.isDisponibilidade()) 
        	disponivel = "Está trabalhando na empresa " + modeloInfantil.getEmpresa();
        
        System.out.println(disponivel);
    }


}
