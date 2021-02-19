package database;

import java.util.ArrayList;

import model.Dono;

public class DoniDAO {

	private ArrayList<Dono> regali;

	public DoniDAO() {
		this.regali = new ArrayList<>();
		this.init();
	}
	
	private void init() {
		this.regali.add(new Dono("Trenino elettrico"));
		this.regali.add(new Dono("Robot"));
		this.regali.add(new Dono("Bambola"));
		this.regali.add(new Dono("Gioco società"));
	}
	
	public ArrayList<Dono> getRegali() {
		return regali;
	}
}
