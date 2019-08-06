package lista32Exercicios;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Informe tres numeros 1°: ");
		int num1 = ler.nextInt();
		
		System.out.print("2°: ");
		int num2 = ler.nextInt();
		
		System.out.print("3°: ");
		int num3 = ler.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			System.out.println(num1);
			if(num2 > num3) {
				System.out.println(num2 +"\n"+ num3);
			}else {
				System.out.println(num3 +"\n"+ num2);
			}
		}else if(num2 > num1 && num2 > num3) {
			System.out.println(num2);
			if(num1 > num3) {
				System.out.println(num1 +"\n"+ num3);
			}else {
				System.out.println(num3 +"\n"+ num1);
			}
		}else {
			System.out.println(num3);
			if(num1 > num2) {
				System.out.println(num1 +"\n"+ num2);
			}else {
				System.out.println(num2 +"\n"+ num1);
			}
		}
		ler.close();

	}

}
