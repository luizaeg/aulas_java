package java_aula_5;

import java.util.Scanner;

public class Exercicio_Vetores_01 {

	public static void main(String[] args) {
	
		// Exercicio Vetores - 01
		
	int[] numeros = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
	
	Scanner leia = new Scanner(System.in);
	System.out.println("Digite o número que você deseja encontrar: ");
	int numeroProcurado = leia.nextInt();
	
	boolean encontrado = false;
	
	for (int i =0; i < numeros.length; i++) {
		if (numeros[i] == numeroProcurado) {
			System.out.println("O número " + numeroProcurado + " está localizado na posição: " + i);
			encontrado = true;
			break;
		}
	}
		if (!encontrado) {
			System.out.println("O número " + numeroProcurado + " não foi encontrado!");
			}
		
		
		leia.close();
		
	}
		
 }

