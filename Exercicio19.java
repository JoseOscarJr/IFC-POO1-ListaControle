package lista32Exercicios;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe o valor de A: ");
		int A = ler.nextInt();
		
		if(A != 0) {
			System.out.print("Informe o valor de B: ");
			int B = ler.nextInt();
		
			System.out.print("Informe o valor de C: ");
			int C = ler.nextInt();
			
			int delta = ((B*B)-(4*A*C));
			if(delta <0) {
				System.out.println("Equação não pussui raizes reais.");
				System.out.println("Programa finalizado");
			}else if(delta == 0) {
				System.out.println("Equação pussui uma raiz.");
				System.out.println("Raiz x = "+ ((-B)/2*A));
				System.out.println("Programa finalizado");
			}else if(delta > 0) {
				System.out.println("Equação pussui duas raiz.");
				System.out.println("Raiz x1 = "+ (((-B)+Math.sqrt(delta))/2*A));
				System.out.println("Raiz x2 = "+ (((-B)-Math.sqrt(delta))/2*A));
				System.out.println("Programa finalizado");
			}
		}else {
			System.out.println("Programa finalizado");
		}
		
		ler.close();
	}

}
