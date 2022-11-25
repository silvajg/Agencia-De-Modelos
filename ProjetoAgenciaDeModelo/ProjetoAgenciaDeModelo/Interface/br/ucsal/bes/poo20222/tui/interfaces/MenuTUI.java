package br.ucsal.bes.poo20222.tui.interfaces;

import java.util.Scanner;

import br.ucsal.bes.poo20222.negocioexception.exception.NegocioException;

public class MenuTUI {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void iniciarEscolha() throws NegocioException {
	
	int i = 0;

    do {

        for (EscolherMenuComEnum escolha : EscolherMenuComEnum.values()) {
            System.out.println(escolha);
        }

        System.out.println("Digite 'CADASTRAR_MODELO' caso queira cadastrar uma/um modelo ou 'SAIR' para sair da página --> ");
        String Escolha = sc.next();

        EscolherMenuComEnum opcao = EscolherMenuComEnum.valueOf(Escolha.toUpperCase());
        System.out.println("A opcao escolhida é a de número: " + opcao.getNumero() + " --- " + opcao.getTexto());

		IniciarMenu(Escolha);

    }while(i == 0);

}
	
 static private void IniciarMenu(String escolhas) throws NegocioException {

    switch (escolhas) {
        case "CADASTRAR_MODELO":
        	ModeloTUI.cadastroDeModelos();
            break;
        case "SAIR":
           System.exit(0);
            break;
		}


    }


}
