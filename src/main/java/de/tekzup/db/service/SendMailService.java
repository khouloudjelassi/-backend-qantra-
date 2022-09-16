package de.tekzup.db.service;

import de.tekzup.db.model.Mail;

public interface SendMailService {
	public long sendMail(Mail mail);
	
}
