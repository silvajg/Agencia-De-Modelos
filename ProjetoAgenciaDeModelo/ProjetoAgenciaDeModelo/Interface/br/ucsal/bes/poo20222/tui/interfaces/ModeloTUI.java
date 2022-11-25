package br.ucsal.bes.poo20222.tui.interfaces;

import java.util.*;

import br.ucsal.bes.poo20222.modelo.domain.*;
import br.ucsal.bes.poo20222.negocioexception.exception.*;
import br.ucsal.bes.poo20222.modelodao.dao.*;

public class ModeloTUI extends Modelo {

	private static Scanner sc = new Scanner(System.in);
	
	public static void cadastroDeModelos() throws NegocioException {
		
		System.out.println("--------------------------------------------------");
        System.out.println("Informe quantas(os) modelos serao cadastradas(os): ");
        
       
        int numModelos = Integer.parseInt(sc.nextLine());
        int k = 1;   

        for (int i = 0; i < numModelos; i++) {
        	
        	Modelo m = new Modelo();
        	
        	System.out.println("\n--------------------------------------------------\n");
        	System.out.println("Informe o salario da(o) modelo numero: " + k);
        	m.setSalario(Double.parseDouble(sc.nextLine()));
        	System.out.println("\n--------------------------------------------------\n");
        	System.out.println("Informe o nome da(o) modelo numero: " + k);
            m.setNome(sc.nextLine());
            System.out.println("\n--------------------------------------------------\n");
            System.out.println("Informe o nome da agencia da(o) modelo numero: " + k);
            m.setNomeAgencia(sc.nextLine());
            System.out.println("\n--------------------------------------------------\n");
            System.out.println("Informe a nacionalidade da(o) modelo numero: " + k);
            m.setNacionalidade(sc.nextLine());
            System.out.println("\n--------------------------------------------------\n");
            System.out.println("Informe a idade da(o) modelo numero: " + k);  
            m.setIdade(Integer.parseInt(sc.nextLine()));
            System.out.println("\n--------------------------------------------------\n");
            System.out.println("Informe a altura da(o) modelo numero: " + k);
            m.setAltura(Double.parseDouble(sc.nextLine()));
            System.out.println("\n--------------------------------------------------\n");
            System.out.println("Informe o peso da(o) modelo numero: " + k);
            m.setPeso(Double.parseDouble(sc.nextLine()));
            System.out.println("\n--------------------------------------------------\n");
            System.out.println("Informe o nome da grife da(o) modelo numero: " + k);
            m.setGrife(sc.nextLine());
            System.out.println("\n--------------------------------------------------\n");
            
            ModeloDAO.incluir(m);

           
            k++;
        }
        System.out.println("\n--------------------------------------------------\n");
        System.out.println("Aqui estao todas(os) as(os) modelos cadastradas(os): ");
        int n = 1;
        
        
        for (int i = 0; i < ModeloDAO.modelos.size(); i++) {
        	
        	System.out.println("\n--------------------------------------------------\n");
            System.out.println("Aqui estao os dados da(o) modelo numero: " + n);
            apresentarAgenciaModelo(ModeloDAO.modelos.get(i));
            mostrarModelo(ModeloDAO.modelos.get(i));

            n++;

        }

    }
  
    public static void apresentarAgenciaModelo(Modelo modelo) {
    	System.out.println("\n---------------Dados--Gerais---------------\n");
        System.out.println("\n----------Apresentacao--Da(o)--Modelo----------\n");
        System.out.println("Nome: " + modelo.getNome() + ".");
        System.out.println("Nacionalidade: " + modelo.getNacionalidade() + ".");
        System.out.println("Possui " + modelo.getIdade() + " anos.");
        System.out.println("Tem " + modelo.getAltura() + " metros de altura!");
        System.out.println("Pesa " + modelo.getPeso() + " KGs.");
        System.out.println("Contratada(o) da marca " + modelo.getGrife() + ".");
        System.out.println("Agenciada(o) por " + modelo.getNomeAgencia() + ".");
        System.out.println("Biotipo: " + modelo.getBiotipo() + ".");
        System.out.println("Salario de: " + modelo.getSalario() + ".\n");

    }
    
    public static void mostrarModelo(Modelo modelo) {
    	System.out.println("\n---------------Dados--Importantes---------------\n");
        System.out.println("\n----------Mostrar--Modelo----------\n");
        System.out.println(modelo.getNome());
        System.out.println("Ela/Ele é " + modelo.getBiotipo() + ".");
        System.out.println("Possui " + modelo.getIdade() + " anos.");
        System.out.println("Agenciada(o) por " + modelo.getNomeAgencia() + ".");
        System.out.println("Nacionalidade: " + modelo.getNacionalidade() + ".\n");

    }

		
	}
	


