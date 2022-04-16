import java.util.ArrayList;

public class Order {

    // MEMBER VARIABLES
    private String name; // default value of null
    private boolean ready; // default value false
    private ArrayList<Item> items = new ArrayList<Item>();// defaults to null

    // CONSTRUCTOR
    // No arguments, sets name to "Guest", initializes items as an empty list.
    public Order() {
        this.name = "Guest";
        this.ready = false; // default value
    }

    // OVERLOADED CONSTRUCTOR
    // Takes a name as an argument, sets name to this custom name.
    // Initializes items as an empty list.
    public Order(String name) {
        this.name = name;
        this.ready = false; // default value
    }

    // GETTERS & SETTERS
    public String getName() {
        return name;
    }

    public void setName(String nameOfOrder) {
        name = nameOfOrder;
    }

    public boolean getReady() {
        return ready;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    // ORDER METHODS

    // Create a method called addItem that takes an Item object as an argument and
    // adds the item to the order's items array. No need to return anything.
    public void addItem(Item item) {
        this.items.add(item);
    }

    // Create a method called getStatusMessage that returns a String message. If the
    // order is ready, return "Your order is ready.", if not, return "Thank you for
    // waiting. Your order will be ready soon."
    public String getStatusMessage() {
        if (this.ready == true) {
            return ("Your order is ready.");
        } else {
            return ("Thank you for waiting. Your order will be ready soon.");
        }
    }

    // Similar to the getOrderTotal method from the Cafe Business Logic assignment,
    // create a method called getOrderTotal that sums together each of the item's
    // prices, and returns the total amount.
    public double getOrderTotal() {
        double total = 0.00;
        for (Item item : this.items) {
            total += item.getPrice();
        }
        return total;
    }

    // Similar to the displayMenu function from the Cafe Business Logic assignment,
    // create a method called display that prints out the order information...
    public void display() {
        System.out.printf("\n Customer Name: %s \n", this.name);
        for (Item item : this.items) {
            System.out.printf(item.getName() + " - $" + item.getPrice() + "\n");
        }
        System.out.printf("Total: $%s\n", this.getOrderTotal() + "\n");
    }

}
