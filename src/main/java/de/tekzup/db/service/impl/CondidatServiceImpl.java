package de.tekzup.db.service.impl;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.tekzup.db.model.Condidat;
import de.tekzup.db.model.Quiz;
import de.tekzup.db.repo.CondidatRepo;
import de.tekzup.db.service.CondidatService;

@Service
public class CondidatServiceImpl implements CondidatService {

	@Autowired
	private CondidatRepo categoryRepository;
	
	
	@Override
	public Condidat addCondidat(Condidat condidat) {
		return this.categoryRepository.save(condidat);
	}


	@Override
	public Set<Condidat> getCondidats() {
		return new LinkedHashSet<>(this.categoryRepository.findAll());
	}

	@Override
	public Condidat getCondidat(Long condidatId) {
		return this.categoryRepository.findById(condidatId).get();
	}


	@Override
	public Condidat updateCategory(Condidat condidat) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void deleteCategory(Long condidatId) {
		this.categoryRepository.deleteById(condidatId);
		
	}


	@Override
	public Quiz addCouseToCondidat(int id, Quiz quiz) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Condidat> getQuizzesOfCategory(Quiz quiz) {
		// TODO Auto-generated method stub
		return null;
	}
}
