package controller;

import java.util.ArrayList;

import model.Libro;
import model.Scaffale;

public class ScaffaleCtrl {

	private Scaffale scaffale;

	public ScaffaleCtrl(Scaffale scaffale) {
		this.scaffale = scaffale;
	}
	
	public void addLibro(Libro l) {
		this.scaffale.getLibri().add(l);		
	}
	
	public boolean removeLibro(Libro l) {
		return this.scaffale.getLibri().remove(l);
	}
	
	public Libro getLibro(int pos) {
		return this.scaffale.getLibri().get(pos);
	}
	
	public ArrayList<Libro> getAll(){
		return this.scaffale.getLibri();
	}
	
	public Libro findLibro(String titolo) {
		for(Libro l : this.scaffale.getLibri()) {
			if (l.getTitolo().equalsIgnoreCase(titolo)) {
				return l;
			}
		}		
		return null;
	}
	
	public Libro findLibro(Libro l) {
		if (this.scaffale.getLibri().contains(l)) {
			//cerco la posizione del libro
			int i = this.scaffale.getLibri().indexOf(l);
			return this.getLibro(i);
		} 
		return null;
	}
	
}
