package com.owlsdonttalk.controller;

import com.owlsdonttalk.service.CategoryRepr;
import com.owlsdonttalk.service.CategoryService;
import com.owlsdonttalk.service.ProductRepr;
import com.owlsdonttalk.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class EshopController {

    private static final Logger logger = LoggerFactory.getLogger(EshopController.class);

    private final ProductService productService;
    private final CategoryService categoryService;

    @Autowired
    public EshopController(CategoryService categoryService, ProductService productService) {
        this.productService = productService;
        this.categoryService = categoryService;
    }

    @GetMapping
    public String productListPage(Model model) {
        logger.info("Index page request");
        List<ProductRepr> products = productService.findAll();
        List<CategoryRepr> categories = categoryService.findAll();
        model.addAttribute("categories", categories);
        model.addAttribute("products", products);
        return "index";
    }
}
