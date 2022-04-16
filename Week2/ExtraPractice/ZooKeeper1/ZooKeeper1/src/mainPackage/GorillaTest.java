package mainPackage;

public class GorillaTest {

    public static void main(String[] args) {
    	
    	Mammal Lion = new Mammal(100);
    	Lion.displayEnergy();

    	Gorilla activity = new Gorilla(100);
    	activity.throwSomething("banana");
    	activity.throwSomething("rock");
    	activity.throwSomething("branch");
    	activity.eatBanana();
    	activity.eatBanana();
    	activity.climb();
    	activity.displayEnergy();
        
    }
    
}