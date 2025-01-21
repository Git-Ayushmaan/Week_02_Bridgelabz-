class Product{
    // variables
    private static int discount = 5; // static keyword
    private final int productID; // final keyword

    private String productName;
    private double price;
    private int quantity;

    // constructors for initialization of object.
    Product(int id, String name, double cost, int qty){
        this.productID = id;
        this.productName = name;
        this.price = cost;
        this.quantity = qty;
    }

    // static method to update discount
    static void updateDiscount(int newDiscount){
        discount = newDiscount;
    }

    // printing result
    void displayResult(){
        if(this instanceof Product) { // instanceod Keyword
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: $" + price);
            System.out.println("Discount: " + discount);
            System.out.println("Quantity: " + quantity);
        }
        else {
            System.out.println("Invalid instance of object");
        }
    }
}

public class ProductMain {
    public static void main(String[] args) {
        // object initialization
        Product product1 = new Product(1, "Apple", 14.00, 10);
        product1.displayResult();
        System.out.println();
        Product.updateDiscount(3); // updating static variable
        product1.displayResult(); // printing result
    }
}
