package alimenti.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import alimenti.entities.Alimenti;

public interface AlimentiDAO extends JpaRepository<Alimenti, Integer> {

}
