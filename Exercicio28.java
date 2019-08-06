package lista32Exercicios;

import java.util.Scanner;

public class Exercicio28 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int cont = 0;
		System.out.println("Telefonou para a vitimi? s/n");
		char resposta = ler.next().charAt(0);
		if(resposta == 's') {
			cont++;
		}
		System.out.println("Esteve no local do crime? s/n");
		resposta = ler.next().charAt(0);
		if(resposta == 's') {
			cont++;
		}
		System.out.println("mora perto da vitima? s/n");
		resposta = ler.next().charAt(0);
		if(resposta == 's') {
			cont++;
		}
		System.out.println("devia para a vitima? s/n");
		resposta = ler.next().charAt(0);
		if(resposta == 's') {
			cont++;
		}
		System.out.println("ja trabalhou com a vitima? s/n");
		resposta = ler.next().charAt(0);
		if(resposta == 's') {
			cont++;
		}
		switch (cont) {
		case 0:
			System.out.println("inocente");
			break;
		case 1:
			System.out.println("inocente");
			break;
		case 2:
			System.out.println("Suspeito");
			break;
		case 3:
			System.out.println("cumplice");
			break;
		case 4:
			System.out.println("cumplice");
			break;
		default:
			System.out.println("Assasino");
			break;
		}
		ler.close();
	}

}
