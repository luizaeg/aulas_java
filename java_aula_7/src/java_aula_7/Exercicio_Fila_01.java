package java_aula_7;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio_Fila_01 {

	public static void main(String[] args) {
	
	// Exercicio Fila(Queue) - 01
	
		Queue<String> fila = new LinkedList<String>();
		Scanner leia = new Scanner(System.in);
		int codigo;
		String nome;

		
		System.out.println("********************************");
		System.out.println("1 - Adicionar Cliente na Fila   ");
		System.out.println("2 - Listar todos os Clientes    ");
		System.out.println("3 - Retirar Cliente da Fila     ");
		System.out.println("0 - Sair                        ");
		System.out.println("********************************");
		
		do {
		System.out.println("\nDigite a opção desejada:        ");
		codigo = leia.nextInt();
		
		switch(codigo) {
		   case 1:
			   System.out.println("\nDigite o nome: ");
			   nome = leia.nextLine();
			   fila.add(leia.nextLine());
			   System.out.println("\nFila: \n");
			   for (String clientes : fila) {
				System.out.println("- " + clientes);   
				}
			   System.out.println("\nCliente Adicionado!");
			   break;
		   case 2:
			   if (fila.isEmpty()) {
				   System.out.println("A fila está vázia!\n");
			   } else {
				   System.out.println("Lista de Clientes na Fila: \n");
				   for (String cliente : fila) {
					   System.out.println("- " + cliente);
				   }
			   }
			   break;	   
		   case 3:
			 if (fila.isEmpty()) {
				 System.out.println("\nA Fila está vazia!\n");
			 } else {
				 fila.poll();
				 System.out.println("\nO Cliente foi Chamado!\n");
			 }
			 Iterator<String> itt = fila.iterator();
			 while (itt.hasNext()) {
				 String filaNewOne = itt.next();
				 System.out.println(filaNewOne);
			 }
			   break;   
		   case 0:
			   System.out.println("\nPrograma Finalizado!\n");
			   break;
		}
		
		} while (codigo != 0);
			
			leia.close();
	  
	}
}
