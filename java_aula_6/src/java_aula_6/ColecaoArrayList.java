package java_aula_6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;


public class ColecaoArrayList {

	public static void main(String[] args) {
	
	// Criando a coleção Array List
		
	Scanner leia = new Scanner(System.in);
	ArrayList<Double> numeros = new ArrayList<Double>();
	
	// Adicionando valores da coleção
	
	numeros.add(2.0);
	numeros.add(3.0);
	numeros.add(9.0);
	numeros.add(6.0);
	numeros.add(2.0);
	
	System.out.println("Digite um número real: ");
	double input = leia.nextDouble();
	
	numeros.add(input);
		
	// Listando os valores da coleção 
	for(var numero : numeros) {
		System.out.println(numero);
	}
	
	// Posição de índice
	
	System.out.println("\nÍndice do número 9: " + numeros.indexOf(9.0));
	
	
	// Contem (true or false)
	
	System.out.println("\nContem o número 9? " + numeros.contains(9.0));
	
	// Método Get
	
	System.out.println("\nQual valor está armazenado no índice 2? " + numeros.get(2));
	
	// Alterar valor de um elemento
	
	numeros.set(2, 10.0);
	System.out.println("\nNova lista após atualização:");
	numeros.forEach(System.out::println);
	
	// Excluir um elemento da lista, com base no índice
	
	numeros.remove(2);
	System.out.println("\nNova lista após exclusão da posição do índice:");
	numeros.forEach(System.out::println);
	
	// Excluir um elemento da lista, com base no número (o primeiro que for encontrado, caso apareça mais de uma vez)
	
	numeros.remove(2.0);
	System.out.println("\nNova lista após exclusão do elemento:");
	numeros.forEach(System.out::println);
	
	// Tamanho da coleção final
	
	System.out.println("\nQual o tamanho da Coleção? " + numeros.size());
	System.out.println("Coleção vazia? " + numeros.isEmpty());
	
	
	// Método Sort - Crescente (padrão)
	
	numeros.sort(null);
	System.out.println("\nElementos em ordenação crescente:");
	numeros.forEach(System.out::println);

	// Método Sort - Decrescente (reverse order)

	System.out.println("\nElementos em ordenação decrescente:");	
	numeros.sort(Comparator.reverseOrder());
	numeros.forEach(System.out::println);
	
	// Limpar coleção
	
	numeros.clear();
	System.out.println("\nApós clear:");
	System.out.println("Coleção vazia? " + numeros.isEmpty());
	
	leia.close();

	}

}
