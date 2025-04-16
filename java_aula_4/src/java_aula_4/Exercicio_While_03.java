package java_aula_4;

import java.util.Scanner;

public class Exercicio_While_03 {

	public static void main(String[] args) {
	
		// Exercício While - 03
		
		Scanner leia = new Scanner(System.in);
		
		int idade = 0;
		int menores = 0;
		int maiores = 0;
		
		System.out.print("Digite uma idade: ");
		idade = leia.nextInt();
				
		while (idade > 0) {
			if (idade < 21) {
				menores ++;
			} else if (idade > 50) {
				maiores ++;
			}
			
			System.out.print("Digite uma idade: ");
			idade = leia.nextInt();
			
		}
		
		System.out.println("Total de pessoas menores de 21 anos: " + menores);
		System.out.println("Total de pessoas maiores de 50 anos: " + maiores);	
		

	}

}
