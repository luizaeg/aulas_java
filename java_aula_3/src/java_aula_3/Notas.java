package java_aula_3;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		
	// Laços Condicionais	
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite a nota do aluno: \n");
		float nota = leia.nextFloat();
		
				
		if (nota >= 7) {
			System.out.println("Aluno Aprovado! ");
		}
		
		else if (nota >= 5 || nota < 7) {
			System.out.println("Aluno Exame! ");
		}
		
		else {
			System.out.println("Aluno Reprovado! ");
		}
        
		
		
		leia.close();
		
	}

}
