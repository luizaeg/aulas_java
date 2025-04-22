package java_aula_6;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio_Set_01 {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        Set<Integer> numeros = new HashSet<>();
        
        System.out.println("Digite 10 números inteiros não repetidos:");

        while (numeros.size() < 10) {
            System.out.print("Número " + (numeros.size() + 1) + ": ");
            int numero = leia.nextInt();
            
            boolean adicionado = numeros.add(numero);
            if (!adicionado) {
                System.out.println("Número repetido! Digite um número diferente.");
            }
        }

        // Mostrar com Iterator
        System.out.println("\nListar dados do Set:");
        Iterator<Integer> iterator = numeros.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        leia.close();
    }
}
	
