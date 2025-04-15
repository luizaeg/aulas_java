package java_aula_3;

public class Caracteres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// Utilizando Strings
		
	String frase_01 = "Turma Java 82!";
	String frase_02 = "TURMA JAVA 82!";
	String frase_03 = "turma java 82!";	
	String frase_04 = "turma java 82!";
		
	System.out.println(frase_01 == frase_02);
	System.out.println(frase_03 == frase_04);
	
	System.out.println(frase_01.equals(frase_02));
	System.out.println(frase_03.equals(frase_04));
	
	System.out.println(frase_01.equalsIgnoreCase(frase_02));
	System.out.println(frase_03.equalsIgnoreCase(frase_04));
	
	System.out.println(frase_01.compareTo(frase_02));
	System.out.println(frase_03.compareTo(frase_04));
	
		
	}

}
