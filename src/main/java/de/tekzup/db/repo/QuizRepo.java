package de.tekzup.db.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import de.tekzup.db.model.Category;
import de.tekzup.db.model.Quiz;

public interface QuizRepo extends JpaRepository<Quiz, Long>{

	List<Quiz> findBycategory(Category category);



}
