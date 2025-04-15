package java_aula_3;

import java.util.Scanner;

public class Exercicio_Switch_01 {

	public static void main(String[] args) {
		
		// Exercício Switch - 01

	Scanner leia = new Scanner(System.in);
	
	
	int quantidade, codigoProduto;
	double valor = 0, valorTotal;
    String produto = "";
		
		
	System.out.println("********************************");
	System.out.println("****   Peça seu lanche:   ******");
	System.out.println("********************************");
	System.out.println("1 - Cachorro Quente - R$ 10,00  ");
	System.out.println("2 - X - Salada      - R$ 15,00  ");
	System.out.println("3 - X-Bacon         - R$ 18,00  ");
	System.out.println("4 - Bauru           - R$ 12,00  ");
	System.out.println("5 - Refrigerante    - R$ 08,00  ");
	System.out.println("6 - Suco de Laranja - R$ 13,00  ");
	System.out.println("********************************");
	
    System.out.println("Digite a opção desejada:        ");
	codigoProduto = leia.nextInt();
	
	
	System.out.println("Digite a Quantidade:            ");
	quantidade = leia.nextInt();
	
	
	switch(codigoProduto) {
	   case 1:
		   valor = 10;
		   produto = "Cachorro Quente";
		   break;
	   case 2:
		   valor = 15;
		   produto = "X-Salada";
		   break;	   
	   case 3:
		   valor = 18;
		   produto = "X-Bacon";
		   break;   
	   case 4:
		   valor = 12;
		   produto = "Bauru";
		   break;
	   case 5:
		   valor = 8;
		   produto = "Refrigerante";
		   break;
	   case 6:
		   valor = 13;
		   produto = "Suco de Laranja";
		   break;
	}
	
	valorTotal = valor * quantidade;
	
	System.out.printf("\nProduto escolhido: %s", produto);
	System.out.printf("\nQuantidade: %d", quantidade);
	System.out.printf("\nValor total: R$ %.2f\n", valorTotal);
	
	leia.close();
	
	}

}
