package lista32Exercicios;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Informe o codigo de Origem: ");
		int cod = ler.nextInt();
		System.out.print("Informe o preço do produto: ");
		double preco= ler.nextDouble();
			
		switch (cod) {
		case 1:
			System.out.println("1- Sul R$"+ preco);
			break;
		case 2:
			System.out.println("2- Norte R$"+ preco);
			break;
		case 3:
			System.out.println("3- Leste R$"+ preco);
			break;
		case 4:
			System.out.println("4- Oeste R$"+ preco);
			break;
		case 5:
			System.out.println("5- Nordeste R$"+ preco);
			break;
		case 6:
			System.out.println("6- Nordeste R$"+ preco);
			break;
		case 7:
			System.out.println("7- Centro-OesteR$"+ preco);
			break;
		case 8:
			System.out.println("8- Centro-OesteR$"+ preco);
			break;
		default:
			System.out.println("produto Importado"+ preco);
			break;
		}
		ler.close();
}

}
