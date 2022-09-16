package de.tekzup.db.service;

import java.util.List;
import java.util.Set;

import de.tekzup.db.model.Category;
import de.tekzup.db.model.Condidat;
import de.tekzup.db.model.Quiz;



public interface CondidatService {
	public Condidat addCondidat(Condidat condidat);
	public Condidat updateCategory(Condidat condidat);
	public Set<Condidat> getCondidats();
	public Condidat getCondidat(Long condidatId);
	public void deleteCategory(Long condidatId);
	public Quiz addCouseToCondidat(int id, Quiz quiz);
	public List<Condidat> getQuizzesOfCategory(Quiz quiz);


}
