package lista32Exercicios;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe 1° nota: ");
		double num1 = ler.nextDouble();
		
		System.out.print("Informe 2° nota: ");
		double num2 = ler.nextDouble();
		
		System.out.print("Informe 3° nota: ");
		double num3 = ler.nextDouble();
		
		double media= ((num1+num2+num3)/ 3);
		
		if(media >= 7 && media < 10) {
			System.out.println("Media = "+ media+" Aprovado");
			
		}else if(media == 10) {
			System.out.println("Media = "+ media+" Aprovado com distinção");
		}else{
			System.out.println("Media = "+ media+" Reprovado ");
		}
		ler.close();

	}

}
