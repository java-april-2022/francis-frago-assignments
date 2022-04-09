import java.util.ArrayList;
import java.util.Arrays;

public class TestCafe {

    public static void main(String[] args) {

        CafeUtil appTest = new CafeUtil();
    
        System.out.println("\n----- Streak Goal -----");
        System.out.printf("Purchases needed by week 10: %s \n\n", appTest.getStreakGoal(10));

        System.out.println("----- Order Total -----");
        double[] lineItems = {3.5, 1.5, 4.0, 4.5};
        System.out.printf("Order total: %s \n",appTest.getOrderTotal(lineItems));
        
        // Display  Menu Items
        System.out.println("\n----- Beverage Menu -----");
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("Drip Coffee");
        menu.add("Cappuccino");
        menu.add("Latte");
        menu.add("Mocha");
        appTest.displayMenu(menu);

        // Display Customer Names - user input entries    
        System.out.println("\n----- Customer Wait List  -----");
        ArrayList<String> customers = new ArrayList<String>();
        // --- Test 4 times ---
        for (int i = 0; i < 4; i++) {
            appTest.addCustomer(customers);
            System.out.println("");
        }

        // Display Menu Item Prices
        System.out.println("----- Menu Prices ----");
        Double[] prices = {1.5, 4.0, 4.5, 3.5};
        ArrayList<Double> priceList = new ArrayList<Double>(Arrays.asList(prices));
        appTest.displayMenu(menu, priceList);

        // Display Bean Prices
        System.out.println("\n----- Coffee Bean Price Chart -----");
        appTest.printBeanPrices("Columbian Roast",12.5, 4);
        appTest.printBeanPrices("Expresso Roast", 15.0, 5);
    }
}