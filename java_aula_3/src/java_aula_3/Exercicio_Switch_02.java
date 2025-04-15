package java_aula_3;

import java.util.Scanner;

public class Exercicio_Switch_02 {

	public static void main(String[] args) {
		
	// Exercício Switch - 02
		
	
		Scanner leia = new Scanner(System.in);
		
		
		int codigoOperacao;
		float valor;
	    float saldo = 1000.00f;
	    
			
			
		System.out.println("********************************");
		System.out.println("*** Selecione sua Operação *****");
		System.out.println("********************************");
		System.out.println("1 - Saldo                       ");
		System.out.println("2 - Saque                       ");
		System.out.println("3 - Depósito                    ");
		System.out.println("********************************");
		
	    System.out.println("Digite o código da operação:        ");
		codigoOperacao= leia.nextInt();
		
		
			
		switch(codigoOperacao) {
		   case 1:
			   System.out.printf("Seu saldo atual é: R$ %.2f\n", saldo);
			   break;
		   case 2:
			   System.out.printf("Digite o Valor a ser sacado: R$ ");
			   valor = leia.nextFloat();
			   if (valor > saldo) {
                   System.out.printf("Saldo insuficiente!");
               } else {
            	   saldo -= valor; 
                   System.out.printf("Saque realizado com sucesso!\nNovo saldo: R$ %.2f\n", saldo);
               }
			   break;	   
		   case 3: 
				System.out.printf("Digite o valor a ser depositado: R$ ");
	            valor = leia.nextFloat();
	               saldo += valor;
	               System.out.printf("Depósito realizado com sucesso!\nNovo saldo: R$ %.2f\n", saldo);
	            break;   
		   case 4:
			   System.out.printf("Operação Inválida!");
			   break;   
            
		  
		  
		}
		
		
		
		leia.close();
		
		}

	}