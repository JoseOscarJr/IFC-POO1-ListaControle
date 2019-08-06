package lista32Exercicios;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		//for (int i = 1; i <= 1000; i++) { testar com todos os 1000
		System.out.print("Informe o valor(até 1000)");
		int numero = ler.nextInt();
		//int numero = i;
		if(numero <= 1000 && numero > 0) {
			int centenas = numero/100;
			int dezenas = (numero%100) /10;
			int unidades = (numero%100) %10;
			System.out.println("-----------"+numero+"-----------");
			System.out.println("Unidades: "+unidades);
			System.out.println("Dezenas: "+dezenas);
			System.out.println("Centenas: "+centenas);
		}else {
			System.out.println("Valor Acima do permitido");
		}
		//}
		ler.close();
	}

}
