package de.tekzup.db.contr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.tekzup.db.model.Category;
import de.tekzup.db.model.Quiz;
import de.tekzup.db.service.QuizService;

@RestController
@RequestMapping("/quiz")
@CrossOrigin("*")
public class QuizController {

	@Autowired
	private QuizService quizService;
	
	//ajout des formation
	@PostMapping("/")
	public ResponseEntity<Quiz> add(@RequestBody Quiz quiz){
		
		return ResponseEntity.ok(this.quizService.addQuiz(quiz));
	}
	 
	//update des formations
	@PutMapping("/")
	public ResponseEntity<Quiz> update(@RequestBody Quiz quis){
		return ResponseEntity.ok(this.quizService.updateQuiz(quis));
	}
	
	//affichage des formation
	@GetMapping("/")
	public ResponseEntity<?> quizzes(){
		return ResponseEntity.ok(this.quizService.getQuizzes());
	}
	 
	//affiche par id
	@GetMapping("/{qid}")
	public Quiz quiz(@PathVariable("qid") Long qid) {
		return this.quizService.getQuiz(qid);
	}
	
	//suppression
	@DeleteMapping("/{qid}")
	public void delete(@PathVariable("qid") Long qid) {
		this.quizService.deleteQuiz(qid);
	}
	
	@GetMapping("/category/{cid}")
	public List<Quiz> getGuizzesOfCategory(@PathVariable("cid") Long cid){
		Category category=new Category();
		category.setCid(cid);
		return this.quizService.getQuizzesOfCategory(category);
	}

}
