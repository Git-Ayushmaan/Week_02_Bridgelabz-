package com.encapsulationandpolymorphism.ecommerceplatform;

public class Groceries extends Product implements Taxable{
    private static final double tax_rate = 0.17;
    private static final double discount_rate = 0.3;

    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice()*discount_rate;
    }

    @Override
    public void displayProductDetails() {
        super.displayProductDetails();
    }

    @Override
    public double calculateTax() {
        return getPrice()*tax_rate;
    }

    @Override
    public String getTaxDetails() {
        return "Tax Details: "+(tax_rate*100)+"%";
    }
}

