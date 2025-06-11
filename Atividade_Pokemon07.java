package lista_competicao;

import java.util.Scanner;

public class Atividade_Pokemon07 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.println("Insira o nível do primeiro Pokémon:");
		int nivelPokemon1 = ler.nextInt();

		System.out.println("Insira o nível do segundo Pokémon:");
		int nivelPokemon2 = ler.nextInt();

		if (nivelPokemon1 > nivelPokemon2) {
			System.out.println("O primeiro Pokémon é o mais forte! ");
		}
		if (nivelPokemon1 < nivelPokemon2) {
			System.out.println("O segundo Pokémon é o mais forte! ");
		}
		else {
			System.out.println("Os Pokémons possuiem o mesmo nível!");
		}

	}

}
