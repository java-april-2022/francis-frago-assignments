package mainPackage;

public class Mammal{
	public int energyLevel;
	
	public Mammal(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	public int displayEnergy() {
		System.out.printf("Energy level: %s",this.energyLevel);
		return energyLevel;
	}

}
