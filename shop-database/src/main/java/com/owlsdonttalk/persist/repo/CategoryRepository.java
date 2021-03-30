package com.owlsdonttalk.persist.repo;

import com.owlsdonttalk.persist.model.Category;
import com.owlsdonttalk.persist.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
