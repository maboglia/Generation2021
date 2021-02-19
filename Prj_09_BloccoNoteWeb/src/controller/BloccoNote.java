package controller;

import java.util.ArrayList;

import model.Nota;

public class BloccoNote {

	private ArrayList<Nota> lista;
	
	public BloccoNote() {
		this.lista = new ArrayList<>();
	}

	public void addNota(String testo) {
		this.lista.add(new Nota(testo));
	}
	
	public ArrayList<Nota> getLista() {
		return lista;
	}
	
	public void completaNota(int pos) {
		if (pos >=0 && pos < lista.size())
		lista.get(pos).setCompleta(true);
		System.out.println("Completata la nota n. " + pos);
	}
}
