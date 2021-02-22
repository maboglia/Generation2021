package alimenti.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import alimenti.entities.Alimenti;
import alimenti.repos.AlimentiDAO;

@Service
public class AlimentiServiceImpl implements AlimentiService{

	@Autowired
	private AlimentiDAO dao;
	
	@Override
	public List<Alimenti> getAll() {
		return dao.findAll();
	}

	@Override
	public Alimenti getOne(int id) {
		return dao.findById(id).get();
	}

	@Override
	public void delAlimenti(int id) {
		dao.deleteById(id);
	}

	@Override
	public Alimenti updAlimenti(Alimenti a) {
		return dao.save(a);
	}

	@Override
	public Alimenti addAlimenti(Alimenti a) {
		return dao.save(a);
	}

}
