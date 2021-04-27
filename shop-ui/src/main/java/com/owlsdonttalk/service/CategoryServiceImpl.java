package com.owlsdonttalk.service;


import com.owlsdonttalk.persist.model.Category;
import com.owlsdonttalk.persist.repo.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }


    @Override
    public List<CategoryRepr> findAll() {
        return categoryRepository.findAll().stream()
                .map(CategoryRepr::new)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Category> findById(Long id) {
        return categoryRepository.findById(id);
    }
}

