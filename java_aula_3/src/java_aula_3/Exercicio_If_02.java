package java_aula_3;

import java.util.Scanner;

public class Exercicio_If_02 {

	public static void main(String[] args) {
		
	// Exerc�cio If - 02
		
	
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o Nome do doador: ");
        String nome = leia.nextLine();
        
        System.out.print("Digite a Idade do doador: ");
        int idade = leia.nextInt();
        
        System.out.print("Primeira doa��o de sangue? (true/false): ");
        boolean primeiraDoacao = leia.nextBoolean();
        
        
		
        if (idade >= 18 && idade <= 69) {
            if (idade >= 60 && idade <= 69 && primeiraDoacao == true) {
                System.out.println(nome + " n�o est� apto para doar sangue!");
            } else {
                System.out.println(nome + " est� apto para doar sangue!");
            }
        } else {
            System.out.println(nome + " n�o est� apto para doar sangue!");
        }
        
        
        leia.close();
		

	}

}
