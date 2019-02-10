import java.util.Scanner;

public class TicTacToe_02
{
		
	public static void main( String[] args)
	{
		
		char[] Square ={'0','1','2','3',
						'4','5','6',
						'7','8','9'};

		int a,b;
		Scanner location = new Scanner(System.in);
						
				
		System.out.printf("| %c | %c | %c | \n", Square[1], Square[2], Square[3]);
		System.out.printf("| %c | %c | %c | \n", Square[4], Square[5], Square[6]);
		System.out.printf("| %c | %c | %c | \n", Square[7], Square[8], Square[9]);
	
	int moves = 0;
	while	(moves < 9)
	{


		System.out.println("Player 1: Mark your move.");
		a = location.nextInt();
		Square[a] = 'X';
		
		System.out.printf("| %c | %c | %c | \n", Square[1], Square[2], Square[3]);
		System.out.printf("| %c | %c | %c | \n", Square[4], Square[5], Square[6]);
		System.out.printf("| %c | %c | %c | \n", Square[7], Square[8], Square[9]);

		if(moves<9)
		{
			if(Square[1]==Square[2]&&Square[2]==Square[3])
			{
				System.out.printf("Player 1 wins\n");
				break;
			}
			
			else if (Square[4] == Square[5] && Square[5] == Square[6])
			{
				System.out.printf("Player 1 wins\n");
				break;
			}
	              
	    	else if (Square[7] == Square[8] && Square[8] == Square[9])
	   		{
				System.out.printf("Player 1 wins\n");
				break;
			}
		        
	    	else if (Square[1] == Square[4] && Square[4] == Square[7])
			{
				System.out.printf("Player 1 wins\n");
				break;
			}
	        
	    	else if (Square[2] == Square[5] && Square[5] == Square[8])
			{
				System.out.printf("Player 1 wins\n");
				break;
			}
	   
	   		 else if (Square[3] == Square[6] && Square[6] == Square[9])
			{
				System.out.printf("Player 1 wins\n");
				break;
			}

			else if (Square[1] == Square[5] && Square[5] == Square[9])
			{
				System.out.printf("Player 1 wins\n");
				break;
			}
			
			else if (Square[3] == Square[5] && Square[5] == Square[7])
			{
				System.out.printf("Player 1 wins\n");
				break;
		}
	}
		
		System.out.println("Player 2: Mark your move.");
		b = location.nextInt();
		Square[b] = 'O';
		
		System.out.printf("| %c | %c | %c | \n", Square[1], Square[2], Square[3]);
		System.out.printf("| %c | %c | %c | \n", Square[4], Square[5], Square[6]);
		System.out.printf("| %c | %c | %c | \n", Square[7], Square[8], Square[9]);


		if(Square[1]==Square[2]&&Square[2]==Square[3])
		{
			System.out.printf("Player 2 wins\n");
			break;
		}

		else if (Square[4] == Square[5] && Square[5] == Square[6])
		{
			System.out.printf("Player 2 wins\n");
			break;
		}
		              
    	else if (Square[7] == Square[8] && Square[8] == Square[9])
   		{
			System.out.printf("Player 2 wins\n");
			break;
		}
		   
    	else if (Square[1] == Square[4] && Square[4] == Square[7])
		{
			System.out.printf("Player 2 wins\n");
			break;
		}
	        
    	else if (Square[2] == Square[5] && Square[5] == Square[8])
		{
			System.out.printf("Player 2 wins\n");
			break;
		}
        
   		else if (Square[3] == Square[6] && Square[6] == Square[9])
		{
			System.out.printf("Player 2 wins\n");
			break;
		}
		
		else if (Square[1] == Square[5] && Square[5] == Square[9])
		{
			System.out.printf("Player 2 wins\n");
			break;
		}
		
		else if (Square[3] == Square[5] && Square[5] == Square[7])
		{
			System.out.printf("Player 2 wins\n");
			break;
		}
   			
		
	}

}
}