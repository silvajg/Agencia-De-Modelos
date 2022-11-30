package br.ucsal.bes.poo20222.modelodao.dao;

import java.util.ArrayList;
import java.util.List;
import br.ucsal.bes.poo20222.modelomasculino.domain.ModeloMasculino;

public class ModeloMasculinoDAO {

	public static List<ModeloMasculino> modelosmasculino = new ArrayList<>();

	public static void incluir(ModeloMasculino modeloMasculino) {
		modelosmasculino.add(modeloMasculino);
	}
	
}
