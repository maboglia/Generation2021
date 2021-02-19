package libreria;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Router {

	@RequestMapping("/saluta")
	public String saluta() {
		return "Ciao, possiamo fare pausa";
	}
	
}
