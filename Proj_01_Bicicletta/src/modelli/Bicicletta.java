package modelli;

public class Bicicletta {

	String marca;
	int marcia = 1;
	int frequenza = 0;
	int velocita = 0;
	int circonferenza = 1;
	
	public Bicicletta(String marcaBici) {
		marca = marcaBici;
	}
	
	public void accelera(int pedalata) {
		frequenza += pedalata;
		calcolaVelocita();
	}

	public void rallenta(int pedalata) {
		frequenza -= pedalata;
		calcolaVelocita();
	}
	
	
	public int calcolaVelocita() {
		velocita = marcia * frequenza * circonferenza;
		
		return velocita;
	}
	
	public void cambia(int nuovaMarcia) {
		marcia = nuovaMarcia;
		calcolaVelocita();
	}
	
	public String stampaReport() {
//		String report = "Marca " + marca + " velocita " + velocita;
		return "La Marca della bici è " + marca + ", la sua velocità " + velocita;
	}
	
}
