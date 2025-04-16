package java_aula_4;

import java.util.Scanner;

public class Exercicio_DoWhile_05 {

	public static void main(String[] args) {
		
	// Exercicio Do While - 05
		
	Scanner leia = new Scanner(System.in);
	
	int numero=0;
	int somaPositivos=0;
	int numerosNegativos=0;
	
	do {
	System.out.print("Digite um número (0 para sair): ");
	numero = leia.nextInt();	
	
	if (numero > 0) {
		somaPositivos += numero;
	} else if (numero < 0){
		numerosNegativos++;
	}
	
	} while (numero != 0); 
		
			
	//Resultados
    System.out.println("A soma dos números positivos é: " + somaPositivos);

	  
	}

}
