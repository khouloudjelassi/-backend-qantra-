package de.tekzup.db.service.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.tekzup.db.model.Category;
import de.tekzup.db.model.Quiz;
import de.tekzup.db.repo.QuizRepo;
import de.tekzup.db.service.QuizService;
@Service
public class QuizServiceImpl implements QuizService {

	
	@Autowired
	private QuizRepo quizRepository;

	@Override
	public Quiz addQuiz(Quiz quiz) {
		return this.quizRepository.save(quiz);
	}

	@Override
	public Quiz updateQuiz(Quiz quiz) {
		return this.quizRepository.save(quiz);
	}

	@Override
	public Set<Quiz> getQuizzes() {
		return new HashSet<>(this.quizRepository.findAll());
	}

	@Override
	public Quiz getQuiz(Long quizId) {
		return this.quizRepository.findById(quizId).get();
	}

	@Override
	public void deleteQuiz(Long quizId) {
		
		this.quizRepository.deleteById(quizId);
	}

	@Override
	public List<Quiz> getQuizzesOfCategory(Category category) {
		return this.quizRepository.findBycategory(category);
	}


	@Override
	public List<Quiz> getActiveQuizzes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Quiz> getActiveQuizzesOfCategory(Category c) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
