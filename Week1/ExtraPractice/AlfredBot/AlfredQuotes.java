import java.util.Date;

public class AlfredQuotes {

    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }

    public String guestGreeting(String name) {
        // YOUR CODE HERE
        return String.format("Hello %s, I am well, thank you for asking.", name);
    }

    public String dateAnnouncement() {
        // YOUR CODE HERE
        return String.format("Today's date is %s", new Date());
    }

    public String respondBeforeAlexis(String response) {
        // YOUR CODE HERE
        if (response.indexOf("Alexis") > -1) {
            return "Are you doing anything special today?";
        }
        if (response.indexOf("Alfred") > -1) {
            return "I think I will play golf, it's a good day for it.";
        }
        return "Okay have a good round!";
    }

}
