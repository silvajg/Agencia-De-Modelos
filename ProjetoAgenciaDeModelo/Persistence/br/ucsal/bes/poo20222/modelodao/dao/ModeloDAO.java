package br.ucsal.bes.poo20222.modelodao.dao;

import java.util.ArrayList;
import java.util.List;

import br.ucsal.bes.poo20222.modelo.domain.Modelo;

public class ModeloDAO {

	public static List<Modelo> modelos = new ArrayList<>();

	public static void incluir(Modelo modelo) {
		modelos.add(modelo);
	}

	
}
