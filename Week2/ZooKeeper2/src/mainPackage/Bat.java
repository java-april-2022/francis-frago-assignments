package mainPackage;

public class Bat extends Mammal {
	public Bat() {
		super(300);
	}

	public int fly() {
		energyLevel -=50;
		System.out.println("\tEnergy reducing flight, time to eat\n");
		return displayEnergy();
	}

	public int eatHumans() {
		energyLevel +=25;
		System.out.println("\tBat gains energy after eating humans\n");
		return displayEnergy();
	}
	
	public int attackTown() {
		energyLevel -=100;
		System.out.println("\tBat energy reduced after attacing the town\n");
		return displayEnergy();
	}
}
	