package com.owlsdonttalk.controller;


import com.owlsdonttalk.service.CategoryRepr;
import com.owlsdonttalk.service.CategoryService;
import com.owlsdonttalk.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/category")
public class ShopCategoryController {

    private static final Logger logger = LoggerFactory.getLogger(ShopCategoryController.class);

    private final CategoryService categoryService;
    private final ProductService productService;

    @Autowired
    public ShopCategoryController(CategoryService categoryService, ProductService productService) {
        this.categoryService = categoryService;
        this.productService = productService;
    }

    @GetMapping("/")
    public String GetMapping(Model model){
        logger.info("Category page requested");
        List<CategoryRepr> categories = categoryService.findAll();
        model.addAttribute("categories", categories);
        return "category";
    }

    @GetMapping("/{id}")
    public String browseCategory(Model model, @PathVariable("id") Long id) {
        logger.info("Category page with id " + id + " requested");
        List<CategoryRepr> categories = categoryService.findAll();
        model.addAttribute("categories", categories);
        model.addAttribute("category", categoryService.findById(id).orElseThrow(IllegalStateException::new));
        return "category";
    }
}
