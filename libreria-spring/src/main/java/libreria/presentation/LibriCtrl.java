package libreria.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import libreria.entities.Libro;
import libreria.services.LibroService;

@Controller
@RequestMapping("/libri")
public class LibriCtrl {

	@Autowired
	private LibroService ls;
	
	
	@RequestMapping("")
	private String getLibri(Model model) {
		//System.out.println("booh!");
		
		model.addAttribute("libri", ls.getLibri());
		
		return "elenco_libri";	
	}
	
	
	@RequestMapping(value="",method = RequestMethod.POST)
	private String addLibr(@ModelAttribute("libro") Libro l) {
		System.out.println(l);
		ls.addLibro(l);
		
		return "redirect:/libri/";	
	}
	
	@RequestMapping(value="/modifica",method = RequestMethod.POST)
	private String updLibr(@ModelAttribute("libro") Libro l) {
		
		ls.updateLibro(l);
		
		return "redirect:/libri/";	
	}	

	@RequestMapping("/update/{id}")
	private String formLibroUpdate(@PathVariable("id") int id, Model model) {
		
		Libro l = ls.getLibro(id);
		model.addAttribute("libro",l);
		
		return "updLibro";	
	}
	
	@RequestMapping("/add")
	private String formLibro() {
		return "addLibro";	
	}
	
	@RequestMapping("/{id}")
	private String getLibro(@PathVariable("id") int id, Model model) {
		//aggiungo il libro al model
		model.addAttribute("libro", ls.getLibro(id));
		
		return "dettaglio";
	}
	
	@RequestMapping("/delete")
	private String deleteLibro(@RequestParam("id") int id) {
		
		ls.deleteLibro(id);
//		return "redirect:/libri";
		return "eliminato";
	}
	
		
	
	
}
