import java.util.*;

//  Program to Simulate a Shopping Cart

class CartItem {
    String itemName;
    double price;
    int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return price * quantity;
    }
}

public class ShoppingCart {
    private List<CartItem> cartItems;

    public ShoppingCart() {
        cartItems = new ArrayList<>();
    }

    public void addItem(String itemName, double price, int quantity) {
        CartItem item = new CartItem(itemName, price, quantity);
        cartItems.add(item);
        System.out.println("Item added: " + itemName);
    }
    public void removeItem(String itemName) {
        Iterator<CartItem> iterator = cartItems.iterator();
        boolean itemRemoved = false;
        
        while (iterator.hasNext()) {
            CartItem item = iterator.next();
            if (item.itemName.equalsIgnoreCase(itemName)) {
                iterator.remove();
                System.out.println("Item removed: " + itemName);
                itemRemoved = true;
                break;
            }
        }
        
        if (!itemRemoved) {
            System.out.println("Item not found: " + itemName);
        }
    }
    public void displayTotalCost() {
        double totalCost = 0;
        for (CartItem item : cartItems) {
            totalCost += item.getTotalPrice();
        }
        System.out.println("Total cost of the cart: $" + totalCost);
    }

    public void displayItems() {
        System.out.println("\nCart Items:");
        if (cartItems.isEmpty()) {
            System.out.println("Your cart is empty.");
        } else {
            for (CartItem item : cartItems) {
                System.out.println(item.itemName + " - Quantity: " + item.quantity + " - Price: $" + item.price + " - Total: $" + item.getTotalPrice());
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        while (true) {
            System.out.println("\n--- Shopping Cart Menu ---");
            System.out.println("1. Add item to cart");
            System.out.println("2. Remove item from cart");
            System.out.println("3. Display total cost");
            System.out.println("4. Display cart items");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String itemName = sc.nextLine();
                    System.out.print("Enter item price: $");
                    double price = sc.nextDouble();
                    System.out.print("Enter item quantity: ");
                    int quantity = sc.nextInt();
                    cart.addItem(itemName, price, quantity);
                    break;
                
                case 2:
                    System.out.print("Enter item name to remove: ");
                    itemName = sc.nextLine();
                    cart.removeItem(itemName);
                    break;
                
                case 3:
                    cart.displayTotalCost();
                    break;

                case 4:
                    cart.displayItems();
                    break;

                case 5:
                    System.out.println("Thank you for using the shopping cart!");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
