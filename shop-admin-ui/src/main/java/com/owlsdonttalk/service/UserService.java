package com.owlsdonttalk.service;

import com.owlsdonttalk.persist.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<UserRepr> findAll();

}
