package lista32Exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Informe um numero: ");
		int num1 = ler.nextInt();
		
		if(num1 > 0) {
			System.out.println("O numero "+ num1 +" � positivo ");
			
		}else if(num1 == 0) {
			System.out.println("O numero "+ num1 +" � igual a zero ");
			
		}else {
			System.out.println("O numero "+ num1 +" � negativo ");
		}
		ler.close();
	}

}
