package lpa;

import java.util.Scanner;

public class abril_else {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double sala, temp, aum;
			
		System.out.print("Informe seu salário: ");
		sala= ler.nextDouble();
		
		System.out.print("Informe seu tempo de trabalho: ");
		temp= ler.nextDouble();
			
		if (temp > 3) {
		aum = sala*1.07;
		System.out.println("O aumento do salário é :" + aum);
		    }
		else {
			aum = sala*1.05;
		System.out.println("O aumento do sálario é :" + aum);
			
		ler.close();
	}

}
}