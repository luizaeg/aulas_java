package java_aula_4;

import java.util.Scanner;

public class TabuadaDoWhile {

	public static void main(String[] args) {
		
		//Laços de Repetição - Do While
		
		Scanner leia = new Scanner(System.in);

	 System.out.println("Digite um número inteiro: ");
		int numero = leia.nextInt();
					
	    int contador = 11;
	
   do { 
	   System.out.printf("\n %d x %d = %d" , numero , contador , (numero * contador));
		contador ++;
	    
	    
	}while(contador <= 10);
		
	  
					
		leia.close();		
	}

}
