package view;

import java.util.ArrayList;

import controller.LibroCtrl;
import model.Libro;

public class MultiStore {

	public static void main(String[] args) {
		
		Libro l1 = new Libro("E babbo morto. Una storia di Natale", "B01", 10.45);
		Libro l2 = new Libro("A Cambiare l'acqua ai fiori", "B02", 17.10);
		
		LibroCtrl lc = new LibroCtrl();
		
		ArrayList<Libro> libri = lc.getLibri();
		
		System.out.println(libri.size());
		lc.addLibro(l1);
		libri.add(l2);
		libri.add(l2);
		libri.add(l2);
		lc.addLibro("Fiori per i Bastardi di Pizzofalcone", "B03", 17.57);
		//System.out.println(libri.get(0));
		libri.remove(0);

		for (Libro libro : libri) {
			System.out.println(libro);
		}

	}

}
