package lista32Exercicios;

import java.util.Scanner;

public class Exercicio32 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		char[] resposta = {'a','a','b','b','c','c','d','d','e','e'};
		char[] perguntas = new char[10];
		int pontos = 0;
		for (int i = 0; i < resposta.length; i++) {
			System.out.print("Informe a resposta da questão "+(i+1)+" (a,b,c,d ou e) ");
			perguntas[i]= ler.next().charAt(0);
		}
		System.out.println("Questão : gabarito : resposta ");
		for (int i = 0; i < perguntas.length; i++) {
			System.out.println("Q"+(i+1)+" : "+resposta[i]+" : "+perguntas[i]);
			if(resposta[i] == perguntas[i]) {
				pontos++;
			}
		}
		System.out.println("Pontuação final: "+ pontos);
		ler.close();
	}

}
