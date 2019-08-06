package lista32Exercicios;

import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Informe o valor(de 10 até 600)");
		int valor = ler.nextInt();
		
		if(valor >= 10 && valor <= 600) {
			int notaCem = valor/100;
			int notaCinquenta = (valor%100)/50;
			int notaDez = ((valor%100) %50)/10;
			int notaCinco = ((valor%100) %10)/5;
			int notaUm = (valor%100) %5;
			System.out.println("-----------"+valor+"-----------");
			System.out.println("Notas R$100: "+notaCem);
			System.out.println("Notas R$50: "+notaCinquenta);
			System.out.println("Notas R$10: "+notaDez);
			System.out.println("Notas R$5: "+notaCinco);
			System.out.println("Notas R$1: "+notaUm);
		}else {
			System.out.println("Valor não permitido");
		}
		ler.close();
	}

}
