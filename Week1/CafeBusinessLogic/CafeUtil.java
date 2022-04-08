import java.util.ArrayList;

public class CafeUtil { 

    // public int getStrekGoal(int numWeeks) {
    //     int sum = 0;
    //     for (int i = 0; i < numWeeks; i++) {
    //         sum += i;
    //     }
    //     return sum;
    // }

    public int getStreakGoal() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        return sum;
    }

    public double getOrderTotal(double[] prices) {
        double orderTotalPrices = 0;

        for (int i = 0; i < prices.length; i++) {
            orderTotalPrices += prices[i];
        }
        return orderTotalPrices;
    }

    public void displayMenu(ArrayList<String> menuItems) {
        String name = menuItems.get(0);
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.printf("%s %s\n", i, menuItems.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello " + userName);
        System.out.printf("There are %s people in front of you\n", customers.size());
        customers.add(userName);
        System.out.println(customers);
    }


}