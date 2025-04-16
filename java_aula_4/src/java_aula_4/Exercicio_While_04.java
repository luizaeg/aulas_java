package java_aula_4;

import java.util.Scanner;

public class Exercicio_While_04 {

	public static void main(String[] args) {
		
	// Exercício While - 04

Scanner leia = new Scanner(System.in);
	
   // Variáveis   

		int idade = 0;
		int identGenero;
		int pessoaDev;
		int mulherCis =0, homemCis = 0, naoBinario = 0, mulherTrans = 0, homemTrans = 0, outros =0;
		int backend =0, frontend=0, mobile=0, fullStack=0;
		int mulheresFront = 0, homensMobile40 = 0, naoBiFullstack = 0;
		int totalRespostas = 0, somaIdade = 0;
		String continua = "S";	    
		
	// Loop
		
		 while (continua.equalsIgnoreCase("S")) {
		
		System.out.print("\nIdade: ");
		idade = leia.nextInt();
		
		System.out.println("\n**********************");
		System.out.println("1 - Mulher Cis        ");
		System.out.println("2 - Homem Cis         ");
		System.out.println("3 - Não Binário       ");
		System.out.println("4 - Mulher Trans      ");
		System.out.println("5 - Homem Trans       ");
		System.out.println("6 - Outros            ");
		System.out.println("**********************");
		System.out.print("Identidade de Gênero: ");
		identGenero = leia.nextInt();
		
				
		switch(identGenero) {
		case 1:
	        mulherCis++;
	        break;
	    case 2:
	        homemCis++;
	        break;
	    case 3:
	        naoBinario++;
	        break;
	    case 4:
	        mulherTrans++;
	        break;
	    case 5:
	        homemTrans++;
	        break;
	    case 6:
	        outros++;
	        break;
	    default:
	        System.out.println("Opção inválida!");
	        break;
		 }
			
		System.out.println("\n**********************");
		System.out.println("1 - Backend           ");
		System.out.println("2 - Frontend          ");
		System.out.println("3 - Mobile            ");
		System.out.println("4 - FullStack         ");
		System.out.println("**********************");
		System.out.print("Pessoa Desenvolvedora:");
		pessoaDev = leia.nextInt();
			
		switch(pessoaDev) {
		case 1:
	        backend++;
	        break;
	    case 2:
	        frontend++;
	        break;
	    case 3:
	        mobile++;
	        break;
	    case 4:
	        fullStack++;
	        break;
	    default:
	        System.out.println("Opção inválida!");
	        break;    
		}
		
		        
     // Condições especifícas para Resultado
        
        if ((identGenero == 1 || identGenero == 4) && pessoaDev == 2) {
        	mulheresFront ++;
        }
        
        if ((identGenero == 2 || identGenero == 5) && pessoaDev == 3 && idade > 40) {
        	homensMobile40 ++;  
        }
        
        if (identGenero == 3  && pessoaDev == 4 && idade < 30) {
        	naoBiFullstack ++;  
        } 
        
        totalRespostas++;
        
        somaIdade += idade;
        
	// Continuar ou encerrar?
		System.out.print("\nDeseja continuar? (S/N): ");
		continua = leia.next().toUpperCase();
		
		
		}
		 
		// Média após encerrado
			double mediaIdade = 0;
			if (totalRespostas > 0) {
				mediaIdade = (double) somaIdade / totalRespostas;
		 }
		 
    //Resultados
		    System.out.println("\n--- RESULTADO FINAL ---");
	        System.out.println("Total de pessoas desenvolvedoras Backend: " + backend);
	        System.out.println("Total de Mulheres Cis e Trans desenvolvedoras Front end: " + mulheresFront);
	        System.out.println("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + homensMobile40);
	        System.out.println("Total de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: " + naoBiFullstack);
	        System.out.println("O número total de pessoas que responderam à pesquisa: " + totalRespostas);
	        System.out.printf("A média de idade das pessoas que responderam à pesquisa: %.1f\n", mediaIdade);
		 
	   
	}

}
