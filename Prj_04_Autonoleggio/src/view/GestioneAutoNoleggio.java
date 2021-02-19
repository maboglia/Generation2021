package view;

import java.util.Scanner;

import controller.AutistaController;
import controller.AutomobileController;
import controller.NoleggioController;
import model.Autista;
import model.Automobile;
import model.Noleggio;

public class GestioneAutoNoleggio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean ripeti = true;
		
		String risposta = null;
		String cliente = null;
		String auto = null;
		int nGiorni = 0;
		
		AutomobileController ac = new AutomobileController();
		AutistaController auc = new AutistaController();
		NoleggioController nc = new NoleggioController();

		
		while(ripeti) {
			System.out.println("Scegli opzione");
			System.out.println("a) elenco mezzi");
			System.out.println("b) elenco autisti");
			System.out.println("c) crea noleggio");
			System.out.println("e) elenco noleggi");
			System.out.println("q) per uscire");

			risposta = sc.nextLine();
			
			if(risposta.equals("a")) {
				for (Automobile automob : ac.getAuto()) {
					System.out.println(automob);
				}   
			}

			
			if(risposta.equals("b")) {
				for (Autista a :  auc.getAutisti()  ) {
					System.out.println(a);
				}   
			}			

			if(risposta.equals("c")) {
				System.out.println("Codice cliente");
				cliente = sc.nextLine();
				System.out.println("Codice auto");
				auto = sc.nextLine();
				System.out.println("numero giorni");
				nGiorni = sc.nextInt();
				
				Autista autista = auc.getAutista(cliente);
				Automobile automobile = ac.getAutoByTarga(auto);
				
				nc.noleggia(autista, automobile, nGiorni);
			}	
			
			if (risposta.equals("e")) {
				for (Noleggio noleggio : nc.getNoleggi()) {
					System.out.println(noleggio);
				}
			}
			
			if (risposta.equals("q")) {
				System.out.println("arrivederci");
				ripeti = false;
			}
			
		}
		
		

	}

}
