package java_aula_2;

import java.util.Scanner;

public class Exercicio_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		
			
		System.out.println("Sal�rio Bruto: ");
        float salarioBruto = leia.nextFloat();
        
    	System.out.println("Adicional Noturno: ");
        float adicionalNoturno = leia.nextFloat();
        
    	System.out.println("Horas Extras: ");
        float horasExtras = leia.nextFloat();
        
    	System.out.println("Descontos: ");
        float descontos = leia.nextFloat();
        
        float salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
        
        System.out.printf("Sal�rio L�quido:  %.2f", salarioLiquido);

	}

}
