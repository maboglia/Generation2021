package alimenti.dal;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import alimenti.entities.Alimento;

public interface AlimentoDAO extends JpaRepository<Alimento, Integer> {
	
	List<Alimento> findByCategoria(String categoria); 

}
