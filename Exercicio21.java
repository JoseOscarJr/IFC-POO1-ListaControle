package lista32Exercicios;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe a data(DD-MM-AAAA): ");
		String ano = ler.next();
		String data[]= new 	String[3];
		data = ano.split("-");
		if((Integer.parseInt(data[0]) > 0 && Integer.parseInt(data[0]) <= 31) && 
			(Integer.parseInt(data[1]) > 0 && Integer.parseInt(data[1]) <= 12)) {
			
			if(Integer.parseInt(data[1]) == 02 && Integer.parseInt(data[0]) <= 29 && Integer.parseInt(data[0]) > 0) {

				System.out.println(ano+" é uma data valida");
			}else {
				System.out.println(ano+" essa data não existe");
			}
		}else {
			System.out.println(ano+" essa data não existe");
		}
		ler.close();
	}

}
