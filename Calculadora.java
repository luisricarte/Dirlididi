/**
LABORATORIO DE PROGRAMAÇÃO - LAB01
SOFIA ROCHA CAVALCANTI -119210421
 */
import java.util.Scanner;

public class Calculadora {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String entrada = sc.next();
		
		if (entrada.equals("+")) {
			double entrada2 = sc.nextDouble();
			double entrada3 = sc.nextDouble();
			double resul = (entrada2 + entrada3);
			System.out.println("RESULTADO: "+ resul);
			
		}else if (entrada.equals("-")) {
			double entrada2 = sc.nextDouble();
			double entrada3 = sc.nextDouble();
			double resul = entrada2- entrada3;
			System.out.println("RESULTADO: "+ resul);
			
		}else if (entrada.equals("*")) {
			double entrada2 = sc.nextDouble();
			double entrada3 = sc.nextDouble();
			double resul = entrada2 * entrada3;
			System.out.println("RESULTADO: "+ resul);
					
		}else if (entrada.equals("/")) {
			double entrada2 = sc.nextDouble();
			double entrada3 = sc.nextDouble();
			if (entrada3 == 0.0) {

				System.out.println("ERRO");
			}else {
				double resul = entrada2 / entrada3;
				System.out.println("RESULTADO: "+ resul);
				
			}
			
		}else {
			System.out.println("ENTRADA INVALIDA");
		}
			
		}

}

