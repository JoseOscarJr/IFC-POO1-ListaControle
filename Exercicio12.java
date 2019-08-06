package lista32Exercicios;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe seu salario: ");
		double salario = ler.nextDouble();
		
		double novoSalario = 0;
		
		System.out.println("salario anterior: "+ salario);
		if(salario <= 280) {
			novoSalario = salario * 1.20;
			System.out.println("Percentual Aumentado: 20%");
		}else if(salario > 280 && salario < 700) {
			novoSalario = salario * 1.15;
			System.out.println("Percentual Aumentado: 15%");
		}else if(salario >= 700 && salario < 1500) {
			novoSalario = salario * 1.10;
			System.out.println("Percentual Aumentado: 10%");
		}else if(salario >= 1500) {
			novoSalario = salario * 1.05;
			System.out.println("Percentual Aumentado: 5%");
		}
		System.out.println("Valor Aumentado: "+ (novoSalario- salario));
		System.out.println("Novo Salario: "+ novoSalario);
		ler.close();
	}

}
