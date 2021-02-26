package alimenti.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import alimenti.service.AlimentoIService;

@Controller
@RequestMapping("/admin")
public class AlimentiCtrl {

	@Autowired
	private AlimentoIService service;
	
	@RequestMapping("")
	public String home() {
		System.out.println("stai chiamando il metodo home");
		return "index";
	}
	
	
}
