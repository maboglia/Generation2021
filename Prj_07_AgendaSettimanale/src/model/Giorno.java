package model;

public class Giorno {

	private Impegno[] impegni;
	private String nome;
	private String data;
	
	public Giorno(String nome, String data) {
		this.nome = nome;
		this.data = data;
		this.impegni = new Impegno[10];
		
		for (int i = 0; i < impegni.length; i++) {
//			String orario = "" + (i + 8);     //8, 9, 10
			this.impegni[i] = new Impegno(Integer.toString(i+8), "...");
		}
	}

	public Impegno[] getImpegni() {
		return impegni;
	}

	public String getNome() {
		return nome;
	}

	public String getData() {
		return data;
	}
	
	
	
	
	
}
