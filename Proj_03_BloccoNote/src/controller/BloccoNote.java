package controller;

import model.Nota;

public class BloccoNote {

	private Nota[] lista;//getLista()
	
	public BloccoNote() {
		this.lista = new Nota[10];
	}
	
//	private boolean isFull() {
//		boolean full = false;
//		int elementi = 0;
//		for (int i = 0; i < lista.length; i++) {
//			if(lista[i] != null)
//				elementi++;
//		}
//		if (elementi == lista.length)
//			full = true;
//		
//		return full;
//	}
	
	private int primaPosizioneDisponibile() {
		int posizione = -1;
		
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] == null) {
				posizione = i;
				break;
			}
		}
		
		return posizione;
		
	}
	
	public void addNota(String testo) {
		
		//verificare se array è pieno
		if (   primaPosizioneDisponibile() == -1  ) {
			System.out.println("Non puoi inserire " + testo+ " perché il blocco è gia pieno!");
		} else {
			//se non è pieno, qual è la prima pos disponibile
			int pos = primaPosizioneDisponibile();
			//costruisco la nota
			Nota n = new Nota(testo);
			//metto la nota nella posizione ritornata
			lista[pos] = n;
			//System.out.println("ho inserito " + n.getDescrizione() + " nella lista alla posizione " + pos );
		}

	}//fine metodo

	
	public Nota[] getLista() {
		return lista;
	}
	
	public void completaNota(int pos) {
		if (pos >=0 && pos < lista.length)
		lista[pos].setCompleta(true);
		System.out.println("Completata la nota n. " + pos);
	}
	
	
}
