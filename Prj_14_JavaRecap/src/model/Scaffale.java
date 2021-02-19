package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Scaffale {

	private String identificativo;
	private ArrayList<Libro> libri;
	
	
	public Scaffale(String id) {
		this.identificativo = id;
		this.libri = new ArrayList<>();
	}
	
	public Scaffale(String id, ArrayList<Libro> libri) {
		this.identificativo = id;
		this.libri = libri;
	}

	/**
	 * @return the identificativo
	 */
	public String getIdentificativo() {
		return identificativo;
	}

	/**
	 * @param identificativo the identificativo to set
	 */
	public void setIdentificativo(String identificativo) {
		this.identificativo = identificativo;
	}

	/**
	 * @return the libri
	 */
	public ArrayList<Libro> getLibri() {
		return libri;
	}

	/**
	 * @param libri the libri to set
	 */
	public void setLibri(ArrayList<Libro> libri) {
		this.libri = libri;
	}

	@Override
	public String toString() {
		return "Scaffale [identificativo=" + identificativo + ", libri=" + this.libri + "]";
	}
	
	
	
}
