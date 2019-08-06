package lista32Exercicios;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		System.out.print("Informe um numero: ");
		int num1 = ler.nextInt();
		
		if(num1 % 2 == 0) {
			System.out.println("O numero "+ num1 +" é par");
			num1 += 1;
			System.out.println("agora o novo numero "+ num1 +" é impar");
		}else {
			System.out.println("O numero "+ num1 +" é impar");
			num1 += 1;
			System.out.println("agora o novo numero "+ num1 +" é par");
		}
		
		ler.close();

	}

}
