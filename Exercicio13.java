package lista32Exercicios;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe suas Horas: ");
		double hora = ler.nextDouble();
		
		System.out.print("Informe seu ganho por hora: ");
		double ganhoHora = ler.nextDouble();
		
		double IR =0;
		String PorcIR = "";
		double salario = (hora * ganhoHora);
		double novoSalario = 0;
		System.out.println("salario anterior: "+ salario);
		if(salario > 900 && salario <= 1500) {
			novoSalario = salario * 0.95;
			IR = (novoSalario-salario)*(-1);
			PorcIR = "5%";
		}else if(salario > 1500 && salario <= 2500) {
			novoSalario = salario * 0.90;
			IR = (novoSalario-salario)*(-1);
			PorcIR = "10%";
		}else if(salario > 2500) {
			novoSalario = salario * 0.80;
			IR = (novoSalario-salario)*(-1);
			PorcIR = "20%";
		}
		System.out.println("Salario buto: "+ "("+hora+" * "+ganhoHora+")"+": R$ "+salario);
		System.out.println("(-) IR "+PorcIR+" :R$ "+ IR);
		System.out.println("(-) INSS 10% :R$ "+ (salario * 0.10));
		System.out.println("FGTS 11% :R$ "+ (salario * 0.89));
		System.out.println("Total de descontos :R$ "+ ((salario * 0.10)+IR));
		System.out.println("Salario Liquido :R$ "+ (novoSalario-(salario * 0.10)));
		ler.close();
	}

}
