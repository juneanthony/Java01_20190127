import java.util.Scanner;

public class TicTacToe_01
{
		

	public static void main( String[] args)
	{
		
		char[] Square ={'0','1','2','3',
						'4','5','6',
						'7','8','9'};
						
				
		System.out.printf("| %c | %c | %c | \n", Square[1], Square[2], Square[3]);
		System.out.printf("| %c | %c | %c | \n", Square[4], Square[5], Square[6]);
		System.out.printf("| %c | %c | %c | \n", Square[7], Square[8], Square[9]);
		
		System.out.println("Player 1: Mark your move.");
		Scanner location = new Scanner(System.in);
		int a = location.nextInt();
		Square[a] = 'X';
		
		System.out.printf("| %c | %c | %c | \n", Square[1], Square[2], Square[3]);
		System.out.printf("| %c | %c | %c | \n", Square[4], Square[5], Square[6]);
		System.out.printf("| %c | %c | %c | \n", Square[7], Square[8], Square[9]);
		
		System.out.println("Player 2: Mark your move.");
		int b = location.nextInt();
		Square[b] = 'O';
		
		System.out.printf("| %c | %c | %c | \n", Square[1], Square[2], Square[3]);
		System.out.printf("| %c | %c | %c | \n", Square[4], Square[5], Square[6]);
		System.out.printf("| %c | %c | %c | \n", Square[7], Square[8], Square[9]);
		
		
	}
}