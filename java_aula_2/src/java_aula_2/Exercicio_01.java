package java_aula_2;

import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o salário: ");
        float salario = leia.nextFloat();
        
        System.out.println("Digite o abono: ");
        float abono = leia.nextFloat();		
		
        float novoSalario = salario + abono;
        
        System.out.printf("Novo salário: R$ %.2f", novoSalario);
        
	}

}
