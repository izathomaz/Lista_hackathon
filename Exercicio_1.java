package lista_competicao;

import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite números do ponto de latitude de uma cordenada: ");
		double cordenadas = ler.nextDouble();

		String msg = cordenadas >= 0 ? "Essa cordenada corresponde ao Hemisfério Norte! "
				: "Essa cordenada corresponde ao Hemisfério Sul! ";
		System.out.println(msg);

		ler.close();

	}

}
