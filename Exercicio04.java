package lista32Exercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		System.out.print("Informe uma data (AAAA): ");
		int data = ler.nextInt();
		
		if(data % 4 == 0) {
			System.out.println(data +" � bisexto");
		}else {
			System.out.println(data+" n�o � bisexto");
		}
		ler.close();

	}

}
