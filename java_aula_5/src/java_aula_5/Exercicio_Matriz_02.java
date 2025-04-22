package java_aula_5;

import java.util.Scanner;

public class Exercicio_Matriz_02 {

	public static void main(String[] args) {
		
	// Exercicio Matriz - 02
		
		Scanner leia = new Scanner(System.in);
		
		// Definindo as constantes
        final int NUM_PARTICIPANTES = 10;
        final int NUM_BIMESTRES = 4;
        
        // Criando a matriz para armazenar as notas (10 participantes x 4 bimestres)
        double[][] notas = new double[NUM_PARTICIPANTES][NUM_BIMESTRES];
        
        // Criando o vetor para armazenar as médias
        double[] medias = new double[NUM_PARTICIPANTES];
        
        System.out.println("Digite as notas dos " + NUM_PARTICIPANTES + " participantes:");
        
        // Loop para ler as notas de cada participante
        for (int i = 0; i < NUM_PARTICIPANTES; i++) {
            System.out.println("\nParticipante " + (i + 1) + ":");
            double soma = 0;
            
            // Loop para ler as notas de cada bimestre
            for (int j = 0; j < NUM_BIMESTRES; j++) {
                System.out.print("Bimestre " + (j + 1) + ": ");
                notas[i][j] = leia.nextDouble();
                soma += notas[i][j];
            }
            
            // Calculando a média do participante
            medias[i] = soma / NUM_BIMESTRES;
        }
        
        // Exibindo as médias
        System.out.println("\nMédias dos participantes:");
        for (int i = 0; i < NUM_PARTICIPANTES; i++) {
            System.out.printf("Participante %d: %.1f\n", (i + 1), medias[i]);
        }
        
        leia.close();
    }
}