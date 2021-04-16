package com.owlsdonttalk.controller;

import com.owlsdonttalk.error.NotFoundException;
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
public class ShopProductController {

    private static final Logger logger = LoggerFactory.getLogger(ShopProductController.class);

    private final CategoryService categoryService;
    private final ProductService productService;


    public ShopProductController(CategoryService categoryService, ProductService productService) {
        this.categoryService = categoryService;
        this.productService = productService;
    }

    @GetMapping("/product/{id}")
    public String GetMapping(Model model, @PathVariable("id") Long id) {
        logger.info("Product page with id " + id + " requested");
        List<CategoryRepr> categories = categoryService.findAll();
        model.addAttribute("categories", categories);
        model.addAttribute("product", productService.findById(id).orElseThrow(NotFoundException::new));
        return "product";
    }
}
