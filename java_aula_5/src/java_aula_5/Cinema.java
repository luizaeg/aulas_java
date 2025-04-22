package java_aula_5;

public class Cinema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [][] assentos = {
				{1,0,1,1,1,1}, 
				{1,0,1,1,1,1},
				{1,0,1,1,1,1},
				{1,0,1,1,1,1},
				{1,0,1,1,1,1},
				{1,0,1,1,1,1}
	  };
		
		int ocupadas=0, livres=0;
		
		for(var fila : assentos) {
			for(var assento : fila) {
				if (assento == 1) {
					ocupadas ++;
				}else {
					livres++;
				}
		}
		
	}
		
		System.out.println("Assentos ocupados: " + ocupadas);
		System.out.println("Assentos livres: " + livres);
		
	}

}
