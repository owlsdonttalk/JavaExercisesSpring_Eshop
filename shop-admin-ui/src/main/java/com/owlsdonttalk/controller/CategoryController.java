package com.owlsdonttalk.controller;

import com.owlsdonttalk.service.CategoryRepr;
import com.owlsdonttalk.service.CategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CategoryController {

    private static final Logger logger = LoggerFactory.getLogger(RoleController.class);

    private final CategoryService categoryService;

    CategoryController(CategoryService categoryService){
        this.categoryService = categoryService;
    }

    @GetMapping("/category")
    public String categoryPage(Model model){
        logger.info("Admin category page request");
        List<CategoryRepr> categories = categoryService.findAll();
        model.addAttribute("categories", categories);
        return "category";
    }
}
