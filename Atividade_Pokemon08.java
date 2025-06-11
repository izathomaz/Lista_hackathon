package lista_competicao;

import java.util.Scanner;

public class Atividade_Pokemon08 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.print("Informe um número de 1 a 3: ");
		int tipo = ler.nextInt();

		switch (tipo) {

		case 1:
			System.out.println("Fogo");
			break;

		case 2:
			System.out.println("Água");
			break;

		case 3:
			System.out.println("Planta");
			break;

		default:
			System.out.println("Tipo Desconhecido");
			break;
		}
	}

}
