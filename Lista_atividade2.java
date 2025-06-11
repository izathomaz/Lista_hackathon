package lista_competicao;

import java.util.Scanner;

public class Lista_atividade2 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o número de um mês para verificar sua estação correspondente: ");

		int mes = ler.nextInt();
		String estacao;
		// Determinação da estação com switch-case
		switch (mes) {

		case 12, 1, 2:
			estacao = "Verão";
			break;
		case 3, 4, 5:
			estacao = "Outono";
			break;
		case 6, 7, 8:
			estacao = "Inverno";
			break;
		case 9, 10, 11:
			estacao = "Primavera";
			break;
		default:
			estacao = "Mês inválido";
		}
		// Exibição do resultado
		System.out.println(estacao);

		ler.close();

		ler.close();

	}

}
