package com.owlsdonttalk.controller;

import com.owlsdonttalk.error.NotFoundException;
import com.owlsdonttalk.service.ProductRepr;
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
@RequestMapping("/product")
public class ProductController {

    private static final Logger logger = LoggerFactory.getLogger(ProductController.class);

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public String productPage(Model model){
        logger.info("Admin product page request");
        List<ProductRepr> products = productService.findAll();
        model.addAttribute("products", products);
        return "product";
    }


    @GetMapping("/{id}/edit")
    public String adminEditProduct(Model model, @PathVariable("id") Long id) {
        logger.info("Product edit page request");
//        model.addAttribute("edit", true);
//        model.addAttribute("activePage", "Products");
        model.addAttribute("product", productService.findById(id).orElseThrow(NotFoundException::new));
//        model.addAttribute("categories", categoryRepository.findAll());
//        model.addAttribute("brands", brandRepository.findAll());
        return "product_form";
    }
}
