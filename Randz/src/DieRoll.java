// Roll a six-sided die 6000 times.



import java.security.SecureRandom;

public class DieRoll {

	public static void main(String[] args)
	{
		SecureRandom randNum = new SecureRandom();
		
		int face1 =0; int face2 =0; int face3 =0;
		int face4 =0; int face5 =0; int face6 =0;
		
		for (int i = 1; i <= 6000; i++)
		{
			int number = 1 + randNum.nextInt(6);
			
			switch(number)
			{
				case 1:
					face1++;
					break;
					
				case 2:
					face2++;
					break;
					
				case 3:
					face3++;
					break;
					
				case 4:
					face4++;
					break;
					
				case 5:
					face5++;
					break;
					
				case 6:
					face6++;
					break;
			}
		}
		System.out.println("Number\tFrequency");
		System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n", face1, face2, face3, face4, face5, face6);

	}

}
