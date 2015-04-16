/**
 * Exercise 5: (2) Create a class called Dog containing two Strings: name and says. 
 * In main( ), create two dog objects with names “spot” (who says, “Ruff!”) and “scruffy” (who says, “Wurf!”). 
 * Then display their names and what they say.
 * 
 * @author Zeeshan.Ahmed
 *
 */

public class Ex5 {

	String Dog;
	String Says;
	
	public static void main (String[] args){
		Ex5 spot = new Ex5();
		Ex5 scruffy = new Ex5();
		
		spot.Dog = "Ruff";
		scruffy.Dog = "Wurf";
		
		System.out.println("Spot says: " +  spot.Dog);
		System.out.printf("Scruffy says: " + scruffy.Dog);
		
	}
	
}
