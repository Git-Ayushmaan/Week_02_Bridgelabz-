package com.encapsulationandpolymorphism.ecommerceplatform;

public class Electronics extends Product implements Taxable{

    private static final double tax_rate = 0.18;
    private static final double discount_rate = 0.1;

    public Electronics(int productId, String name, double price) {
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
        return "Tax rate: "+(tax_rate * 100)+"%";
    }
}
