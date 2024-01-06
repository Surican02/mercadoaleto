package com.mercadoaleto.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/products")
public class ProductsController {
    @Autowired
    private ProductsService productsService;

    @GetMapping
    public Object findProducts(){
        return this.productsService.findProducts();
    }

}
