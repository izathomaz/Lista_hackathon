package lista_competicao;

import java.util.Scanner;

public class Lista_atividade5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		// Lê o nome do país
		System.out.print("Digite o nome de um país: ");
		String pais = ler.nextLine();

		// Verifica o continente usando switch-case
		switch (pais) {
		case "Brasil":
		case "Argentina":
		case "Peru":
			System.out.println("América do Sul");
			break;

		case "França":
		case "Alemanha":
			System.out.println("Europa");
			break;

		case "China":
		case "Japão":
			System.out.println("Ásia");
			break;

		case "Egito":
		case "Nigéria":
			System.out.println("África");
			break;

		default:
			System.out.println("Continente não cadastrado");
			break;
		}
		ler.close();

	}

}
