package de.tekzup.db.contr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.tekzup.db.model.Category;
import de.tekzup.db.model.Condidat;
import de.tekzup.db.model.Quiz;
import de.tekzup.db.service.CondidatService;

@RestController
@RequestMapping("/condidat")
@CrossOrigin("*")
public class CondidatController {

	@Autowired
	private CondidatService condidatService;
	
	@PostMapping("/")
	public ResponseEntity<Condidat> addCondidat(@RequestBody Condidat condidat){
		Condidat condidat1=this.condidatService.addCondidat(condidat);
		return ResponseEntity.ok(condidat1);
	}
	
	
	@GetMapping("/")
	public ResponseEntity<?> getCondidats(){
		return ResponseEntity.ok(this.condidatService.getCondidats());
	}
	
	@DeleteMapping("/{qid}")
	public void delete(@PathVariable("qid") Long qid) {
		this.condidatService.deleteCategory(qid);
	}
	
	@GetMapping("/{qid}")
	public Condidat condidat(@PathVariable("qid") Long qid) {
		return this.condidatService.getCondidat(qid);
	}
	
	@GetMapping("/quiz/{qid}")
	public List<Condidat> getGuizzesOfCategory(@PathVariable("qid") Long qid){
		Quiz quiz=new Quiz();
		quiz.setqId(qid);
		return this.condidatService.getQuizzesOfCategory(quiz);
	}
	
}
