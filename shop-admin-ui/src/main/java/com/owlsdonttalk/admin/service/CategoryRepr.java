package com.owlsdonttalk.admin.service;

import com.owlsdonttalk.db.persist.model.Category;

import java.util.List;

public class CategoryRepr {

    private Long id;

    private String name;

    private List<ProductRepr> products;

    public CategoryRepr(){
    }

    public CategoryRepr(String name) {
        this.name = name;
    }

    public CategoryRepr(Category category) {
        this.id = category.getId();
        this.name = category.getName();
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
