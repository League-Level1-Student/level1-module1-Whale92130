package _07_duck;

public class AnimalRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck daffy = new Duck("grapes",5);
		daffy.Quack();
		daffy.Wadle();
		
		Whale blue = new Whale("Pacific", 136040);
		blue.swim();
		blue.comms();
	}

}
