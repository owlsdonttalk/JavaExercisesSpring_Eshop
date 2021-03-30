package com.owlsdonttalk.persist.repo;

import com.owlsdonttalk.persist.model.Product;
import com.owlsdonttalk.persist.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
