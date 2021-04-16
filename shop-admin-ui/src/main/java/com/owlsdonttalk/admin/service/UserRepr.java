package com.owlsdonttalk.admin.service;

import com.owlsdonttalk.db.persist.model.Role;
import com.owlsdonttalk.db.persist.model.User;
import java.util.Set;

public class UserRepr {

    private Long id;

    private String login;


    private String password;

    private Set<Role> roles;

    public UserRepr() {
    }

    public UserRepr(String login) {
        this.login = login;
    }

    public UserRepr(User user) {
        this.id = user.getId();
        this.login = user.getLogin();
        this.password = user.getPassword();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String name) {
        this.login = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}

