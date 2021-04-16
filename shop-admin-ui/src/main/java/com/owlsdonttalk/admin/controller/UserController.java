package com.owlsdonttalk.admin.controller;

import com.owlsdonttalk.admin.service.UserService;
import com.owlsdonttalk.admin.service.UserRepr;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @GetMapping("/user")
    public String userPage(Model model){
        logger.info("Admin user page request");
        List<UserRepr> users = userService.findAll();
        model.addAttribute("users", users);
        return "user";
    }

    @GetMapping("/user/{id}")
    public String editPage(@PathVariable("id") Long id, Model model) {
        logger.info("Edit page for id {} requested", id);

        return "user_form";
    }
}
