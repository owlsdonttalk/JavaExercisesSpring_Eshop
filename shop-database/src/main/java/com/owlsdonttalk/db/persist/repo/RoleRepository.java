package com.owlsdonttalk.db.persist.repo;

import com.owlsdonttalk.db.persist.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoleRepository extends JpaRepository<Role, Long> {
    List<Role> findAll();
}
