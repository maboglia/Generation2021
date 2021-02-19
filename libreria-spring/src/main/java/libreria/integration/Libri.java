package libreria.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import libreria.entities.Libro;
import libreria.services.LibroService;

@RestController
@RequestMapping("/rest")
public class Libri {
	
	@Autowired
	private LibroService ls;
	
	@GetMapping("/libri")
	public List<Libro> getAll(){
		return ls.getLibri();
	}
	
	@GetMapping("/libri/{id}")
	public Libro getOne(@PathVariable("id") int id){
		return ls.getLibro(id);
	}
	
	@PostMapping(path="/libri", consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Libro addLibro(@RequestBody Libro l) {
		return ls.addLibro(l);
	}

	@PutMapping(path="/libri", consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Libro updLibro(@RequestBody Libro l) {
		return ls.updateLibro(l);
	}
	
	@DeleteMapping("/libri/{id}")
	public void deleteOne(@PathVariable("id") int id) {
		ls.deleteLibro(id);
	}
}
