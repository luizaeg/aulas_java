package java_aula_4;

import java.util.Scanner;

public class TabuadaWhile {

	public static void main(String[] args) {
		

	//Laços de Repetição - While
		
	Scanner leia = new Scanner(System.in);

 System.out.println("Digite um número inteiro: ");
	int numero = leia.nextInt();
				
    int contador = 1;
	
  while(contador <= 10) {
	System.out.printf("\n %d x %d = %d" , numero , contador , (numero * contador));
	contador ++;
		}
  
				
	leia.close();		
		
		
	}

}
