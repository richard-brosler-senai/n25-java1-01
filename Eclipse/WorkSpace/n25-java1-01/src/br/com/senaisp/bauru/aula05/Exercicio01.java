package br.com.senaisp.bauru.aula05;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		//Usando o scanner para ler um arquivo texto
		Scanner sc = new Scanner(
				Exercicio01.class.getResourceAsStream("arquivo.txt"));
		String linha = sc.nextLine(); //pegando cabeçalho
		Scanner sca = new Scanner(linha);
		sca.useDelimiter(";");
		//Imprimindo o cabecalho
		while(sca.hasNext()) {
			System.out.print(sca.next()+"\t\t");// \t = tab
		}
		System.out.println(); //pulando a linha
		sca.close(); //fechando o scanner de apoio
		while(sc.hasNextLine()) {
			linha = sc.nextLine();
			sca = new Scanner(linha).useLocale(Locale.US);
			sca.useDelimiter(";");//Delimitador
			//Imprimindo o nome
			System.out.print(sca.next()+"\t");//nome
			//Imprimindo a idade
			System.out.print(sca.nextInt() + "\t");//idade
			//Imprimindo o salário
			System.out.println(sca.nextDouble());//salario
			//fechando o scanner de apoio
			sca.close();
		}
	}

}
