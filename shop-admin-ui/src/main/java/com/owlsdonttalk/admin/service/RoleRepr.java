package com.owlsdonttalk.admin.service;

import com.owlsdonttalk.db.persist.model.Role;
import com.owlsdonttalk.db.persist.model.User;

import java.util.List;
import java.util.Objects;

public class RoleRepr {

    private Long id;

    private String name;

    private List<User> users;

    public RoleRepr() {
    }

    public RoleRepr(String name) {
        this.name = name;
    }

    public RoleRepr(Role role) {
        this.id = role.getId();
        this.name = role.getName();
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

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoleRepr role = (RoleRepr) o;
        return name.equals(role.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
