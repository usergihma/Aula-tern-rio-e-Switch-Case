package lpa;

import java.util.Scanner;

public class abril_ternario {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade;
	
	System.out.println("Digite sua idade");
	idade = ler.nextInt();
	
	String mensagem = idade >= 18 ? "Maior de idade" : "Menor de idade";
	System.out.println(mensagem);
	}

}
