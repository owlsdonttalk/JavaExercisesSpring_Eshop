package com.owlsdonttalk.persist.repo;

import com.owlsdonttalk.persist.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoleRepository extends JpaRepository<Role, Long> {
    List<Role> findAll();
}
