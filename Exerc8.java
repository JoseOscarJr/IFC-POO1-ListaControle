package lista32Exercicios;

import java.util.Scanner;

public class Exerc8 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe 1° nota: ");
		double num1 = ler.nextDouble();
		
		System.out.print("Informe 2° nota: ");
		double num2 = ler.nextDouble();
		
		double media= ((num1+num2)/ 2);
		
		if(media >= 7) {
			System.out.println("Media = "+ media+" Aprovado");
			
		}else{
			System.out.println("Media = "+ media+" Reprovado ");
		}
		ler.close();
	}

}
