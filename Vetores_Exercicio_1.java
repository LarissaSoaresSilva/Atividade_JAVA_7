package java_7;

import java.util.Scanner;

public class Vetores_Exercicio_1 {

	public static void main(String[] args) {
		
		Scanner lerScanner = new Scanner(System.in);
	
		int vetorNumeros [] = {2,5,1,3,4,9,7,8,10,6};
		int numero;
		boolean localizado = false;
		
		System.out.println("Digite o número que você deseja encontrar: ");
		numero= lerScanner.nextInt();
		
		for (int i = 0; i < 10; i++) {
		 if (vetorNumeros [i] == numero) {
		 System.out.println("O número " + numero + " está localizado na posição: " +i+ "."); 
		localizado = true;
		break;
		 }
		}
		if (!localizado) {
			 System.out.println("O número " + numero + " não foi encontrado!"); 
		 }
lerScanner.close();
		}
	}


