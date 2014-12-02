import java.util.Scanner;

public class IfStatement 
{
	public static void main (String[] args)
	{
		Scanner keyInput = new Scanner(System.in);
		
		System.out.printf("Enter grades of -1 to quit: ");
		int grade = keyInput.nextInt();
		
		int gradeCounter = 0;
		int total = 0;
		while (grade != -1)
		{
			total = total + grade;
			gradeCounter++;
						
			System.out.printf("Enter grades or -1 to quit: ");
			grade = keyInput.nextInt();
		}
		
		if (gradeCounter !=0)
		{
			/* Variable type in () means we are casting. e.g. in the following line 
			 we are casting an int into a double. */
			double average = (double) total / gradeCounter;	 
			System.out.printf("The total average of %d grades is : %.2f", gradeCounter, average);
		}
		else
		{
			System.out.println("No grades were entered!");
		}
	}
}
