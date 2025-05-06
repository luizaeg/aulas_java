package java_aula_8;

import java.util.Scanner;

public class CalculadoraMetodos {

	public static void main(String[] args) {
	
		
	Scanner leia = new Scanner(System.in);	
	int opcao;
	
	while(true) {	
	
		
		System.out.println("\nDigite o primeiro n�mero: ");	
		double numero1 = leia.nextDouble();	
		
		
		System.out.println("\nDigite o segundo n�mero: ");
		double numero2 = leia.nextDouble();	
		
		
	System.out.println("\n**********************************************");
	System.out.println("1 - Somar                                     ");
	System.out.println("2 - Subtrair                                  ");
	System.out.println("3 - Multiplicar                               ");
	System.out.println("4 - Dividir                                   ");
	System.out.println("0 - Sair                                      ");
	System.out.println("**********************************************");
	System.out.println("Qual opera��o matem�tica voc� deseja executar?");	
	
	opcao = leia.nextInt();

	
	
	if(opcao==0) {
		sobre();
		System.exit(0);
	} else if(opcao > 4) {
		System.out.println("Op��o Inv�lida!");
	}

	
	
	switch(opcao) {
	case 1 -> System.out.printf("\n%.2f + %.2f = %.2f\n", numero1, numero2, somar(numero1, numero2));
	case 2 -> System.out.printf("\n%.2f - %.2f = %.2f\n", numero1, numero2, subtrair(numero1, numero2));
	case 3 -> System.out.printf("\n%.2f * %.2f = %.2f\n", numero1, numero2, multiplicar(numero1, numero2));
	case 4 -> System.out.printf("\n%.2f / %.2f = %.2f\n", numero1, numero2, dividir(numero1, numero2));
	default -> System.out.println("\nOp��o Inv�lida!\n");
	}
	
	

	}
	 
	}
	
	// Criando m�todo de somam subtrair, multiplicar, dividir
	
	static double somar(double numero1, double numero2) {
		return numero1 + numero2;
	}
	
	static double subtrair(double numero1, double numero2) {
		return numero1 - numero2;
	}
	
	static double multiplicar(double numero1, double numero2) {
		return numero1 * numero2;
	}
	
	static double dividir(double numero1, double numero2) {
		return numero1 / numero2;
	}
	
	static void sobre() {
		System.out.println("Calculadora com M�todos");
		System.out.println("Feito por: Luiza");
	}
	

}
