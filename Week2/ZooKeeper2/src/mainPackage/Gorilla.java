package mainPackage;

public class Gorilla extends Mammal {
	public Gorilla(int energyLevel) {
		super(energyLevel);
	}
	public void throwSomething(String item) {
		System.out.printf("\nGorilla throwing %s", item);
		energyLevel -= 5;
	}
	public void eatBanana() {
		System.out.printf("\nGorilla eating banana");
		energyLevel += 10;
	}
	public void climb() {
		System.out.printf("\nGorilla climbing tree");
		energyLevel -= 10;
	}
}

