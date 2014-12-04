//Craps game

import java.security.SecureRandom;

public class CrapsGame 
{
	static SecureRandom randNum = new SecureRandom();
	private enum Status {WIN, LOST, CONTINUE};
	
	
	public static void main(String[] args) 
	{
		int point = 0;
		int sumOfDice = rollDice();
	    Status gameStatus; // can contain CONTINUE, WON or LOST

		switch (sumOfDice) 
		{
		case 7:
		case 11:
			gameStatus = Status.WIN;
			break;

		case 2:
		case 3:
		case 12:
			gameStatus = Status.LOST;
			break;
			
		default:
			gameStatus = Status.CONTINUE;
			point = sumOfDice;
		//	System.out.printf("Player rolled %d%n",sumOfDice);
			System.out.printf("Point is %d%n", point);
			break;
		}
		
		while (gameStatus == gameStatus.CONTINUE)
		{
			sumOfDice = rollDice();
			if (sumOfDice == point)
			{
				gameStatus = Status.WIN;
				
			} else 
			{
				gameStatus = Status.LOST;
			}
		}
		
		if (gameStatus == Status.WIN)
	         System.out.println("Player wins");
	      else
	         System.out.println("Player loses");		
	}


	private static int rollDice() 
	{
		int face1 = 1 + randNum.nextInt(6);
		int face2 = 1 + randNum.nextInt(6);
		int sum = face1 + face2;
		
		System.out.printf("Player rolled %d + %d = %d%n", 
				face1, face2, sum);
		
		return sum;
	}

}
