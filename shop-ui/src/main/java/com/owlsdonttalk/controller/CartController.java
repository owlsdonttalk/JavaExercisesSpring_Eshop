package com.owlsdonttalk.controller;

import com.owlsdonttalk.error.NotFoundException;
import com.owlsdonttalk.service.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/cart")
public class CartController {

    private static final Logger logger = LoggerFactory.getLogger(CartController.class);

    private final ProductService productService;
    private final CategoryService categoryService;
    private final CartService cartService;

    @Autowired
    public CartController(ProductService productService, CategoryService categoryService, CartService cartService) {
        this.productService = productService;
        this.categoryService = categoryService;
        this.cartService = cartService;
    }

    @GetMapping
    public String cartPage(Model model) {
        logger.info("Shopping cart page request");
        List<CategoryRepr> categories = categoryService.findAll();
        model.addAttribute("lineItems", cartService.getLineItems());
        model.addAttribute("categories", categories);
        return "cart";
    }

    @PostMapping
    public String addToCart(CartItemRepr cartItemRepr) {
        ProductRepr productRepr = productService.findById(cartItemRepr.getProductId())
                .orElseThrow(NotFoundException::new);
           cartService.addProductQty(productRepr, 1);
        return "redirect:/cart";
    }

    @GetMapping("/{id}/addProduct")
    public String addOneMore(@PathVariable("id") Long id){
        ProductRepr productRepr = productService.findById(id)
                .orElseThrow(NotFoundException::new);
        cartService.addProductQty(productRepr, 1);

        return "redirect:/cart";
    }

    @GetMapping("/{id}/removeProduct")
    public String removeOneProduct(@PathVariable("id") Long id){
        ProductRepr productRepr = productService.findById(id)
                .orElseThrow(NotFoundException::new);
        cartService.removeProductQty(productRepr, 1);

        return "redirect:/cart";
    }

}
