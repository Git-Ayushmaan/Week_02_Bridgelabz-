import java.util.ArrayList;
import java.util.List;

class Customer{
    //Attributes
    private List<Product> products;
    private String name;

    //Initialize name and empty list of product
    public Customer(String name){
        this.name = name;
        this.products= new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    //Create Method for Add products
    public void addProduct(String name,int quantity,double price){
        products.add(new Product(name,quantity,price));
    }

    // Method to get the list of products purchased by the customer
    public List<Product> getProductsPurchased() {
        return products;
    }
}

class Product{
        //Attributes for product class
        private String prodName;
        private double prodPrice;
        private int prodQuantity;

        //initialization
        public Product(String prodName, int prodQuantity ,double prodPrice){
            this.prodName=prodName;
            this.prodQuantity=prodQuantity;
            this.prodPrice=prodPrice;
        }

        public String getName(){
            return prodName;
        }

        //Compute Cost of the product
        public double getCost() {
        return prodQuantity * prodPrice;
    }
}

class BillGenerator{
    //get cost of the products and calculate total
    public static double generateBill(Customer customer) {
        double total = 0;
        for (Product product : customer.getProductsPurchased()) {
            total += product.getCost();
        }
        //return total bill
        return total;
    }
}

//main class
public class BillGenerationApplication {
    public static void main(String[] args) {
        Customer customer = new Customer("Alice");
        customer.addProduct("Apples", 2, 3);
        customer.addProduct("Orange", 1, 2);

        //Request method for generate total bill
        double totalBill = BillGenerator.generateBill(customer);
        System.out.println("Customer: " + customer.getName());

        for (Product product : customer.getProductsPurchased()) {
            System.out.println("Product: " + product.getName() + ", Cost: " + product.getCost());
        }

        //Display Total Bill
        System.out.println("Total Bill:" + totalBill);
    }
}
