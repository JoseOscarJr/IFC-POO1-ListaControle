package lista32Exercicios;

import java.util.Scanner;

public class Exercicio30 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Informe a quantidade de maças: ");
		double maca = ler.nextDouble();
		
		System.out.print("Informe a quantidade de morangos: ");
		double morango = ler.nextDouble();
		
		double contaMorango = 0;
		double contaMaca = 0;
		
		if(maca > 5) {
			contaMaca = maca * 1.50;
		}else {
			contaMaca = maca * 1.80;
		}
		if(morango > 5) {
			contaMorango = morango * 2.20;
		}else {
			contaMorango = morango * 2.50;
		}
		double contaTotal = contaMaca+contaMorango;
		if((maca+morango) > 8 || contaTotal > 25) {
			contaTotal = contaTotal *0.90;
		}
		
		System.out.println("Maça: KG "+ maca
				+"\nMorango: KG "+ morango
				+"\nTotal a Pagar: R$"+contaTotal);
		ler.close();
	}

}
