package chapter03abstractness.example3shopping;

public class Main {
    public static void main(String[] args) {
        // create some store items
        StoreItem laptop = new Electronic("Laptop", 999.99, 1, "Apple", "MacBook Pro", 12);
        StoreItem book = new Book("Java Programming", 39.99, 2, "123 Main St", "John Smith");
        StoreItem shirt = new Clothing("T-Shirt", 19.99, 3, "456 Oak Ave", "Large");

        // add the items to a shopping cart
        CartItem[] cart = new CartItem[3];
        cart[0] = (CartItem) laptop;
        cart[1] = (CartItem) book;
        cart[2] = (CartItem) shirt;

        // print out the items in the cart and their total cost
        for (CartItem item : cart) {
            System.out.println(item.getDescription() + ": $" + item.getTotalCost());
        }

        // calculate the total cost of the items in the cart
        double totalCost = 0.0;
        for (CartItem item : cart) {
            totalCost += item.getTotalCost();
        }
        System.out.println("Total cost: $" + totalCost);
    }

}
