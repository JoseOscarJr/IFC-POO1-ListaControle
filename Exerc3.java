package lista32Exercicios;

import java.util.Scanner;

public class Exerc3 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		System.out.print("Informe a letra do sexo: ");
		char letra = ler.next().charAt(0);
		
		if(letra == 'f' || letra == 'F') {
			System.out.println("F- Feminino");
			
		}else if (letra == 'm' || letra == 'M') {
			System.out.println("M-Masculino");
		}else {
			System.out.println("Letra não identificada");
		}
		ler.close();
	}

}
