package lista32Exercicios;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		System.out.print("Informe a idade: ");
		int idade1 = ler.nextInt();

		System.out.print("Informe a idade: ");
		int idade2 = ler.nextInt();

		System.out.print("Informe a idade: ");
		int idade3 = ler.nextInt();

		int mediaIdade = (idade1+idade2+idade3)/3;
		
		if(mediaIdade < 25){
			System.out.print("turma Jovem ");
		}else if(mediaIdade >= 25 && mediaIdade < 40) {
			System.out.print("turma Adulta");
		}else if(mediaIdade >= 40) {
			System.out.print("turma Idosa");
		}
		ler.close();
		}

}
