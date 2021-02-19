package esercizi;

import java.util.Scanner;

public class Saluto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Come ti chiami?");
		String risposta = sc.nextLine();
		
		System.out.println("Benvenuto " + risposta);

	}

}
