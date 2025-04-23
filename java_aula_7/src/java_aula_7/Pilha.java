package java_aula_7;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {

	// Método Pilha
	Stack<String> pilha = new Stack<String>();
	Scanner leia = new Scanner(System.in);
		
	
	// Push para add itens na pilha e pop para retira-los.
	
	pilha.push("Comunicação não Violenta");
	pilha.push("It: A coisa");	
	pilha.push("A coragem de ser imperfeito");
	pilha.push("Quem pensa enriquece");
	pilha.push("Diário de um Banana");
	pilha.push("Senhor dos Anéis");
	pilha.push("O Código da Vinci");	
		
	System.out.println("Pilha v1:");
	System.out.println(pilha);
	
	pilha.pop();
		
	System.out.println("\nPilha v2:");	
	System.out.println(pilha);	
	// é removido o ultimo item da pilha	
		
	System.out.println("\nPilha v3:");	
	pilha.push("Roube como um artista");
	System.out.println(pilha);
		
    // Peek
	System.out.println("\nPilha v4:");	
	System.out.println(pilha.peek());
		
	// Contem
	System.out.println("\nTem o livro Diario de um Banana?");
	System.out.println(pilha.contains("Diário de um Banana"));
	
	// Adicionar novos itens
		System.out.println("\nAdicione um novo livro:");
		pilha.push(leia.nextLine());
		System.out.println(pilha);
		
   //Iterator
	Iterator<String> it = pilha.iterator();	
	System.out.println("\nPilha v4, pós Iterator:\n");
	while (it.hasNext()) {
		String livros = it.next();
		System.out.println(livros);
	}
	
	}

}
