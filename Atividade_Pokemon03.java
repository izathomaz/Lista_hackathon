package lista_competicao;

import java.util.Scanner;

public class Atividade_Pokemon03 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.println("Insira o nome do seu Pokémon: ");
		String popularidade = ler.nextLine();

		String mostrar = popularidade.equals("Pikachu") ? "Seu Pokémon é popular! " : "Seu Pokémon não é popular! ";
		System.out.println(mostrar);
		
		ler.close();

	}

}
