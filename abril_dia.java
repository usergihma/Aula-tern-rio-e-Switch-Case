package lpa;

import java.util.Scanner;

public class abril_dia {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o dia da semana ");
		String dia = ler.next();
		
		switch (dia) {
		case ("domingo"):
			System.out.println("O número do dia selecionado é 1 ");
			break;
		case ("segunda"):
			System.out.println("O número do dia selecionado é 2");
			break;
		case ("terça"):
			System.out.println("O número do dia selecionado é 3");
			break;
		case ("quarta"):
			System.out.println("O número do dia selecionado é 4");
			break;
		case ("quinta"):
			System.out.println("O número do dia selecionado é 5");
			break;
		case ("sexta"):
			System.out.println("O número do dia selecionado é 6");
			break;
		case ("sábado"):
			System.out.println("O número do dia selecionado é 7");
			break;
		default:
			System.out.println("O dia informado é inválido");
	}

}
}
