package controller;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import database.DBStudenti;
import model.Studente;

public class Registro {
	
	//contenitore in cui riversati gli studenti del db
	private Studente[] studenti;
	private ArrayList<Studente> studentiAl;
	
	//è l'oggetto db
	private DBStudenti db;

	public Registro() {
		db = new DBStudenti();
		this.studenti = db.getStudenti();
		this.studentiAl = db.getStudentiAL();
	}
	
	public void faiAppello() {
		Scanner sc = new Scanner(System.in);
		Date oggi = new Date();
		String nomefile = "appello_" + ".txt";
		ArrayList<Studente> sbAssenti = new ArrayList<>();
		ArrayList<Studente> sbPresenti = new ArrayList<>();
		
		
		try {
			FileWriter fw = new FileWriter("docs/" + nomefile);
			PrintWriter pw = new PrintWriter(fw);

		//per ogni posizione io trovo un oggetto Studente
		for (Studente studente : studentiAl) {
			System.out.println("E' presente lo studente?");
			System.out.println(studente);
			
			String risposta = sc.nextLine();
			if (risposta.equals("s")) {
				sbPresenti.add(studente);
			} else {
				sbAssenti.add(studente);
			}
		}//fine for

		System.out.println("Oggi " + oggi);
		pw.println("Oggi " + oggi);
		System.out.println("sono presenti " + sbPresenti.size());
		pw.println("sono presenti " + sbPresenti.size());		
		for (Studente studente : sbPresenti) {
			System.out.println(studente);
			pw.println(studente);		

		}

		pw.println("------------------------------------");		
		
		
		System.out.println("sono assenti " + sbAssenti.size());
		pw.println("sono assenti " + sbAssenti.size());		

		for (Studente studente : sbAssenti) {
			System.out.println(studente);
			pw.println(studente);		
			
		}

		pw.close();
		
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		sc.close();
	}
	public void faiAppelloOld() {
		Scanner sc = new Scanner(System.in);
		int presenti = 0;
		int assenti = 0;
		StringBuilder sbAssenti = new StringBuilder();
		StringBuilder sbPresenti = new StringBuilder();
		//per ogni posizione io trovo un oggetto Studente
		for (Studente studente : studenti) {
			System.out.println("E' presente lo studente");
			System.out.println(studente);
			String risposta = sc.nextLine();
			if (risposta.equals("s")) {
				presenti++;
				sbPresenti.append(studente.getCognome()).append(" - ");
			} else {
				assenti++;
				if (studente != null)
					sbAssenti.append(studente.getCognome()).append(" - ");
			}
		}//fine for
		Date oggi = new Date();
		System.out.println("Oggi " + oggi);
		System.out.println("sono presenti " + presenti);
		System.out.println(sbPresenti.toString());
		
		System.out.println("sono assenti " + assenti);
		System.out.println(sbAssenti.toString());
		sc.close();
	}
	
}
