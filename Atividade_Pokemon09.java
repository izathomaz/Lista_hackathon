package lista_competicao;

import java.util.Scanner;

public class Atividade_Pokemon09 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite o nome do pokémon: ");
		String nome = ler.nextLine();

		switch (nome) {

		case "Bulbasaur":
			System.out.println("Kanto");
			break;

		case "Chimchar":
			System.out.println("Sinnoh");
			break;

		case "Torchic":
			System.out.println("Hoenn");
			break;

		default:
			System.out.println("Região Desconhecido");
			break;
		}

	}

}
