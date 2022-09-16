package de.tekzup.db.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import de.tekzup.db.model.Condidat;


@Repository
public interface CondidatRepo extends JpaRepository<Condidat, Long> {

}
