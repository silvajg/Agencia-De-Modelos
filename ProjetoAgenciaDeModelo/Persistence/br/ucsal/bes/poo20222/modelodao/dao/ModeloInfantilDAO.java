package br.ucsal.bes.poo20222.modelodao.dao;

import java.util.ArrayList;
import java.util.List;
import br.ucsal.bes.poo20222.modeloinfantil.domain.ModeloInfantil;


public class ModeloInfantilDAO {
	
	public static List<ModeloInfantil> modelosinfantil = new ArrayList<>();

	public static void incluir(ModeloInfantil modeloInfantil) {
		modelosinfantil.add(modeloInfantil);
	}

}
