package de.tekzup.db.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import de.tekzup.db.model.FileDB;

@Repository
public interface FileDBRepository extends JpaRepository<FileDB, String> {
}
