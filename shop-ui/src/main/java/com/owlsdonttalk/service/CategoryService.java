package com.owlsdonttalk.service;

import com.owlsdonttalk.persist.model.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    List<CategoryRepr> findAll();

    Optional<Category> findById(Long id);
}
