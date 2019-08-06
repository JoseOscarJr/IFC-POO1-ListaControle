package lista32Exercicios;

import java.util.Scanner;

public class Exercicio29 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Informe a quantidade de litros");
		double litros = ler.nextDouble();
		
		System.out.print("Informe o combustivel (A-Alcool G-Gasolina): ");
		char combustivel = ler.next().charAt(0);
		double ValorAPagar = 0;
		String tipoCombus = "";
		switch (combustivel) {
		case 'A':
			ValorAPagar = litros * 2.50;
			tipoCombus = "Alcool";
			break;
		case 'G':
			ValorAPagar = litros * 1.90;
			tipoCombus = "Gasolina";
			break;
		}
		System.out.println("-------------RECIBO----------"
				+ "\nTipo de Combustivel: "+ tipoCombus
				+ "\nValor a Pagar: R$"+ ValorAPagar
				+ "\n-------------FIM------------");
		ler.close();
	}

}
