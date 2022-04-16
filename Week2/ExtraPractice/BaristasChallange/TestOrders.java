// import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) {
        // Menu Item
        Item item1 = new Item("Mocha", 3.5);
        Item item2 = new Item("Latte", 4.00);
        Item item3 = new Item("Drip Coffee", 2.5);
        Item item4 = new Item("Cappuccino", 4.25);

        // Create 2 orders for unspecified guests (without specifying a name);
        Order order1 = new Order();
        Order order2 = new Order();

        // Create 3 orders using the overloaded constructor to give each a name for the
        // order.
        Order order3 = new Order("Francis");
        Order order4 = new Order("Daisy");
        Order order5 = new Order("Alex");

        // Add at least 2 items to each of the orders using the addItem method you wrote
        order1.addItem(item2);
        order1.addItem(item1);

        order2.addItem(item4);
        order2.addItem(item2);

        order3.addItem(item2);
        order3.addItem(item3);

        order4.addItem(item1);
        order4.addItem(item3);

        order5.addItem(item3);
        order5.addItem(item4);

        order1.display();
        order2.display();
        order3.display();
        order4.display();
        order5.display();

        // Test your getStatusMessage functionality by setting some orders to ready and
        // printing the messages for each order.
        order2.setReady(true);
        order5.setReady(true);

        System.out.println(order1.getStatusMessage());
        System.out.println(order2.getStatusMessage());
        System.out.println(order3.getStatusMessage());
        System.out.println(order4.getStatusMessage());
        System.out.println(order5.getStatusMessage());
    }

}