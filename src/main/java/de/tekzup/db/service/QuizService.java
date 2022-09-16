package de.tekzup.db.service;

import java.util.List;
import java.util.Set;

import de.tekzup.db.model.Category;
import de.tekzup.db.model.Condidat;
import de.tekzup.db.model.Quiz;



public interface QuizService {
	public Quiz addQuiz(Quiz quiz);
	public Quiz updateQuiz(Quiz quiz);
	public Set<Quiz> getQuizzes();
	public Quiz getQuiz(Long quizId);
	public void deleteQuiz(Long quizId);
	public List<Quiz> getQuizzesOfCategory(Category category);
	public List<Quiz> getActiveQuizzes();
	public List<Quiz> getActiveQuizzesOfCategory(Category c);

	
}
