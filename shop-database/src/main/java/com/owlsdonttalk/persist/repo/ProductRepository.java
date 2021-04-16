package com.owlsdonttalk.persist.repo;

import com.owlsdonttalk.persist.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAll();

    @Query("select distinct p " +
            "from Product p " +
            "left join fetch p.pictures " +
            "inner join fetch p.category ")
    List<Product> findAllWithPictureFetch();
}
