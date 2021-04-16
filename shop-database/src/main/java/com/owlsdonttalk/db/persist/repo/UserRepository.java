package com.owlsdonttalk.db.persist.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.owlsdonttalk.db.persist.model.User;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long>, JpaSpecificationExecutor<User> {

    List<User> findAll();

    Optional<User> findUserByLogin(String name);
}