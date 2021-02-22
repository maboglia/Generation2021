package alimenti.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import alimenti.entities.Alimenti;
import alimenti.services.AlimentiService;

@RestController
@RequestMapping("/api")
public class AlimentiRestCtrl {

	@Autowired
	private AlimentiService service;
	
	@GetMapping()
	public List<Alimenti> getAll(){
		return service.getAll();
	}
	@GetMapping("/{id}")
	public Alimenti getOne(@PathVariable("id") int id){
		return service.getOne(id);
	}
}
