package java_aula_5;

import java.util.Scanner;

public class Exercicio_Matriz_01 {

	public static void main(String[] args) {
		

	// Exercicio Matriz - 01	
		
	Scanner leia = new Scanner(System.in);
		
	int [][] matriz = new int [3][3];
	
	// Valores da matriz
	
	System.out.println("Digite 9 elementos da matriz 3x3:");
	for (int i =0; i < 3; i++) {
		for (int j=0; j <3; j++) {
			matriz [i][j] = leia.nextInt();
		}
	}
	
	// Diagonal Principal
	System.out.println("\nElementos da Diagonal Principal:");
    int somaPrincipal = 0;
    for (int i = 0; i < 3; i++) {
        System.out.print(matriz[i][i] + " ");
        somaPrincipal += matriz[i][i];
    }
    
    // Diagonal Secundária
    System.out.println("\n\nElementos da Diagonal Secundária:");
    int somaSecundaria = 0;
    for (int i = 0; i < 3; i++) {
        System.out.print(matriz[i][2 - i] + " ");
        somaSecundaria += matriz[i][2 - i];
    }
    
    // Soma
    System.out.println("\n\nSoma dos Elementos da Diagonal Principal:");
    System.out.println(somaPrincipal);
    
    System.out.println("\nSoma dos Elementos da Diagonal Secundária:");
    System.out.println(somaSecundaria);
	
	}

}
