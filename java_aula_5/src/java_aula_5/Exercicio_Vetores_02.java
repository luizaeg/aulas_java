package java_aula_5;

import java.util.Scanner;;

public class Exercicio_Vetores_02 {

	public static void main(String[] args) {
		
	// Exercicio Vetores - 02
	
	int[] numeros = {2,5,1,3,4,9,7,8,10,6};
	int soma = 0;
	int quantidade = numeros.length;
	
	// �ndices �mpares e n�meros pares
	
	System.out.print("Elementos nos �ndices �mpares: \n");
	boolean primeiro = true;
	for (int i =0; i < numeros.length; i++) {
		if (i % 2 != 0) {
			if (!primeiro) {
			System.out.print(", ");
		}
			 System.out.print(numeros[i]);
		        primeiro = false;
		}
	}	
			
	System.out.print("\nElementos pares: \n");
	primeiro = true;
	for (int i =0; i < quantidade; i++) {
		if (numeros[i] % 2 == 0) {
			if (!primeiro) {
	            System.out.print(", ");
	        }
	        System.out.print(numeros[i]);
	        primeiro = false;
	    }
	}
		
	// soma
	
	for (int i =0; i < quantidade; i++) {
		soma += numeros[i]; }
		System.out.print("\nSoma: " + soma);
	   
	// m�dia
	
	double media = (double) soma / quantidade;
	System.out.printf("\nM�dia: %.2f\n", media);
	
				
				
  }
}
