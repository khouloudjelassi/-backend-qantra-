package de.tekzup.db.contr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.tekzup.db.model.Mail;
import de.tekzup.db.service.SendMailService;
import de.tekzup.db.service.impl.SendMailServiceImpl;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class MailController {
	
	@Autowired
	private SendMailService service;
	
	@PostMapping("/")
	public long save(@RequestBody Mail mail) {
		System.out.println("send mail");
		return service.sendMail(mail);
	}
	

}
