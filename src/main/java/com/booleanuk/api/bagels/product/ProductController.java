package com.booleanuk.api.bagels.product;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("products")
public class ProductController {
    private ProductRepository theProducts;

    public ProductController() {
        this.theProducts = new ProductRepository();
    }

    @GetMapping
    public ArrayList<Product> getAllProducts() {
        return this.theProducts.getAll();
    }

    @GetMapping("{id}")
    public Product getOneProduct(@PathVariable int id) {
        return this.theProducts.getOne(id);
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return this.theProducts.create(product);
    }

    @PutMapping("{id}")
    public Product updateProduct(@PathVariable int id, @RequestBody Product product) {
        return this.theProducts.update(id, product);
    }

    @DeleteMapping("{id}")
    public Product deleteProduct(@PathVariable int id) {
        return this.theProducts.delete(id);
    }
}
