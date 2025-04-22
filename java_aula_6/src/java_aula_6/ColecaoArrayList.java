package java_aula_6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;


public class ColecaoArrayList {

	public static void main(String[] args) {
	
	// Criando a cole��o Array List
		
	Scanner leia = new Scanner(System.in);
	ArrayList<Double> numeros = new ArrayList<Double>();
	
	// Adicionando valores da cole��o
	
	numeros.add(2.0);
	numeros.add(3.0);
	numeros.add(9.0);
	numeros.add(6.0);
	numeros.add(2.0);
	
	System.out.println("Digite um n�mero real: ");
	double input = leia.nextDouble();
	
	numeros.add(input);
		
	// Listando os valores da cole��o 
	for(var numero : numeros) {
		System.out.println(numero);
	}
	
	// Posi��o de �ndice
	
	System.out.println("\n�ndice do n�mero 9: " + numeros.indexOf(9.0));
	
	
	// Contem (true or false)
	
	System.out.println("\nContem o n�mero 9? " + numeros.contains(9.0));
	
	// M�todo Get
	
	System.out.println("\nQual valor est� armazenado no �ndice 2? " + numeros.get(2));
	
	// Alterar valor de um elemento
	
	numeros.set(2, 10.0);
	System.out.println("\nNova lista ap�s atualiza��o:");
	numeros.forEach(System.out::println);
	
	// Excluir um elemento da lista, com base no �ndice
	
	numeros.remove(2);
	System.out.println("\nNova lista ap�s exclus�o da posi��o do �ndice:");
	numeros.forEach(System.out::println);
	
	// Excluir um elemento da lista, com base no n�mero (o primeiro que for encontrado, caso apare�a mais de uma vez)
	
	numeros.remove(2.0);
	System.out.println("\nNova lista ap�s exclus�o do elemento:");
	numeros.forEach(System.out::println);
	
	// Tamanho da cole��o final
	
	System.out.println("\nQual o tamanho da Cole��o? " + numeros.size());
	System.out.println("Cole��o vazia? " + numeros.isEmpty());
	
	
	// M�todo Sort - Crescente (padr�o)
	
	numeros.sort(null);
	System.out.println("\nElementos em ordena��o crescente:");
	numeros.forEach(System.out::println);

	// M�todo Sort - Decrescente (reverse order)

	System.out.println("\nElementos em ordena��o decrescente:");	
	numeros.sort(Comparator.reverseOrder());
	numeros.forEach(System.out::println);
	
	// Limpar cole��o
	
	numeros.clear();
	System.out.println("\nAp�s clear:");
	System.out.println("Cole��o vazia? " + numeros.isEmpty());
	
	leia.close();

	}

}
