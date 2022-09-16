package de.tekzup.db.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import de.tekzup.db.model.Category;


public interface CategoryRepo extends JpaRepository<Category, Long> {

}
