package lpa;

import java.util.Scanner;

public class abril_ternario2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int salario, temp;
	
	System.out.println("Digite seu sálario");
	salario = ler.nextInt();
	
	System.out.println("Digite seu tempo de trabalho");
	temp = ler.nextInt();
	
	String mensagem = temp >3 ? "Seu novo sálario é :" + (salario*1.07): "Seu novo sálario é" + (salario*1.05) ;
	System.out.println(mensagem);
	}

}
