package de.tekzup.db.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import de.tekzup.db.model.Objectif;
@Repository

public interface ObjectifRepo extends JpaRepository<Objectif, Long>{


}
