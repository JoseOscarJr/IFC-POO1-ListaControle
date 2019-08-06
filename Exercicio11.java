package lista32Exercicios;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Informe o turno que estuda(M-Matutino ,V-Vespertino,N-Noturno): ");
		char letra = ler.next().charAt(0);
		
		switch (letra) {
		case 'M':
			System.out.println("Bom dia!");
			break;
		case 'V':
			System.out.println("Boa Tarde");
			break;
		case 'N':
			System.out.println("Boa Noite");
			break;
		default:
			System.out.println("Não existe essse turno");
			break;
		}
		ler.close();
	}

}
