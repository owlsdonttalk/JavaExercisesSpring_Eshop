package com.owlsdonttalk.persist.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.owlsdonttalk.persist.model.User;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long>, JpaSpecificationExecutor<User> {

    List<User> findAll();
}
