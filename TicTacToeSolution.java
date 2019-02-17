import java.util.Scanner;

public class TicTacToeSolution
{
	public static void main(String[] args)
	{
		char board[][] = new char[3][3];

		//populate
		for(int i =  0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			board[i][j] = '_';
		}

		for(int turn = 0; turn < 9; turn++)
		{
			//print board
			for(int i =  0; i < 3; i++)
			{
				for (int j = 0; j < 3; j++)
				{
					System.out.print(board[i][j]+" ");
				}
				System.out.println("");
			}

			Scanner move = new Scanner(System.in);
			System.out.print("Enter location of your move.");
			System.out.println("Row: ");
			int row = move.nextInt();
			System.out.println("Column: ");
			int col = move.nextInt();

			board[row][col] = turn%2 == 0 ? 'X':'O';
		}
		System.out.println("It is a draw!");
	}
}