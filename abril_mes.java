package lpa;

import java.util.Scanner;

public class abril_mes {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		int mes;
		
		System.out.println("Digite o dia referente ao mês");
		mes = ler.nextInt();
		
		switch (mes) {
		case 1:
			System.out.println("O mês selecionado foi janeiro.");
			break;
		case 2:
			System.out.println("O mês selecionado foi fevereiro.");
			break;
		case 3:
			System.out.println("O mês selecionado foi março.");
			break;
		case 4:
			System.out.println("O mês selecionado foi abril.");
			break;
		case 5:
			System.out.println("O mês selecionado foi maio.");
			break;
		case 6:
			System.out.println("O mês selecionado foi junho.");
			break;
		case 7:
			System.out.println("O mês selecionado foi julho.");
			break;
		case 8:
			System.out.println("O mês selecionado foi agosto.");
			break;
		case 9:
			System.out.println("O mês selecionado foi setembro.");
			break;
		case 10:
			System.out.println("O mês selecionado foi outubro.");
			break;
		case 11:
			System.out.println("O mês selecionado foi novembro.");
			break;
		case 12:
			System.out.println("O mês selecionado foi dezembro.");
			break;
		default:
			System.out.println("O mês selecionado é inválido.");
		}
		
	}

}
