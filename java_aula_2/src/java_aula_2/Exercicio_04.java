package java_aula_2;

import java.util.Scanner;

public class Exercicio_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("numero1: ");
        float n1 = leia.nextFloat();

        System.out.print("numero2: ");
        float n2 = leia.nextFloat();

        System.out.print("numero3: ");
        float n3 = leia.nextFloat();

        System.out.print("numero4: ");
        float n4 = leia.nextFloat();

        float diferenca = (n1 * n2) - (n3 * n4);
        
        System.out.printf("Diferença: %.1f\n" , diferenca);
        
        System.out.println();
        
        System.out.print("numero1: ");
        float n1_1 = leia.nextFloat();

        System.out.print("numero2: ");
        float n2_2 = leia.nextFloat();

        System.out.print("numero3: ");
        float n3_3 = leia.nextFloat();

        System.out.print("numero4: ");
        float n4_4 = leia.nextFloat();

        float diferenca2 = (n1_1 * n2_2) - (n3_3 * n4_4);
        
        System.out.printf("Diferença: %.1f" , diferenca2);

	}

}
