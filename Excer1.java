package lista32Exercicios;

import java.util.Scanner;

public class Excer1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		System.out.print("Informe dois numeros 1°: ");
		int num1 = ler.nextInt();
		
		System.out.print("2°: ");
		int num2 = ler.nextInt();
		
		if(num1 > num2) {
			System.out.println("O Primeiro numero "+ num1 +" é maior que o segundo "+ num2);
		}else {
			System.out.println("O segundo numero "+ num2 +" é maior que o primeiro "+ num1);
		}
		ler.close();

	}

}
