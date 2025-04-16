package java_aula_4;

import java.util.Scanner;

public class Exercicio_For_02 {

	public static void main(String[] args) {
	
		// Exercicio For - 02
		
	
	Scanner leia = new Scanner(System.in);
		
	int numero = 0;
	int pares = 0;
	int impares = 0;
	int i;
	

	
	for (i = 1; i <= 10; i++) {
		System.out.print("Digite o " + i + "º número: ");
		numero = leia.nextInt();
		
	if (numero % 2 == 0) {
		pares++;
	} else {
		impares ++;
	}
	}
	System.out.println("Quantidade de números pares: " + pares);
	System.out.println("Quantidade de números ímpares: " + impares);
	}
	
}
