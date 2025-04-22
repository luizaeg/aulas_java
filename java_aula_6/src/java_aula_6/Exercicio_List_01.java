package java_aula_6;

import java.util.ArrayList;
import java.util.Scanner;


public class Exercicio_List_01 {

	public static void main(String[] args) {
		
	// Exercicio List - 01
		
		ArrayList<String> cores = new ArrayList<String>();
		Scanner leia = new Scanner(System.in);
		
	// Laço for
		
		System.out.println("Digite 5 cores: ");
		
		for (int i=0; i <5; i++) {
			System.out.print("Cor" + (i + 1) + ": ");
			String cor = leia.nextLine();
			cores.add(cor);
		}
		
	// Listando os valores
		
	   System.out.println("\n"+cores);	
		
		
	// Ordenar
		
		cores.sort(null);
		System.out.println("\nOrdenar cores: ");
		cores.forEach(System.out::println);
		
		
		leia.close();

	}

}
