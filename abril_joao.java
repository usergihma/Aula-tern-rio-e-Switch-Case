package lpa;

import java.util.Scanner;

public class abril_joao {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String nome1, nome2 ;
		
		System.out.println("Digite o primeiro nome");
	    nome1 = ler.next();
		
		System.out.println("Digite o segundo nome");
		nome2 = ler.next();
		
		System.out.println(nome1.equals(nome2) ? "Igual" : "Diferente");
		
	}

}
