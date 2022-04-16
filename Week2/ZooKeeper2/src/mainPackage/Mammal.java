package mainPackage;

public class Mammal{
	public static int energyLevel = 100;
	
	public Mammal(int energyLevel) {
		Mammal.energyLevel = energyLevel;
	}
	
	public int displayEnergy() {
		System.out.printf("Energy level: %s",Mammal.energyLevel);
		return energyLevel;
	}

}
