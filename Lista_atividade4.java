package lista_competicao;

import java.util.Scanner;

public class Lista_atividade4 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		
		System.out.print("Digite o fuso horário em relação ao UTC (entre -12 e +14): ");
		int fuso = ler.nextInt();

	
		if (fuso > 0) {
			System.out.println("Horário adiantado em relação ao UTC 0");
		} else if (fuso < 0) {
			System.out.println("Horário atrasado em relação ao UTC 0");
		} else {
			System.out.println("Horário UTC 0");
		}
		ler.close();

	}

}
