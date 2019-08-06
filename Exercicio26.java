package lista32Exercicios;

import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Informe o valor: ");
		String valor = ler.next();
		char[] charValor = valor.toCharArray();
		String IntDec = "Inteiro";
		for (int i = 0; i < charValor.length; i++) {
			if(charValor[i] == ',') {
				IntDec = "Decimal";
				break;
			}
		}
		System.out.println(valor+" é "+ IntDec);
	ler.close();
	}

}
