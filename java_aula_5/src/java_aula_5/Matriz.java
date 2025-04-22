package java_aula_5;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		
	// Matriz - Laço for tradicional
		
		int matrizInteiros[][] = {{10, 15, 35}, {70, 120, 140}, {50, 100, 150}};
		
		for(int linha =0; linha < matrizInteiros.length; linha ++) {
			for(int coluna =0; coluna < matrizInteiros.length; coluna ++)
			System.out.printf("\nmatrizInteiros[%d][%d] = %d", linha, coluna, matrizInteiros[linha][coluna]);	
		}
		
	// Matriz float
		
		Scanner leia = new Scanner(System.in);
		Float matrizReal[] [] = new Float[3][3];
		
		for(int linha =0; linha < matrizReal.length; linha ++) {
			for(int coluna =0; coluna < matrizReal.length; coluna ++) {
			System.out.println("\nDigite um número Real: ");
			matrizReal[linha][coluna] = leia.nextFloat();
	  }
		}
	
		for(Float[] vetor : matrizReal) {
			for(var valor : vetor) {
				System.out.println("Exibir a posição atual: " + valor);
			}
		}
		
	// Matriz Irregular
		
		int matrizIrregular[][] = {{10, 15}, {70, 120}, {50, 100}};	
		
		for(int linha =0; linha < matrizIrregular.length; linha ++) {
			for(int coluna =0; coluna < matrizIrregular[linha].length; coluna ++)
			System.out.printf("\nmatrizIrregular[%d][%d] = %d", linha, coluna, matrizIrregular[linha][coluna]);	
		}
		
		
	}
}
