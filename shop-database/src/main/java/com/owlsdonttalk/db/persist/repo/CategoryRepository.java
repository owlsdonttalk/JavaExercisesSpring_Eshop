package com.owlsdonttalk.db.persist.repo;

import com.owlsdonttalk.db.persist.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    List<Category> findAll();
}
