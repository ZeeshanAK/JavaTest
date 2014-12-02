import java.security.SecureRandom;

public class RandomInts {

	public static void main(String[] args)
	{
		SecureRandom randNums = new SecureRandom();
		
		int n1 = 2;
		int n2 = 3;
		System.out.println(n1%n2);

		
		for (int i = 1; i <= 20; i++)
		{
			int number = 1 + randNums.nextInt(6);
			
			System.out.printf("%d ", number);
			
			if (i % 3 == 0)
				System.out.println();
		}
		
	}

}
