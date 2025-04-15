package java_aula_3;

import java.util.Scanner;

public class Exercicio_If_01 {

	public static void main(String[] args) {
		
	// Exercicios IF - 01 
		
Scanner leia = new Scanner(System.in);

int num_A_1 = 2;
int num_B_1 = 4;
int num_C_1 = 5;

int num_A_2 = 2;
int num_B_2= 2;
int num_C_2= 5;

int num_A_3 = 2;
int num_B_3= 2;
int num_C_3= 4;

int soma1 = num_A_1 + num_B_1;
boolean result1 = soma1 > num_C_1;

if (soma1 > num_C_1){
	System.out.println("A Soma de A + B é Maior do que C");
}
		
int soma2 = num_A_2 + num_B_2;
boolean result2 = soma2 > num_C_2;

if (soma2 < num_C_2){
	System.out.println("A Soma de A + B é Menor do que C");
}

int soma3 = num_A_3 + num_B_3;
boolean result3 = soma3 > num_C_3;

if (soma3 == num_C_3){
	System.out.println("A Soma de A + B é Igual a C");
}
		
	leia.close();
	
	
	}

}
