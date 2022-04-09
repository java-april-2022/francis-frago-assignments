import java.util.ArrayList;

public class CafeUtil { 

    // Display  Weeks for Streak Goal
    public int getStreakGoal(int numWeeks) {
        int sum = 0;
        for (int i = 0; i <= numWeeks; i++) {
            sum += i;
        }
        return sum;
    }

    // Display  Order Total
    public double getOrderTotal(double[] prices) {
        double orderTotalPrices = 0;
        for (int i = 0; i < prices.length; i++) {
            orderTotalPrices += prices[i];
        }
        return orderTotalPrices;
    }

    // Display  Menu
    public void displayMenu(ArrayList<String> menuItems) {
        String name = menuItems.get(0);
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.printf("%s %s\n", i, menuItems.get(i));
        }
    }

    // Display  Menu Item Prices **Ninja Bonus - overload method**
    public boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices){
        if(menuItems.size() != prices.size()){
            return false;
        }
        for(int i=0; i<=menuItems.size()-1; i++){
            System.out.printf("%d %s - $%.2f\n", i, menuItems.get(i), prices.get(i));
        }
        return true;
    }

    // Display Customer Names - user input entries
    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello " + userName);
        System.out.printf("There are %s people in front of you\n", customers.size());
        customers.add(userName);
    }

    // Display Bean Prices **Ninja Bonus**
    public void printBeanPrices(String product, double price, int maxQuantity){
        System.out.printf("%s", product);
        for (int quantity =1; quantity <maxQuantity; quantity++){
            System.out.printf("\n%s - $%.2f", quantity, quantity * price);
        }
        System.out.println("");
    }
}

