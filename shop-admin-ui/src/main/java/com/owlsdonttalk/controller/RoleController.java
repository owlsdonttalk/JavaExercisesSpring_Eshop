package com.owlsdonttalk.controller;

import com.owlsdonttalk.service.RoleRepr;
import com.owlsdonttalk.service.RoleService;
import com.owlsdonttalk.service.UserRepr;
import com.owlsdonttalk.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/role")
public class RoleController {

    private static final Logger logger = LoggerFactory.getLogger(RoleController.class);

    private final RoleService roleService;

    @Autowired
    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping
    public String rolePage(Model model){
        logger.info("Admin role page request");
        List<RoleRepr> roles = roleService.findAll();
        model.addAttribute("roles", roles);
        return "role";
    }
}
