package java_aula_2;

import java.util.Scanner;


public class variaveis_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		// Definição de variáveis e constantes
		System.out.println("Digite o primeiro numero inteiro: ");
		int numero_01 = leia.nextInt();
		System.out.println("Digite o segundo numero inteiro: ");
		int numero_02 = leia.nextInt();
		
		
		final double PI = 3.1415;
		String nome = "Luiza";
		char inicial = 'L';
		boolean maiorDeIdade = true;
		
	 		
		
		System.out.println("Idade: " + numero_01);
		System.out.println("PI é igual a: " + PI);
		System.out.println("Meu nome é: " + nome.toUpperCase());
		
		
	}

}
