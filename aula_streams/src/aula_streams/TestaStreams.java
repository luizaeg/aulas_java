package aula_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestaStreams {

	public static void main(String[] args) {
	
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		 
		List<Integer> numerosDesordenados = Arrays.asList(6,7,8,1,4,5,9,10,2,3);
		 
		List<String> estados = Arrays.asList("São Paulo", "Rio de Janeiro", "Minas Gerais","Espirito Santo", 

		"São Paulo", "Rio de Janeiro", "Minas Gerais", "São Paulo", "Rio de Janeiro");
		
		
		List<Integer> numerosAoCubo = numeros.stream()
				.map(n -> n*n*n)
		        .collect(Collectors.toList());
		System.out.println("Coleção de números:\n" + numeros);
		System.out.println("Números elevados ao cubo:\n" + numerosAoCubo);
		
		List<Integer> numerosPares = numeros.stream()
				.filter(n -> n%2 == 0)
				.collect(Collectors.toList());
		System.out.println("Números pares:\n" + numerosPares);
		

		List<Integer> numerosOrdenados = numerosDesordenados.stream()
				.sorted()
				.collect(Collectors.toList());
		System.out.println("\nNúmeros desordenados:\n" + numerosDesordenados);
		System.out.println("Números ordenados:\n" + numerosOrdenados);
		
		
		
		List<String> estadosEmR = estados.stream()
				.filter(e -> e.toString().toUpperCase().startsWith("R"))
				.distinct()
				.collect(Collectors.toList());
		System.out.println("\nLista de Estados: \n" + estados);
		System.out.println("Estados com quem iniciam com a letra R:\n" + estadosEmR);
		
		long contagemEstadosEmR = estados.stream()
				.filter(e -> e.toString().toUpperCase().startsWith("R"))
				.distinct()
				.count();
		System.out.println("Quantidade de Estados com quem iniciam com a letra R:\n" + contagemEstadosEmR);
		
		
		
		
	}

}
