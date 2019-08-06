package lista32Exercicios;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe 1° nota: ");
		double num1 = ler.nextDouble();
		
		System.out.print("Informe 2° nota: ");
		double num2 = ler.nextDouble();
		
		double media= ((num1+num2)/ 2);
		
		if(media > 0 && media < 3 ) {
			System.out.println("Media = "+ media+" Reprovado ");
			
		}else if(media >= 3 && media <=6.9){
			System.out.println("Media = "+ media+" em exame!");
		}else if(media >= 7 && media <= 10){
			System.out.println("Media = "+ media+" Aprovado");
		}
		ler.close();
	}

}
