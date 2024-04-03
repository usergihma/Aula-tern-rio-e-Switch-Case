package lpa;

import java.util.Scanner;

public class abril_ex1 {

	public static void main(String[] args) {
		double a;
		Scanner ler = new Scanner(System.in);	
        System.out.println("Informe um valor:");
        a = ler.nextDouble();
        String mensagem = a % 5 == 0 ? "O número é multiplo de 5" : "O número não é multiplo de 5";
        System.out.println(mensagem);
	}
	

}
