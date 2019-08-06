package lista32Exercicios;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe 1° Lado: ");
		int lado1 = ler.nextInt();
		
		System.out.print("Informe 2° lado: ");
		int lado2 = ler.nextInt();
		
		System.out.print("Informe 3° lado: ");
		int lado3 = ler.nextInt();
		
		
		if(((lado1 + lado2) > lado3 || (lado1 + lado3) > lado2 || (lado3 + lado2) > lado1 ) && lado1 > 0 || lado2 > 0 || lado3 > 0) {
			if(lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
				System.out.println("Tringulo Equilatero");
				
			}else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
				System.out.println("Tringulo Isosceles");
			}else if(lado1 != lado2 && lado1 != lado3 && lado2 != lado3){
				System.out.println("Tringulo Escaleno");
			}
		}else {
			System.out.println("não é um triangulo ");
		}
		ler.close();
	}

}
