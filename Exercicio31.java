package lista32Exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio31 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.print("Informe a quantidade de carne: ");
		double quatCarne = ler.nextDouble();
		
		System.out.print("Informe o tipo de carne|F-File Duplo| |A-ALcatra| |P-Picanha|: ");
		char tipoCarne = ler.next().charAt(0);
		double totalAPagar = 0;
		double totalAPagarDesconto = 0;
		String AuxTipoCarne = "";
		String pagamento = "";
		
		switch (tipoCarne) {
		case 'F':
			if(quatCarne > 5) {
				totalAPagar = quatCarne * 4.90;
			}else {
				totalAPagar = quatCarne * 5.80;
			}
			AuxTipoCarne = "File Duplo";
			break;
		case 'A':
			if(quatCarne > 5) {
				totalAPagar = quatCarne * 5.90;
			}else {
				totalAPagar = quatCarne * 6.80;
			}
			AuxTipoCarne = "Alcatra";
			break;
		case 'P':
			if(quatCarne > 5) {
				totalAPagar = quatCarne * 6.90;
			}else {
				totalAPagar = quatCarne * 7.80;
			}
			AuxTipoCarne = "Picanha";
			break;
		default:
			break;
		}
		System.out.print("pagar com cartão tabajara? s/n: ");
		char cartao = ler.next().charAt(0);
		if(cartao == 's') {
			totalAPagarDesconto = totalAPagar * 0.95;
			pagamento = "Cartão";
		}else {
			totalAPagarDesconto = totalAPagar;
			
			pagamento = "Dinheiro";
		}
		System.out.println("\n-----------------------------"
				+ "\nCarne Comprada: "+AuxTipoCarne
				+ "\n Quantidade comprada: Kg "+ df.format(quatCarne)
				+ "\n Forma de pagamento: "+pagamento
				+ "\n Total a Pagar sem desconto: R$"+ df.format(totalAPagar)
				+ "\n Valor do desconto: R$"+ df.format(totalAPagar-totalAPagarDesconto)
				+ "\n Valor a pagar: R$"+ df.format(totalAPagarDesconto));
		ler.close();
	}

}
