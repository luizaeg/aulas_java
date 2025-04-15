package java_aula_3;

public class OperadoresLogicos {

	public static void main(String[] args) {
	
	// Operadores Lógicos
		
		
		int ab = 10;
		int cd = 5;
		int ef = 5;
		int gh = 20;
		
			
		System.out.printf("\n (%d > %d) E (%d < %d) = %b", ab, cd, ef, gh, (ab > cd) && (ef < gh));
		System.out.printf("\n (%d > %d) E (%d < %d) = %b", ab, cd, ef, gh, (ab > cd) || (ef <= gh));
		System.out.printf("\n (%d > %d) OU (%d < %d) = %b", ab, cd, ef, gh, (ab > cd) && (ef < gh));
		System.out.printf("\n (%d > %d) OU (%d < %d) = %b", ab, cd, ef, gh, (ab > cd) || (ef <= gh));
		
	}

}
