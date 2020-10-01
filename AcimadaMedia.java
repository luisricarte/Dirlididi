/**
 *LABORATORIO DE PROGRAMAÇÃO - LAB01
 SOFIA ROCHA CAVALCANTI - 119210421
 **/
import java.util.Scanner;

public class AcimadaMedia {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		String[] linha = sc.nextLine().split(" ");

		int acumulador = 0;
		int[] trans = new int[linha.length];

		for (int i=0 ; i<linha.length;i++) {
			trans[i] = Integer.parseInt(linha[i]);
		}

		for(int i=0;i<trans.length;i++) {
			acumulador += trans[i];
		}
			double media = acumulador / trans.length;
		String resul = "";

		for (int i =0 ; i<trans.length;i++) {
			if (trans[i]> media ) {
				if (i < (trans.length-1)) {
					resul += trans[i]+" ";
				}else {
				resul += trans [i];

		}
		}
		}
		System.out.println(resul);



	}
}
