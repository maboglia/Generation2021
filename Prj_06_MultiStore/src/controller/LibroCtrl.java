package controller;

import java.util.ArrayList;

import model.Libro;



public class LibroCtrl {

	//Libro[] non è ridimensionabile: length è una proprietà, nota già all'inizio
	//ArrayList: è una specie di array, ridimensionabile, solo OGGETTI
	private ArrayList<Libro> libri;

	public LibroCtrl() {
		this.libri = new ArrayList<Libro>();
	}

	public ArrayList<Libro> getLibri() {
		return libri;
	}
	
	public void addLibro(Libro l) {
		if(l.getTitolo().startsWith("A"))
			return;
		this.libri.add(l);
	}
	
	//overload dei metodi
	public void addLibro(String titolo, String codice, double prezzo) {
		if(titolo.startsWith("A"))
			return;
		Libro l = new Libro(titolo, codice, prezzo);
		this.libri.add(l);
	}
	
}
