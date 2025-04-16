package java_aula_4;

import java.util.Scanner;

public class TabuadaFor {

	public static void main(String[] args) {
	
	//Laços de Repetição - FOR
		
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um número inteiro: ");
		int numero = leia.nextInt();
		
		for(int contador = 1; contador <= 10; contador ++) {
			System.out.printf("\n %d x %d = %d" , numero , contador , (numero * contador));
		}
		
		
		leia.close();
	}

}
