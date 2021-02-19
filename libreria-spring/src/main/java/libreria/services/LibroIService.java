package libreria.services;

import java.util.List;

import libreria.entities.Libro;

public interface LibroIService {

	Libro addLibro(Libro l);//C
	List<Libro> getLibri();//R
	Libro getLibro(int id);
	Libro updateLibro(Libro l);//U	
	void deleteLibro(int id);//D
	
}
