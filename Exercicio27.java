package lista32Exercicios;

import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Informe o valor(de 10 até 600)");
		double valor1 = ler.nextDouble();
		
		System.out.print("Informe o valor(de 10 até 600)");
		double valor2 = ler.nextDouble();
		
		System.out.print("Informe a operação (/ ,* ,- ,+): ");
		char letra = ler.next().charAt(0);
		double resultadoOpera = 0;
		
		switch (letra) {
		case '/':
			resultadoOpera = valor1 / valor2;
			break;
		case '*':
			resultadoOpera = valor1 * valor2;
			break;
		case '-':
			resultadoOpera = valor1 - valor2;
			break;
		case '+':
			resultadoOpera = valor1 + valor2;
			break;
		default:
			System.out.println("operação não encontrada");
			break;
		}
		if(resultadoOpera % 2 == 0) {
			System.out.println("O numero "+resultadoOpera+" é par");
		}else {
			System.out.println("O numero "+resultadoOpera +" é impar");
		}
		if(resultadoOpera > 0) {
			System.out.println("O numero "+resultadoOpera+" é positivo");
		}else {
			System.out.println("O numero "+resultadoOpera +" é negativo");
		}
		
		char[] charValor = Double.toString(resultadoOpera).toCharArray();
		String IntDec = "Inteiro";

		for (int i = 0; i < charValor.length; i++) {
			if(charValor[i] == '.' ) {
				if(charValor[i+1] != '0'&& charValor[i+2] != '0')
				IntDec = "Decimal";
				break;
			}
		}
		System.out.println(resultadoOpera+" é "+ IntDec);
		
		ler.close();

	}

}
