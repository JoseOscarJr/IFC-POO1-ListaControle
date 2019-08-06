package lista32Exercicios;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			System.out.print("Informe um numero correspondente ao dia da semana: ");
			int dia = ler.nextInt();
				
			switch (dia) {
			case 1:
				System.out.println("1-Domingo");
				break;
			case 2:
				System.out.println("2-Segunda-Feira");
				break;
			case 3:
				System.out.println("3-Terça-Feira");
				break;
			case 4:
				System.out.println("4-Quarta-Feira");
				break;
			case 5:
				System.out.println("5-Quinta-Feira");
				break;
			case 6:
				System.out.println("6-Sexta-Feira");
				break;
			case 7:
				System.out.println("Sabado");
				break;
			default:
				System.out.println("valor Invalido");
				break;
			}
			ler.close();
	}


}
