package com.encapsulationandpolymorphism.ecommerceplatform;

import java.util.ArrayList;
import java.util.List;

public class UseProduct {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        Product pr;
        pr = new Clothing(101,"trouser",789.00);
        products.add(pr);
        pr = new Electronics(107,"laptop",99000.00);
        products.add(pr);
        pr = new Groceries(117,"Mango",83.00);
        products.add(pr);

        for(Product product : products){
            product.calculateDiscount();
            product.displayProductDetails();
            System.out.println();
        }

    }
}
