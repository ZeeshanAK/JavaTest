
import java.util.Scanner;

public class MainClass 
{
	public static void main (String[] args)
	{
	Scanner keyInput = new Scanner(System.in);
	
	TestClass classObj = new TestClass();
	
	System.out.println("Yo, my gangster. Watz yer name? xD");
	String name = keyInput.nextLine();
	
		classObj.setName(name);
		System.out.printf("Your name is: %s", classObj.getName());
		
	}
}
