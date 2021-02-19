package view;

import java.util.ArrayList;
import java.util.Arrays;

import controller.ScaffaleCtrl;
import model.Libro;
import model.Scaffale;

public class GestioneBiblioteca {

	public static void main(String[] args) {
		
		Libro l2 = new Libro("CABONI CRISTINA", "IL GIARDINO DEI FIORI SEGRETI");
		Libro l3 = new Libro("HARRIS JOANNE", "CHOCOLAT");
		Libro l4 = new Libro("MCGUIRE JAMIE", "UN DISASTRO PERFETTO");
		Libro l5 = new Libro("DALAI LAMA", "RIBELLATEVI!");
		Libro l6 = new Libro("SCERBANENCO GIORGIO", "LA SABBIA NON RICORDA");
		Libro l7 = new Libro("BOSCO FEDERICA", "CI VEDIAMO UN GIORNO DI QUESTI");
		Libro l8 = new Libro("CABONI CRISTINA", "LA RILEGATRICE DI STORIE PERDUTE");
		Libro l9 = new Libro("SANCHEZ CLARA", "LA FORZA IMPREVEDIBILE DELLE PAROLE");
		Libro l10 = new Libro("LUCAS CHARLOTTE", "IL TUO ANNO PERFETTO INIZIA DA QUI");
		Libro l11 = new Libro("MECHELLI ARIANNA", "IL TUO PERICOLOSO SORRISO");

		Libro[] libriArray = {l2, l3, l5, l7, l9};
		ArrayList<Libro> libri = new ArrayList<>(Arrays.asList(libriArray));
		
		
		Scaffale scaf1 = new Scaffale("S1");
		Scaffale scaf2 = new Scaffale("S2", libri);
		
		ScaffaleCtrl controller1 = new ScaffaleCtrl(scaf1);
		ScaffaleCtrl controller2 = new ScaffaleCtrl(scaf2);
		
		controller1.addLibro(l4);
		controller1.addLibro(l6);
		controller1.addLibro(l8);
		controller1.addLibro(l10);
		
		System.out.println(controller1.getLibro(2));
		
		System.out.println(controller2.getLibro(2));
		
		System.out.println(scaf2);
		
		System.out.println(controller2.findLibro("Chocolat"));
		System.out.println(controller2.findLibro("UN DISASTRO PERFETTO"));
		System.out.println(controller1.findLibro(l5));
		
		System.out.println(controller1.findLibro(l5));
		if (controller1.removeLibro(l5)) {
			System.out.println("libro trovato e rimosso correttamente");
		} else {
			System.out.println("libro non trovato");
		}
		System.out.println(controller1.findLibro(l5));
		

	}

}
