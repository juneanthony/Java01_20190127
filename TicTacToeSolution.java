public class TicTacToeSolution
{
	public static void main(String[] args)
	{
		int board[][] = new int[3][3];

		//populate
		for(int i =  0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			board[i][j] = 0;
		}

		for(int i =  0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				System.out.print("|"+board[i][j]+"|");
			}
			System.out.println("");
		}
	//System.out.println("It is a draw!");
	}

	
}