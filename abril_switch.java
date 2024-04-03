package lpa;

import java.util.Scanner;

public class abril_switch {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int temp;
		double salario, aum;
			
		System.out.print("Informe seu salário: ");
		salario= ler.nextInt();
		
		System.out.print("Informe seu tempo de trabalho: ");
		temp= ler.nextInt();
		
		switch (temp) {
		case 0, 1, 2, 3:
			aum = (salario*1.07);
		System.out.print("O novo sálario é: " + aum);
		
		default:
			aum = (salario*1.05);
		System.out.print("O novo sálario é: " + aum);
		}

	}

}
