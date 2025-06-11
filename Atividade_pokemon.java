package lista_competicao;

import java.util.Scanner;

public class Atividade_pokemon {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.println("Insira aqui o número de força de seu Pokémon: ");
		int nivelDeForca = ler.nextInt();

		String mostrar = nivelDeForca > 70 ? "O nível de força desse Pokémon faz dele um Pokémon Elite! "
				: "O nível de força desse Pokémon faz dele um Pokémon Comum! ";
		System.out.println(mostrar);
		
		ler.close();
	}

}
