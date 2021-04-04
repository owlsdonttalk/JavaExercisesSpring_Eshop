package com.owlsdonttalk.service;


import com.owlsdonttalk.persist.repo.RoleRepository;
import com.owlsdonttalk.persist.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

    @Autowired
    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public List<RoleRepr> findAll() {
        return roleRepository.findAll().stream()
                .map(RoleRepr::new)
                .collect(Collectors.toList());
    }

}
