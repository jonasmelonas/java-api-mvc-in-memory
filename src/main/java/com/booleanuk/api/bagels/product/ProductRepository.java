package com.booleanuk.api.bagels.product;

import java.util.ArrayList;

public class ProductRepository {
    private ArrayList<Product> products;

    public ProductRepository() {
        this.products = new ArrayList<>();
    }

    public ArrayList<Product> getAll() {
        return this.products;
    }

    public Product getOne(int id) {
        for(Product product : this.products) {
            if(product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    public Product create(Product product) {
        this.products.add(product);
        return product;
    }

    public Product update(int id, Product product) {
        for(int i = 0; i < this.products.size(); i++) {
            if(this.products.get(i).getId() == id) {
                this.products.get(i).setName(product.getName());
                this.products.get(i).setCategory(product.getCategory());
                this.products.get(i).setPrice(product.getPrice());
                return this.products.get(i);
            }
        }
        return null;
    }

    public Product delete(int id) {
        for(int i = 0; i < this.products.size(); i++) {
            if(this.products.get(i).getId() == id) {
                return this.products.remove(i);
            }
        }
        return null;
    }
}
