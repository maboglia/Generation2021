package alimenti.services;

import java.util.List;

import alimenti.entities.Alimenti;

public interface AlimentiService {

	
	List<Alimenti> getAll();
	Alimenti getOne(int id);
	
	void delAlimenti(int id);
	Alimenti updAlimenti(Alimenti a);
	Alimenti addAlimenti(Alimenti a);

}
