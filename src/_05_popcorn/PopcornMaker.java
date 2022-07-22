package _05_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Popcorn popcorn = new Popcorn(JOptionPane.showInputDialog("What flavor would you like your popcorn?"));;
		Microwave microwave = new Microwave();
		microwave.putInMicrowave(popcorn);
		String time = JOptionPane.showInputDialog("How long would you like to cook your pocorn?");
		int timeI = Integer.parseInt(time);
		microwave.setTime(timeI);
		microwave.startMicrowave();
		popcorn.applyHeat();
		popcorn.eat();
	}

}
