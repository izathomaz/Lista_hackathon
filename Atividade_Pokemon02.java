package lista_competicao;

import java.util.Scanner;

public class Atividade_Pokemon02 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.println("Insira aqui o nível do seu Pokémon, para verificar sua evolução: ");
		int nivelPokemon = ler.nextInt();

		String mostrar = nivelPokemon >= 16 ? "Seu Pokémon pode evoluir!" : "Seu Pokémon não pode evoluir!";
		System.out.println(mostrar);

		ler.close();
	}

}
