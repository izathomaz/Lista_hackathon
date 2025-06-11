package lista_competicao;

import java.util.Scanner;

public class Lista_atividade3 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.print("informe uma das Américas: ");

		String continente = ler.nextLine();
		String continenteConvertido = continente.toUpperCase();

		if (continenteConvertido.equals("AMERICA DO NORTE") || continenteConvertido.equals("AMERICA CENTRAL")
				|| continenteConvertido.equals("AMERICA DO SUL")) {
			System.out.println("É americano");
		} else {
			System.out.println("Não é americano");
		}

		ler.close();
	}

}
