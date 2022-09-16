package de.tekzup.db.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import de.tekzup.db.model.Mail;
import de.tekzup.db.repo.MailRepository;
import de.tekzup.db.service.SendMailService;

@Service
@Transactional
public class SendMailServiceImpl implements SendMailService {
	@Autowired
	private JavaMailSender javaMailSender;
	
	 @Value("${spring.mail.username}") private String sender;
	
	@Autowired
	MailRepository repository;
	
	@Override
	public long sendMail(Mail mail) throws MailException{
		System.out.println("send email ...");
		SimpleMailMessage msg =new SimpleMailMessage();
		
		msg.setFrom(sender);
		msg.setTo(mail.getReceiver());
		msg.setSubject(mail.getObject());
		msg.setText(mail.getContent());
		javaMailSender.send(msg);
		return repository.save(mail).getMid();
	}

}
