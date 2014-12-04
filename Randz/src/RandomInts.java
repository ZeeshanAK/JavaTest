//Random number generator

import java.security.SecureRandom;

public class RandomInts {

	public static void main(String[] args)
	{
		SecureRandom randNums = new SecureRandom();
		
		for (int i = 1; i <= 20; i++)
		{
			int number = 1 + randNums.nextInt(6);
			
			System.out.printf("%d ", number);
			
			if (i % 5 == 0)
				System.out.println();
		}
	}
}
