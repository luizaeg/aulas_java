package java_aula_7;

import java.util.LinkedList;
import java.util.Queue;

public class fila {

	public static void main(String[] args) {
	
	// M�todo fila (queue)
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
	System.out.println("\nAdicionando � fila");
	System.out.println(fila);
	
	// Mostrar quem � o head da fila
	System.out.println("\nHead - peek");
	System.out.println(fila.peek());
	System.out.println("\nFila, ap�s peek");
	System.out.println(fila);
	
	// Mostrar quem � o head da fila e o remove
	System.out.println("\nHead - poll");
	System.out.println(fila.poll());
	System.out.println("\nFila, ap�s poll");
	System.out.println(fila);
	
	
	// Mostrar a existencia de algum elemento
	System.out.println("\nA Maria est� na fila?");
	System.out.println(fila.contains("Maria"));
	System.out.println("E o Carlos?");
	System.out.println(fila.contains("Carlos"));
	
	// Mostrar o tamanho da fila
		System.out.println("\nQuantas pessoas na fila?");
		System.out.println(fila.size());
		
	// Busca da posi��o, ignorando uppercase	
	int contador =0;
	for (var pessoa : fila) {
		contador ++; 
		if (pessoa.equalsIgnoreCase("maria")) {
			System.out.println("\nPosi��o da Maria:");
			System.out.println(contador+"� lugar");
		}
	}
	
	
		
	}

}
