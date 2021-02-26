package alimenti.presentation;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import alimenti.entities.Alimento;
import alimenti.service.AlimentoIService;

@Controller
@RequestMapping("/admin")
public class AlimentiCtrl {

	@Autowired
	private AlimentoIService service;
	
	@RequestMapping("/add")
	public String formInserimento() {
		return "addAlimento";
	}
	@RequestMapping("/update/{id}")
	public ModelAndView formModifica(@PathVariable("id") int id) {
		
		Alimento product = service.getProduct(id);
		
		return new ModelAndView("updAlimento", "prodotto",product);
	}
	

	@RequestMapping(path = "/addProduct", method = RequestMethod.POST)
	public String addProduct(@Validated @ModelAttribute("alimento") Alimento a) {
		
		Alimento nuovoProdotto = service.addProduct(a);
		
		return "redirect:/admin/products/"+nuovoProdotto.getId();
	}
	
	@RequestMapping(path = "/updateProduct/{id}", method = RequestMethod.POST)
	public String updateProduct(@PathVariable("id") int id, @Validated @ModelAttribute("alimento") Alimento a) {
		a.setId(id);
		Alimento nuovoProdotto = service.addProduct(a);
		
		return "redirect:/admin/products/"+nuovoProdotto.getId();
	}
	
	
	@RequestMapping("/products/{id}")
	public ModelAndView dettaglio(@PathVariable("id") int id) {
		
		Alimento product = service.getProduct(id);
		
//		map.addAttribute("prodotto", product);
		return new ModelAndView("dettaglio", "prodotto", product);
	}

	@RequestMapping("/categories")
	public ModelAndView categorie() {
		
		Set<String> categories = service.getCategories();
		
//		map.addAttribute("prodotto", product);
		return new ModelAndView("categorie", "categorie", categories);
	}
	
	
}
