package de.tekzup.db.service;

import java.util.Set;

import de.tekzup.db.model.Objectif;
import de.tekzup.db.model.Quiz;

public interface ObjectifService {
	public Objectif addObjectif(Objectif objectif);
	public Set<Objectif> getObjectif();

}
