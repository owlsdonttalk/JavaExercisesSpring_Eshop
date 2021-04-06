package com.owlsdonttalk.persist.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity
@Table(name = "categories")
public class Category implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", unique = true, nullable = false)
    private String name;

    @OneToMany(
            mappedBy = "category",
            cascade = CascadeType.ALL)
    private List<Product> products;

    public Category() {

    }
    public Category(String name) {
        this.name = name;
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
