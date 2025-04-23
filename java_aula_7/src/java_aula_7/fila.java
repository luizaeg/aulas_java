package java_aula_7;

import java.util.LinkedList;
import java.util.Queue;

public class fila {

	public static void main(String[] args) {
	
	// Método fila (queue)
	Queue<String> fila = new LinkedList<String>();
	
	// Formando a fila
	fila.add("Carlos");
	fila.add("Giovana");
	fila.add("Livia");
	fila.add("Maria");
	fila.add("Samuel");
	fila.add("Fabricio");
	fila.add("Victor");
	
	// Imprimindo a fila
	System.out.println(fila);
	
	// Removendo
	fila.remove();
	System.out.println("\nRemovendo da fila");
	System.out.println(fila);
		
	// Adicionando
	fila.add("Thiago");
	System.out.println("\nAdicionando à fila");
	System.out.println(fila);
	
	// Mostrar quem é o head da fila
	System.out.println("\nHead - peek");
	System.out.println(fila.peek());
	System.out.println("\nFila, após peek");
	System.out.println(fila);
	
	// Mostrar quem é o head da fila e o remove
	System.out.println("\nHead - poll");
	System.out.println(fila.poll());
	System.out.println("\nFila, após poll");
	System.out.println(fila);
	
	
	// Mostrar a existencia de algum elemento
	System.out.println("\nA Maria está na fila?");
	System.out.println(fila.contains("Maria"));
	System.out.println("E o Carlos?");
	System.out.println(fila.contains("Carlos"));
	
	// Mostrar o tamanho da fila
		System.out.println("\nQuantas pessoas na fila?");
		System.out.println(fila.size());
		
	// Busca da posição, ignorando uppercase	
	int contador =0;
	for (var pessoa : fila) {
		contador ++; 
		if (pessoa.equalsIgnoreCase("maria")) {
			System.out.println("\nPosição da Maria:");
			System.out.println(contador+"º lugar");
		}
	}
	
	
		
	}

}
