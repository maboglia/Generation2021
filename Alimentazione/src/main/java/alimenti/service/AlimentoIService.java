package alimenti.service;

import java.util.List;
import java.util.Set;

import alimenti.entities.Alimento;

public interface AlimentoIService {
	
	
	List<Alimento> getAll(); 
	Alimento getProduct(int id); 
	Set<String> getCategories(); 
	List<Alimento> getCategory(String cat); 
}
