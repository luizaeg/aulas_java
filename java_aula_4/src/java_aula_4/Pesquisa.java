package java_aula_4;

import java.util.Scanner;

public class Pesquisa {

	public static void main(String[] args) {
		
	// Exercício de fixação - Pesquisa
		
 Scanner leia = new Scanner(System.in);
 
 int idade, esporte, 
     futebol = 0, voleibolM18 = 0, basqueteMn18 = 0, outros = 0, 
     totalRespostas = 0, somaIdades = 0;
 
 String continua = "S";
 
 while (continua.equalsIgnoreCase("S")) {
      
	 System.out.println("Digite a sua idade: ");
	 idade = leia.nextInt();
	 
	 System.out.println("Digite o seu esporte preferido (1- Fut / 2- Vol / 3- Basq / 4- Outros): ");
	 esporte = leia.nextInt();
	 
	 // Quantas pessoas gostam de futebol?
	 if(esporte == 1) {
		 futebol ++;
	 }
	 
	 // Quantas pessoas gostam de volei e são maiores de 18 anos
	 if (esporte == 2 && idade > 18) {
		 voleibolM18 ++;		 
	 }
	 
	// Quantas pessoas gostam de basquete e são menores de 18 anos
		 if (esporte == 3 && idade < 18) {
			 basqueteMn18 ++;
	}

	
	// Calculo da média de idade	 
    totalRespostas ++;
	somaIdades += idade;
	
	System.out.println("Deseja continuar (S/N)? ");
	leia.skip("\\R");
	continua = leia.nextLine().toUpperCase();
	
	double media = Math.round(somaIdades / totalRespostas);
	
	System.out.printf("\nTotal de pessoas que gostam de futebol: %d", futebol);
	System.out.printf("\nTotal de pessoas que gostam de volei: %d", voleibolM18);	
	System.out.printf("\nTotal de pessoas que gostam de basquete: %d", basqueteMn18);
	System.out.printf("\nTotal de pessoas que gostam de outros: %d", outros);
	System.out.println("\nMédia de idade: " + media);
      }	
 
   }
	
}
