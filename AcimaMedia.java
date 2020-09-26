/**
* Laboratório de Programação 2 - Lab 1
*
* @author Mariane Silva de Carvalho - 119210450
*/

import java.util.Scanner;

public class AcimaMedia {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String[] numsString = sc.nextLine().split(" ");
		int[] numsInt = new int[numsString.length];
		
		int contador = 0;
		for (int i = 0; i < numsString.length; i++) {
			numsInt[i] = Integer.parseInt(numsString[i]);
			contador += numsInt[i];
		}

		int media = contador / numsInt.length;

		String saida = "";

		for (int i = 0; i < numsInt.length; i++) {
			if (numsInt[i] > media) {
				saida += numsString[i] + " ";
			}
		}

		System.out.println(saida);
	}
} 
