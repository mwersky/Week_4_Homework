//Instantiate a hashMap string of string? okay! AS as bonus I'll add a scanner so you can use it like a multiple choice thing.
//I thought it would be cool to also just apply a quick practical application

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner; //ignore this. For extra fun.

public class WeeklyDiscussion {
	 

	public static void main(String[] args) {		
		
		Map<String, String> fruitOrVeg = new HashMap<String, String>(); //And here is the answer!
		fruitOrVeg.put("Banana", "Great fruit.");
		fruitOrVeg.put("Strawberry",  "Best fruit.");
		fruitOrVeg.put("Tomato", "Up for Debate.");
		fruitOrVeg.put("Broccoli", "Definitely a Vegetable.");
		fruitOrVeg.put("Spoon", "Good job there was no point to this."); //and these are how you fill your map.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please choose from the following");
		System.out.println("Banana");
		System.out.println("Strawberry");
		System.out.println("Tomato");
		System.out.println("Broccoli");
		System.out.println("Spoon");
		
		System.out.print("your choice: ");
		String choice = sc.next();
		System.out.println(" ");
		System.out.println(fruitOrVeg.get(choice));
		
		sc.close();
				
	}

}
