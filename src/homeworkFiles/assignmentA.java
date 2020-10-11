package homeworkFiles;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class assignmentA {

	public static void main(String[] args) {
		
		String brkLn = "_________________"; 
		
		//Create an instance of a HashSet of Integer called ids 
		ArrayList<String> employeeNames = new ArrayList<String>(); //done
		employeeNames.add("Tim-O-thy");
		employeeNames.add("A-A-ron");
		employeeNames.add("Jay-Quelin");
		employeeNames.add("Bl-ahk-eh");
		employeeNames.add("Dee-Nice");
		
		System.out.println("My List of employeeNames:");
		for (String name : employeeNames) {
			System.out.println(name);			
		}
			System.out.println(brkLn);
		
		
		//Create an instance of a HashSet of Integer called ids
		Set<Integer> ids = new HashSet<Integer>();
		ids.add(8675309);
		ids.add(42);
		ids.add(90510);
		ids.add(314159);
		ids.add(7777777);
		
		System.out.println("My List of ids:");
		for (Integer id : ids) {
			System.out.println(id);
		}
		System.out.println(brkLn);
		
		/*
		 * Added at least five entries to the employeeNames and ids (make sure both collections have the same number of entries).
		 * Tried to reference a lot of popular culture stuff in my lists this time just for fun. 
		 * I ended up adding a bunch of things I thought would be humorous so hopefully you catch all the pop culture jokes.
		 */

		
		
		//Create an instance of a HashMap of Integer, String called employeeMapa
		Map<Integer, String> employeeMap = new HashMap<Integer, String>();
			
		//Variable int i=0. Iterated id's over itself. this took AN HOUR to figure out ok? if this is wrong then I have no idea how.
		
		int i=0;
		for (Integer id : ids) {
			employeeMap.put(id, employeeNames.get(i));
			i++;
		}
		
		System.out.println("employeeMap Keyset:");
		Set<Integer> mapKeys = employeeMap.keySet();
			for (Integer key : mapKeys) {
				System.out.println("ID# " + key + ": " + employeeMap.get(key));
			}
		
		/*Create a variable int i = 0; 
		*then iterate over ids using an enhanced for loop. Inside the enhanced for loop use employeeMap.put() to add a new entry to the map. 
		*The entry should consist of a key that is the id in the enhanced loop’s current iteration, and a value that is the employeeName at position i of the employeeNames ArrayList.
		*Increment i so that each iteration grabs the next element in the ArrayList.
		*
		*
		*/
		System.out.println(brkLn);
		
		//Create a StringBuilder called idsBuilder
		StringBuilder idsBuilder = new StringBuilder();
			for (Integer id : ids) { //Iterate over the ids HashSet and append each id, followed by a dash “-“ to idsBuilder.
				idsBuilder.append(id + " | ");				
			}
			System.out.println("idsBuilder:");
		System.out.println(idsBuilder.toString()); // Print the result of idsBuilder.toString() to the console.

		
		System.out.println(brkLn);
		
		//Create another StringBuilder called namesBuilder.
		StringBuilder namesBuilder = new StringBuilder();
			for (String name : employeeNames) { //Iterate over the employeeNames ArrayList and append each name, followed by a space “ “ to the namesBuilder.

				namesBuilder.append(name + " | "); //not a " " but it looked nicer
			}
			System.out.println("namesBuilder:");
		System.out.println(namesBuilder.toString());

	}
	
}

