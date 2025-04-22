package java_aula_6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ColecaoSet {

	public static void main(String[] args) {
	
	// Cole��o Set
		
	Set<String> frutas = new HashSet<String>();
	Scanner leia = new Scanner(System.in);
	
	frutas.add("Ma��");
	frutas.add("Banana");
	frutas.add("Morango");
	frutas.add("Abacaxi");
	frutas.add("Mam�o");
	frutas.add("abacaxi");

	for(var fruta : frutas) {
		System.out.println(fruta.hashCode());
	}
	
	System.out.println("\n"+frutas);
	
	// Contem (false or true)
	
	System.out.println("\nExiste Morango na cole��o? " + frutas.contains("Morango"));
	
	// Remove para String
	
	System.out.println("\nCole��o ap�s remove");
	frutas.remove("abacaxi");
	frutas.forEach(System.out::println);

	// Criar um Iterator
	
	Iterator<String> iFrutas = frutas.iterator();
	
	System.out.println("\nCole��o com Iterator");
	while(iFrutas.hasNext()) {
		System.out.println(iFrutas.next());
	}
	
	// Criar Array List com Strings
	
	ArrayList<String> frutasList = new ArrayList<String>();
	
	frutasList.addAll(frutas);
	frutasList.sort(null);
	System.out.println("\nExibir os dados no Array List");
	frutasList.forEach(System.out::println);
	
	// Ordenando Strings ap�s Array List
	
	frutasList.sort(null);
	
	leia.close();
	
	}

}
