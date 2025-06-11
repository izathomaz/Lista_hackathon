package lista_competicao;

import java.util.Scanner;

public class Lista_atividade6 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		// Leitura do código do país
		System.out.print("Digite um número de 1 a 5: ");
		int codigo = ler.nextInt();

		// Verifica o país com base no código usando switch-case
		switch (codigo) {
		case 1:
			System.out.println("Brasil");
			break;
		case 2:
			System.out.println("Argentina");
			break;
		case 3:
			System.out.println("Chile");
			break;
		case 4:
			System.out.println("Peru");
			break;
		case 5:
			System.out.println("Uruguai");
			break;
		default:
			System.out.println("Código inválido");
			break;
		}
		ler.close();

	}

}
