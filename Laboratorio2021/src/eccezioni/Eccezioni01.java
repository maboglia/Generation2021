package eccezioni;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Eccezioni01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] voti = {25,26,27,28};
		
		try {
			for (int i = 0; i < voti.length; i++) {
				System.out.println(voti[i]);
			}
			System.out.println("inserisci il valore di i");
			int i = sc.nextInt();
			System.out.println(7 / i);
			
			
		} catch (IndexOutOfBoundsException e) {
			System.err.println("sei uscito dai limiti dell'array: non posso individuare l'elemento richiesto");
		} catch (ArithmeticException e) {
			System.err.println("si è verificata un'eccezione di tipo aritmetico");
		} catch (InputMismatchException e) {
			System.err.println("Non hai inserito un numero, ma un carattere");
		}
		
		catch (Exception e) {
			e.printStackTrace();
			//System.err.println(e.getMessage());
		} 
		
		System.out.println("the end");
	}

}
