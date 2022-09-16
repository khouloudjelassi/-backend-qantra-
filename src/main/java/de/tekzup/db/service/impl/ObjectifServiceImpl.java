package de.tekzup.db.service.impl;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.tekzup.db.model.Objectif;
import de.tekzup.db.repo.ObjectifRepo;
import de.tekzup.db.service.ObjectifService;
@Service
public class ObjectifServiceImpl implements ObjectifService {

	@Autowired
	private ObjectifRepo objectifRepository;
	
	@Override
	public Objectif addObjectif(Objectif objectif) {
		return this.objectifRepository.save(objectif);
	}

	@Override
	public Set<Objectif> getObjectif() {
		return new LinkedHashSet<>(this.objectifRepository.findAll());
	}



}
