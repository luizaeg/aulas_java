package java_aula_7;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Exercicio_Pilha_01 {

	public static void main(String[] args) {
	
	// Exercicio Pilha - 01
		
		Stack<String> pilha = new Stack<String>();
		Scanner leia = new Scanner(System.in);
		int codigo =0;
		String nome;
		
		System.out.println("********************************");
		System.out.println("1 - Adicionar Livro na Pilha    ");
		System.out.println("2 - Listar todos os Livros      ");
		System.out.println("3 - Retirar Livro da Pilha      ");
		System.out.println("0 - Sair                        ");
		System.out.println("********************************");
		
		
		do {
			System.out.println("\nDigite a opção desejada: ");
			codigo = leia.nextInt();
			
			switch(codigo) {
			case 1:
			System.out.println("\nDigite o nome: ");
			nome = leia.nextLine();
			pilha.push(leia.nextLine());
			System.out.println("\nPilha:");
			for (String livros : pilha) {
				System.out.println("- "+livros);
			}
			System.out.println("Livro Adicionado!");
			break;
			case 2:
				if (pilha.isEmpty()) {
					System.out.println("A Pilha está vazia!");
				} else {
					System.out.println("Lista de livros na Pilha:");
					for (String livro : pilha) {
						System.out.println("- "+livro);
					}
				}
				break;
			case 3:
				if (pilha.isEmpty()) {
					System.out.println("A Pilha está vazia!");
				} else {
					pilha.pop();
				} System.out.println("\nUm Livro foi retirado da pilha!\n");
				Iterator<String> it = pilha.iterator();
				while (it.hasNext()) {
					String pilhaNew = it.next();
					System.out.println(pilhaNew);
				}
				break;
			case 0:
				   System.out.println("\nPrograma Finalizado!\n");
				   break;
			}
			
						
		} while (codigo !=0);
		
		
		leia.close();
		

	}

}
