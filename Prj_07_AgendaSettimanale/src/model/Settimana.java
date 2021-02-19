package model;

public class Settimana {

	private Giorno[] giorni;
	private String nome;
	
	public Settimana(String nome) {
		this.nome = nome;
		this.giorni = new Giorno[] {
				new Giorno("Lunedì", "01"),
				new Giorno("Martedì", "02"),
				new Giorno("Mercoledì", "03"),
				new Giorno("Giovedì", "04"),
				new Giorno("Venerdì", "05"),
				new Giorno("Sabato", "06"),
				new Giorno("Domenica", "07"),
		};
		
		
	}

	public Giorno[] getGiorni() {
		return giorni;
	}

	public String getNome() {
		return nome;
	}
	
	
	
	
}
