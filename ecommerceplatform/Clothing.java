package com.encapsulationandpolymorphism.ecommerceplatform;

public class Clothing extends Product implements Taxable{
    private static final double tax_rate = 0.14;
    private static final double discount_rate = 0.2;

    public Clothing(int productId, String name, double price) {
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
        return getPrice()*discount_rate;
    }

    @Override
    public String getTaxDetails() {
        return "Tax details: "+ (tax_rate*100) + "%";
    }
}
