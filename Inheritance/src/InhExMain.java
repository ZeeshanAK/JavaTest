
public class InhExMain {

	public static void main(String[] args) 
	{
		InhExMid obj = new InhExMid("Master", "Khan", "Sean");
		
		System.out.println(obj.getName());
		
		System.out.printf("First name: %s%nMidname: %s%nLastname: %s", obj.fName, obj.mName, obj.lName);
		InhEx obj2 = obj;
		System.out.println("BlaBlaBlaBla");
		System.out.println(obj2.getName());
		
		
	}
}
