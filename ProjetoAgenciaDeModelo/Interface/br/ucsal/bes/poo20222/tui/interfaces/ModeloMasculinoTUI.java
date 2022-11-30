package br.ucsal.bes.poo20222.tui.interfaces;

import java.util.Scanner;

import br.ucsal.bes.poo20222.negocioexception.exception.*;
import br.ucsal.bes.poo20222.modelodao.dao.*;
import br.ucsal.bes.poo20222.modelomasculino.domain.ModeloMasculino;

public class ModeloMasculinoTUI {
	
private static Scanner sc = new Scanner(System.in);
	
	public static void cadastroDeModelosMasculino() throws NegocioException {
		
		System.out.println("--------------------------------------------------");
        System.out.println("Informe quantos modelos masculinos serao cadastrados: ");
        
       
        int numModelosMasculino = Integer.parseInt(sc.nextLine());
        int k = 1;   

        for (int i = 0; i < numModelosMasculino; i++) {
        	
        	ModeloMasculino mm = new ModeloMasculino();
        	
        	System.out.println("\n--------------------------------------------------\n");
        	System.out.println("Informe o salario do modelo numero: " + k);
        	mm.setSalario(Double.parseDouble(sc.nextLine()));
        	System.out.println("\n--------------------------------------------------\n");
        	System.out.println("Informe o nome do modelo numero: " + k);
            mm.setNome(sc.nextLine());
            System.out.println("\n--------------------------------------------------\n");
            System.out.println("Informe o nome da agencia do modelo numero: " + k);
            mm.setNomeAgencia(sc.nextLine());
            System.out.println("\n--------------------------------------------------\n");
            System.out.println("Informe a nacionalidade do modelo numero: " + k);
            mm.setNacionalidade(sc.nextLine());
            System.out.println("\n--------------------------------------------------\n");
            System.out.println("Informe a idade do modelo numero: " + k);  
            mm.setIdade(Integer.parseInt(sc.nextLine()));
            System.out.println("\n--------------------------------------------------\n");
            System.out.println("Informe a altura do modelo numero: " + k);
            mm.setAltura(Double.parseDouble(sc.nextLine()));
            System.out.println("\n--------------------------------------------------\n");
            System.out.println("Informe o peso do modelo numero: " + k);
            mm.setPeso(Double.parseDouble(sc.nextLine()));
            System.out.println("\n--------------------------------------------------\n");
            System.out.println("Informe o nome da grife patrocinadora do modelo numero: " + k);
            mm.setGrife(sc.nextLine());
            System.out.println("\n--------------------------------------------------\n");
            
            ModeloMasculinoDAO.incluir(mm);

           
            k++;
        }
       

    }
  
    public static void apresentarAgenciaModelo(ModeloMasculino modeloMasculino) {
    	System.out.println("\n---------------Dados--Gerais---------------\n");
        System.out.println("\n----------Apresentacao--Do--Modelo--Masculino--------\n");
        System.out.println("Nome: " + modeloMasculino.getNome() + ".");
        System.out.println("Nacionalidade: " + modeloMasculino.getNacionalidade() + ".");
        System.out.println("Possui " + modeloMasculino.getIdade() + " anos.");
        System.out.println("Tem " + modeloMasculino.getAltura() + " metros de altura!");
        System.out.println("Pesa " + modeloMasculino.getPeso() + " KGs.");
        System.out.println("Patrocinado da marca " + modeloMasculino.getGrife() + ".");
        System.out.println("Agenciado por " + modeloMasculino.getNomeAgencia() + ".");
        System.out.println("Biotipo: " + modeloMasculino.getBiotipo() + ".");
        System.out.println("Salario de: " + modeloMasculino.getSalario() + ".\n");
        String disponivel = "Está Disponivel Para Trabalho";
        if(!modeloMasculino.isDisponibilidade()) 
        	disponivel = "Está trabalhando na empresa " + modeloMasculino.getEmpresa();
        
        System.out.println(disponivel);

    }
    
 

}
