public class TestOrder {

    public static void main(String[] args) {

        // Create 4 item variable types
        // Set price and the name for each -- "mocha", "latte", "drip coffee" and
        // "capuccino"
        Item item1 = new Item();
        item1.name = "mocha";
        item1.price = 3.50;

        Item item2 = new Item();
        item2.name = "latte";
        item2.price = 4.00;

        Item item3 = new Item();
        item3.name = "drip coffee";
        item3.price = 2.50;

        Item item4 = new Item();
        item4.name = "cappuccino";
        item4.price = 4.25;

        // Create 4 order variable of type Order and instanitate each with Order object.
        // Name them order1, order2, etc.
        // Set each order's name -- "Cindhuri", "Jimmy", "Noah", "Sam".
        Order order1 = new Order();
        order1.name = "Cindhuri";
        System.out.println(order1.total); // Print the order1 variable to the console to see what happens.

        Order order2 = new Order();
        order2.name = "Jimmy";

        Order order3 = new Order();
        order3.name = "Noah";

        Order order4 = new Order();
        order4.name = "Sam";

        // Add item1 to order2's item list and increment the order's total
        order2.total = order2.total + item1.price;

        // order3 ordered a cappucino. Add the cappuccino to their order list and to
        // their tab.
        order3.total = order3.total + item4.price;

        // order4 added a latte. Update accordingly.
        order1.total = order1.total + item2.price;

        // Cindhuri’s order is now ready. Update her status.
        order1.ready = true;

        // Sam ordered more drinks - 2 lattes. Update their order as well.
        order4.total = order4.total + (item2.price * 2);

        // Jimmy’s order is now ready. Update his status.
        order2.ready = true;

        // Application Simulations
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s \n", order1.total);
        System.out.printf("Ready: %s \n\n", order1.ready);

        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Total: %s\n", order2.total);
        System.out.printf("Ready: %s\n\n", order2.ready);

        System.out.printf("Name: %s\n", order3.name);
        System.out.printf("Total: %s \n", order3.total);
        System.out.printf("Ready: %s \n\n", order3.ready);

        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Total: %s \n", order4.total);
        System.out.printf("Ready: %s \n\n", order4.ready);

    }
}
