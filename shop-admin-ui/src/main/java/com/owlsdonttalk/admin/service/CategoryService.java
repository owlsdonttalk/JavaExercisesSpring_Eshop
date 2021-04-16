package com.owlsdonttalk.admin.service;

import com.owlsdonttalk.db.persist.model.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    List<CategoryRepr> findAll();

    Optional<Category> findById(Long id);
}
