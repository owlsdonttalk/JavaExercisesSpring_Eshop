package com.owlsdonttalk.admin.service;


import com.owlsdonttalk.db.persist.repo.RoleRepository;
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
