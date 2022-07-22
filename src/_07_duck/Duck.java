package _07_duck;

public class Duck {
	int numberOfFriends = 5;
	String favoriteFood = "grape";
	
		// TODO Auto-generated method stub
		void Quack() {
			System.out.println("Quack");
			System.out.println("I like " + favoriteFood);
		}
		void Wadle() {
			System.out.println("Wadle");
		}
		Duck(String favoriteFood, int numberOfFriends) {
	      	this.favoriteFood = favoriteFood;
	      	this.numberOfFriends = numberOfFriends;
	}

		
	}


