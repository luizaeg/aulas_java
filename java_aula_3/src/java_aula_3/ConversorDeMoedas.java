package java_aula_3;

import java.util.Scanner;

public class ConversorDeMoedas {

	public static void main(String[] args) {
		
// Switch case		

	Scanner leia = new Scanner(System.in);
	
	double valorConvertido = 0.0d;
	String moeda = "";
	
	System.out.println("********************************");
	System.out.println("***   Conversor de Moedas   ****");
	System.out.println("********************************");
	System.out.println("1 - Converter para Dólar (USD$) ");
	System.out.println("2 - Converter para Euros (EUR$) ");
	System.out.println("3 - Converter para Pesos (AR$)  ");
	System.out.println("********************************");
	System.out.println("Digite a opção desejada:        ");
	
	int opcao = leia.nextInt();
	
	System.out.println("Digite valor em Reais (R$)");
	double valor = leia.nextDouble();
	
	switch(opcao) {
	   case 1:
		   valorConvertido = valor / 5.86;
		   moeda = "Dólar";
		   
	          break;
	          
	   case 2:
		   valorConvertido = valor / 6.63;
		   moeda = "Euro";
	       	 
	         break; 
	         
	   case 3:
		   valorConvertido = valor / 0.0049;
		   moeda = "Peso Argentino";
	       
		     break;
	}
	
	System.out.printf("Valor Convertido em %s: %.2f", moeda, valorConvertido);
		     
	}
	
	}


