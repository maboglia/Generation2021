package cicli;

public class CicliInnestati {

	public static void main(String[] args) {
		
		final int RIGHE = 10;
		final int COLONNE = 10;
		
		for (int i = 0; i < RIGHE; i++) {
			
			for (int j = 0; j < i; j++) {
				//if (j%2==0)
				System.out.print("0");
			}
			
			System.out.println();
		}
		
		

	}

}
