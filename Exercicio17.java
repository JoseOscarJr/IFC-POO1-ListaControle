package lista32Exercicios;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe 1° nota: ");
		double num1 = ler.nextDouble();
		
		System.out.print("Informe 2° nota: ");
		double num2 = ler.nextDouble();
		
		double media= ((num1+num2)/ 2);
		
		if(media > 0 && media < 4 ) {
			System.out.println("Notas |"+num1+"|"+num2+"|"+" Media = "+ media+" Conceito: |E|Reprovado| ");
			
		}else if(media >= 4 && media < 6){
			System.out.println("Notas |"+num1+"|"+num2+"|"+" Media = "+ media+" Conceito: |D|Reprovado| ");
		}else if(media >= 6 && media < 7.5){
			System.out.println("Notas |"+num1+"|"+num2+"|"+" Media = "+ media+" Conceito: |C|Aprovado| ");
		}else if(media >= 7.5 && media < 9){
			System.out.println("Notas |"+num1+"|"+num2+"|"+" Media = "+ media+" Conceito: |B|Aprovado| ");
		}else if(media >= 9 && media <= 10){
			System.out.println("Notas |"+num1+"|"+num2+"|"+" Media = "+ media+" Conceito: |A|Aprovado| ");
		}
		ler.close();
	}

}
