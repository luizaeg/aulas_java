package java_aula_4;

import java.util.Scanner;

public class Exercicio_For_01 {

	public static void main(String[] args) {
	
		// Exercicio For - 01

	Scanner leia = new Scanner(System.in);
	
	System.out.println("Digite o primeiro n�mero do intervalo: ");
	int primeiroNumero = leia.nextInt();
	
	System.out.println("Digite o segundo n�mero do intervalo: ");
	int segundoNumero = leia.nextInt();
	
	
	// Definindo as condi��es
	
		
	if (primeiroNumero >= segundoNumero) {
		System.out.println("Intervalo Inv�lido!");return;
	}
	
	// Definindo o intervalo
	
	System.out.printf("\nNo intervalo entre %d e %d:\n\n" , primeiroNumero, segundoNumero);
	
		for(int i = primeiroNumero; i <= segundoNumero; i ++) {
			if (i % 3 == 0 && i % 5 == 0)
			System.out.println(i + " � m�ltiplo de 3 e 5");
		}
	
	leia.close();
		
	}

}
