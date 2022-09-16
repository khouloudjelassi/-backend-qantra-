package de.tekzup.db.contr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.tekzup.db.model.Objectif;
import de.tekzup.db.model.Quiz;
import de.tekzup.db.service.ObjectifService;
import de.tekzup.db.service.QuizService;

@RestController
@RequestMapping("/objectif")
@CrossOrigin("*")
public class ObjectifController {

	@Autowired
	private ObjectifService objectifService;
	
	@PostMapping("/")
	public ResponseEntity<Objectif> add(@RequestBody Objectif obj){
		
		return ResponseEntity.ok(this.objectifService.addObjectif(obj));
	}
	@GetMapping("/")
	public ResponseEntity<?> Objectifs(){
		return ResponseEntity.ok(this.objectifService.getObjectif());
	}
}
