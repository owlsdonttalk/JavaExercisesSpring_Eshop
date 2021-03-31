package com.owlsdonttalk.persist.repo;

import com.owlsdonttalk.persist.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import com.owlsdonttalk.persist.model.Role;

import java.util.List;

public interface RoleRepository extends JpaRepository<Role, Long> {
    List<Role> findAll();
}
