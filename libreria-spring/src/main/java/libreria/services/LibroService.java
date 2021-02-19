package libreria.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import libreria.entities.Libro;
import libreria.repos.LibroIDAO;

@Service
public class LibroService implements LibroIService {

	@Autowired
	private LibroIDAO db;//IOC
	
	
	@Override
	public Libro addLibro(Libro l) {
		return db.save(l);
	}

	@Override
	public List<Libro> getLibri() {
		return db.findAll();
	}

	@Override
	public Libro getLibro(int id) {
		return db.findById(id).get();
	}

	@Override
	public Libro updateLibro(Libro l) {
		
		Libro libro = null;
//		
//		if (this.getLibro(l.getId())!=null)
			libro = db.save(l);
		
		return libro;
	}

	@Override
	public void deleteLibro(int id) {
		db.deleteById(id);
	}

}
