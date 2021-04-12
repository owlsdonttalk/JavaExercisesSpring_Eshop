package com.owlsdonttalk.service;

import com.owlsdonttalk.persist.model.Category;
import com.owlsdonttalk.persist.model.Product;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.Set;

public class ProductRepr {

    private Long id;

    private String name;

    private BigDecimal price;

    private Set<CategoryRepr> categories;

    private Category category;

    public ProductRepr() {
    }

    public ProductRepr(Long id, String name, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public ProductRepr(Product product) {
        this.id = product.getId();
        this.name = product.getName();
        this.price = product.getPrice();
        this.category = product.getCategory();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductRepr product = (ProductRepr) o;
        return id.equals(product.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
