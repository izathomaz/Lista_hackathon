package lista_competicao;

import java.util.Scanner;

public class Atividade_Pokemon04 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.println("O seu Pokémon é Lendário? (sim ou não");
		String verificaLendario = ler.nextLine();
		

		String mostrar = verificaLendario.equals("sim") ? "Seu Pokémon é extremamente raro! " : "Seu Pokémon é Comum!";
		System.out.println(mostrar);

	}

}
