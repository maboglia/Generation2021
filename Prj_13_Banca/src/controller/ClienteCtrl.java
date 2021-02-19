package controller;

import java.util.ArrayList;

import model.Cliente;

public class ClienteCtrl {

	/**
	 * contenitore delle informazioni relative ai clienti
	 */
	private ArrayList<Cliente> anagraficaClienti;

	public ClienteCtrl() {
		this.anagraficaClienti = new ArrayList<>();
	}
	
	public void addCliente(String nome) {
		this.anagraficaClienti.add(new Cliente(nome));
	}
	
	public ArrayList<Cliente> getAnagraficaClienti() {
		return anagraficaClienti;
	}
		
}
