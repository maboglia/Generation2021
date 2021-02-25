package alimenti.integration;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import alimenti.entities.Alimento;
import alimenti.service.AlimentoIService;

@RestController
@RequestMapping("/api")
public class AlimentiRest {
	
	@Autowired
	private AlimentoIService service; 
	
	
	@GetMapping("/all")
	List<Alimento> getAll(){
		return service.getAll(); 
	}
	
	@GetMapping("/categories")
	Set<String> getCats(){
		return service.getCategories(); 
	}
	
	@GetMapping("/categories/{cat}")
	List<Alimento> getCat(@PathVariable("cat") String categoria){
		return service.getCategory(categoria); 
	}
	
	@GetMapping("/products/{id}")
	Alimento getCat(@PathVariable("id") int id){
		return service.getProduct(id); 
	}
	
	
}
