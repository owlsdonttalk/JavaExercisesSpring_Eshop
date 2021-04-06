package com.owlsdonttalk.controller;

import com.owlsdonttalk.service.CategoryService;
import com.owlsdonttalk.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

    private static final Logger logger = LoggerFactory.getLogger(ProductController.class);

    private final CategoryService categoryService;
    private final ProductService productService;


    public ProductController(CategoryService categoryService, ProductService productService) {
        this.categoryService = categoryService;
        this.productService = productService;
    }

    @GetMapping("/product")
    public String GetMapping(Model model){
        logger.info("Product page requested");
        return "product";
    }
}
