package _07_duck;

public class Whale {
	String FavOcean = "Pacific";
	int weightKG = 130000;
	
	
	void swim() {
		System.out.println("I am swiming in the " + FavOcean + " ocean.");
	}
	void comms() {
		System.out.println("Whale screaming intesifies");
	}
	
	Whale(String FavOcean, int weightKG) {
      	this.FavOcean = FavOcean;
      	this.weightKG = weightKG;
}
}
