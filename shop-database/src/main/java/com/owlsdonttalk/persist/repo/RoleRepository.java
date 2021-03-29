package com.owlsdonttalk.persist.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.owlsdonttalk.persist.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
