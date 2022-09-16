package de.tekzup.db.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import de.tekzup.db.model.Mail;
@Repository

public interface MailRepository extends JpaRepository<Mail, Long> {

}
