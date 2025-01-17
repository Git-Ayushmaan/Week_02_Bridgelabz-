import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Add items to the cart
        cart.addItem("Apple", 0.99, 3);
        cart.addItem("Banana", 0.59, 5);
        cart.addItem("Milk", 2.49, 2);

        // Print total cost
        System.out.println("Total Cost: $" + cart.getTotalCost());

        // Remove an item and print total cost
        cart.removeItem("Apple");
        System.out.println("Total Cost after removing Apple: $" + cart.getTotalCost());
    }

    private List<CartItem> cartItems;

    public ShoppingCart() {
        cartItems = new ArrayList<>();
    }

    public void addItem(String itemName, double price, int quantity) {
        cartItems.add(new CartItem(itemName, price, quantity));
    }

    public void removeItem(String itemName) {
        cartItems.removeIf(item -> item.itemName.equals(itemName));
    }

    public double getTotalCost() {
        return cartItems.stream().mapToDouble(item -> item.price * item.quantity).sum();
    }

    private static class CartItem {
        private String itemName;
        private double price;
        private int quantity;

        public CartItem(String itemName, double price, int quantity) {
            this.itemName = itemName;
            this.price = price;
            this.quantity = quantity;
        }
    }
}
