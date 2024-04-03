package lpa;

import java.util.Scanner;

public class abril2 {

	public static void main(String[] args) {
	
	Scanner ler = new Scanner(System.in);
	
	System.out.println("Informe o número do dia da semana ");
	int dia = ler.nextInt();
	
	switch (dia) {
	case 1:
		System.out.println("O dia selecionado foi Domingo");
		break;
	case 2:
		System.out.println("O dia selecionado foi Segunda-feira");
		break;
	case 3:
		System.out.println("O dia selecionado foi Terça-feira");
		break;
	case 4:
		System.out.println("O dia selecionado foi Quarta-feira");
		break;
	case 5:
		System.out.println("O dia selecionado foi Quinta-feira");
		break;
	case 6:
		System.out.println("O dia selecionado foi Sexta-feira");
		break;
	case 7:
		System.out.println("O dia selecionado foi Sábado");
		break;
	default:
		System.out.println("O dia informado é inválido, informe um número entre 1 e 7");
	}
	
	}

}
