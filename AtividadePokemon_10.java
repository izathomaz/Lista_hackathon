package lista_competicao;

import java.util.Scanner;

public class AtividadePokemon_10 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.print("Informe um número de 1 a 4: ");
		int ataque = ler.nextInt();

		switch (ataque) {

		case 1:
			System.out.println("Investida");
			break;

		case 2:
			System.out.println("Rajada de Fumaça");
			break;

		case 3:
			System.out.println("Choque de Trovão");
			break;

		case 4:
			System.out.println("Hidro Bomba");
			break;

		default:
			System.out.println("Número inválido");
			break;
		}

	}

}
