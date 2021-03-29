package com.owlsdonttalk.persist.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.owlsdonttalk.persist.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
