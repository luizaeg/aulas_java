package java_aula_4;

import java.util.Scanner;

public class Exercicio_DoWhile_06 {

	public static void main(String[] args) {
	
		// Exercicio Do While - 05
		
		Scanner leia = new Scanner(System.in);
		
		int numero=0;
		int somaMultiplosDeTres = 0;
		int contadorMultiplosDeTres = 0;
		double mediaNumero=0;
		
		
		do {
		System.out.print("Digite um número (0 para sair): ");
		numero = leia.nextInt();	
		
		if (numero != 0 && numero % 3 == 0) {
			somaMultiplosDeTres += numero;
			contadorMultiplosDeTres++;
		} 
			
			
		} while (numero != 0);
	
		// Média após encerrado
	
		if (contadorMultiplosDeTres > 0) {
		mediaNumero = (double) somaMultiplosDeTres / contadorMultiplosDeTres;
				
		//Resultados
	    System.out.println("A média de todos os números múltiplos de 3 é: " + mediaNumero);

					} 
						
 }
}
