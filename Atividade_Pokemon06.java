package lista_competicao;

import java.util.Scanner;

public class Atividade_Pokemon06 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.println("Informe a idade do seu treinador:");
		int idadeTreinador = ler.nextInt();

		System.out.println("Informe o nível do seu Pokémon: ");
		int nivelPokemon = ler.nextInt();

		if (idadeTreinador >= 12 && nivelPokemon >= 20) {
			System.out.println("Você já pode participar de torneios! ");
		} else {
			System.out.println("Você ainda não pode participar de torneios! ");
		}
	}

}
