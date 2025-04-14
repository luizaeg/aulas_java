package java_aula_2;

import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a nota 1: ");
        float nota_01 = leia.nextFloat();
        
    	System.out.println("Digite a nota 2: ");
        float nota_02 = leia.nextFloat();
        
    	System.out.println("Digite a nota 3: ");
        float nota_03 = leia.nextFloat();
        
    	System.out.println("Digite a nota 4: ");
        float nota_04 = leia.nextFloat();
        
        float mediaFinal = (nota_01 + nota_02 + nota_03 + nota_04) / 4;
        
        System.out.printf("Média final:  %.1f", mediaFinal);

	}

}
