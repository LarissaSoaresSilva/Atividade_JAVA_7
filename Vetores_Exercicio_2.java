package java_7;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.ArrayIndexOutOfBoundsException;

public class Vetores_Exercicio_2 {

	public static void main(String[] args) {

		Scanner lerScanner = new Scanner(System.in);

		int vetorElementos[] = new int[10];
		int soma = 0;
		float media;

		for (int i = 0; i < vetorElementos.length; i++) {
			System.out.println("Digite o " + (i + 1) + " elemento: ");
			vetorElementos[i] = lerScanner.nextInt();
			soma += vetorElementos[i];
		}

		System.out.println("\nOs elementos nos índices impares são: ");
		for (int i = 1; i < vetorElementos.length; i += 2) {
			System.out.println(vetorElementos[i]);
		}
		System.out.println("\nOs elementos pares são: ");
		for (int i = 0; i < vetorElementos.length; i++) {
			if (vetorElementos[i] % 2 == 0) {
				System.out.println(vetorElementos[i]);
			}
		}

		media = (float) soma / 10;

		System.out.println("\nA soma dos elementos é: " + soma + ".");
		System.out.printf("\nA média dos elementos é: %.2f ", media);

		lerScanner.close();
	}

}

