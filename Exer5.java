package lista32Exercicios;

import java.util.Scanner;

public class Exer5 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		System.out.print("Informe a letra (vogal): ");
		char letra = ler.next().charAt(0);
		
		switch (letra) {
		case 'a':
			System.out.println("é uma vogal");
			break;
		case 'e':
			System.out.println("é uma vogal");
			break;
		case 'i':
			System.out.println("é uma vogal");
			break;
		case 'o':
			System.out.println("é uma vogal");
			break;
		case 'u':
			System.out.println("é uma vogal");
			break;
		default:
			System.out.println("não é uma vogal");
			break;
		}
		ler.close();
	}

}
