package lista32Exercicios;

import java.util.Scanner;

public class Exercicio2502 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Informe o valor: ");
		int valor = ler.nextInt();
		
		if(valor % 2 == 0) {
			System.out.println("o numero "+valor+" é par");
		}else {
			System.out.println("o numero "+valor+" é impar");
		}
		ler.close();
	}

}
