package lista32Exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DecimalFormat fmt = new DecimalFormat("0.00");
		
		System.out.print("Informe o peso: ");
		double peso = ler.nextDouble();
		
		System.out.print("Informe a altura: ");
		double altura = ler.nextDouble();
		
		System.out.print("Informe o sexo(m ou f): ");
		char sexo = ler.next().charAt(0);
		
		
		if(sexo == 'm') {
			double homem = ((72.7 * altura)-58);
			if(homem < peso) {
				System.out.println("Altura: "+ altura + "\n Sexo: "+ sexo +"\n Peso: "+ peso+ "\n Peso ideal: "+ fmt.format(homem));
				System.out.println("Você esta acima do peso!");
			}else if(homem > peso){
				System.out.println("Altura: "+ altura + "\n Sexo: "+ sexo +"\n Peso: "+ peso+ "\n Peso ideal: "+fmt.format(homem));
				System.out.println("Você esta abaixo do peso!");
			}else {
				System.out.println("Altura: "+ altura + "\n Sexo: "+ sexo +"\n Peso: "+ peso+ "\n Peso ideal: "+ fmt.format(homem));
				System.out.println("Você esta no peso!");
			}
			
		}else if(sexo == 'f'){
			double mulher = ((62.1 * altura)-44.7);
			if(mulher < peso) {
				System.out.println("Altura: "+ altura + "\n Sexo: "+ sexo +"\n Peso: "+ peso+ "\n Peso ideal: "+ fmt.format(mulher));
				System.out.println("Você esta acima do peso!");
			}else if(mulher > peso){
				System.out.println("Altura: "+ altura + "\n Sexo: "+ sexo +"\n Peso: "+ peso+ "\n Peso ideal: "+ fmt.format(mulher));
				System.out.println("Você esta abaixo do peso!");
			}else {
				System.out.println("Altura: "+ altura + "\n Sexo: "+ sexo +"\n Peso: "+ peso+ "\n Peso ideal: "+ fmt.format(mulher));
				System.out.println("Você esta no peso!");
			}
			
		}else {
			System.out.println("sexo não reconhecido");
		}
		ler.close();

	}

}
