class Test{
	
	String Dog;
	String Says;
	
	public static void main (String[] args){
		Test spot = new Test();
		Test scruffy = new Test();
		
		spot.Dog = "Ruff";
		scruffy.Dog = "Wurf";
		
		System.out.println("Spot says: " +  spot.Dog);
		System.out.printf("Scruffy says: " + scruffy.Dog);
		
	}
	
}
