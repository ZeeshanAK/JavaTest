import java.util.Scanner;

public class MaxFinder 
{
	public static void main(String[] args)
	{
		Scanner inKey = new Scanner(System.in);
		
		System.out.println("Enter 3 number to compare;");
		int num1 = inKey.nextInt();
		int num2 = inKey.nextInt();
		int num3 = inKey.nextInt();
		
		System.out.printf("Max out of %d, %d, %d is %d", num1, num2, num3, getMax(num1, num2, num3));
		
	}
	
	public  static int getMax(int num1,int num2, int num3)
	{
		int max = num1;
		
		if (num2 > num1)
			max = num2;
		
		if (num3 > num1)
			max = num3; 
		
		return max;
	}

}
