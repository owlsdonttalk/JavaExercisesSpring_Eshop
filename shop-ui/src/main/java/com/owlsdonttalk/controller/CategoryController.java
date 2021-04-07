package com.owlsdonttalk.controller;

import com.owlsdonttalk.service.CategoryRepr;
import com.owlsdonttalk.service.CategoryService;
import com.owlsdonttalk.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class CategoryController {

    private static final Logger logger = LoggerFactory.getLogger(CategoryController.class);

    private final CategoryService categoryService;
    private final ProductService productService;


    public CategoryController(CategoryService categoryService, ProductService productService) {
        this.categoryService = categoryService;
        this.productService = productService;
    }

    @GetMapping("/category")
    public String GetMapping(Model model){
        logger.info("Category page requested");
        List<CategoryRepr> categories = categoryService.findAll();
        model.addAttribute("categories", categories);
        return "category";
    }

    @GetMapping("/category/{id}")
    public String browseCategory(Model model, @PathVariable("id") Long id) {
        logger.info("Category page with id " + id + " requested");
        model.addAttribute("category", categoryService.findById(id).orElseThrow(IllegalStateException::new));
        return "category";
    }
}
