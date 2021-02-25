package alimenti.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import alimenti.dal.AlimentoDAO;
import alimenti.entities.Alimento;

@Service
public class AlimentoService  implements AlimentoIService{
	@Autowired
	AlimentoDAO dao; 

	@Override
	public List<Alimento> getAll() {
		
		return dao.findAll(); 
	}

	@Override
	public Alimento getProduct(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	public Set<String> getCategories() {
		
		Set<String> etichette = new TreeSet<String>(); 
		
		for(Alimento a : getAll()) {
			etichette.add(a.getCategoria()); 
		}
		
		return etichette;
	}

	@Override
	public List<Alimento> getCategory(String cat) {
		
		return dao.findByCategoria(cat);
	}
	

}
