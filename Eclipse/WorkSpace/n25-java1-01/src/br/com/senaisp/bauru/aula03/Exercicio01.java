package br.com.senaisp.bauru.aula03;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número "
				+ "inteiro de até 3 dígitos");
		int vlr = sc.nextInt(); //solicita ao user o valor
		int c = vlr / 100;
		int d = vlr % 100 / 10;
		int u = vlr % 10;
		int vlrinv = u * 100 + d * 10 + c;
		System.out.println(vlrinv);
		sc.close();
	}

}
