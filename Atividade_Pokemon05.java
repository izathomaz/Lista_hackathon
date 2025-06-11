package lista_competicao;

import java.util.Scanner;

public class Atividade_Pokemon05 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.println("Indique qual o nível do seu treinador (em números): ");
		int nivelTreinador = ler.nextInt();

		if (nivelTreinador < 10) {
			System.out.println("Seu treinador é iniciante! " + nivelTreinador);
		} else if (nivelTreinador <= 30) {
			System.out.println("Seu treinador é intermediário! " + nivelTreinador);
		} else if (nivelTreinador > 30) {
			System.out.println("Seu treinador é experiente! " + nivelTreinador);
		}

	}

}
