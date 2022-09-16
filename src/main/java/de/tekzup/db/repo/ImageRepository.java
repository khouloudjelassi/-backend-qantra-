package de.tekzup.db.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

import de.tekzup.db.model.ImageModel;

public interface ImageRepository extends JpaRepository<ImageModel, Long> {
	Optional<ImageModel> findByName(String name); }


