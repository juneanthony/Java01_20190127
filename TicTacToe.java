import java.util.Scanner;

public class TicTacToe 
{

	public static void main( String[] args)
	{
		
		char Box = '_';
		System.out.println("Box: " + Box);
		
		char[][] Board = new char[3][3];
		
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				Board[i][j] = '_';
			}
		}

System.out.println("Board: ");
System.out.println(Board[0][0]);

System.out.println("Board Lay-out: ");

for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				System.out.print(Board[i][j]+" ");
			}
			System.out.println("");
		}

int a, b;

System.out.println("Player 1: Enter your move.");
System.out.println("a: ");
Scanner move = new Scanner(System.in);
a = move.nextInt();
System.out.println("b: ");
b = move.nextInt();

Board[a][b] = 'X';

for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				System.out.print(Board[i][j]+" ");
			}
			System.out.println("");
		}


System.out.println("Player 2: Enter your move.");
System.out.println("a: ");
Scanner player2move = new Scanner(System.in);
a = move.nextInt();
System.out.println("b: ");
b = move.nextInt();

Board[a][b] = 'O';

for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				System.out.print(Board[i][j]+" ");
			}
			System.out.println("");
		}
		
		
	}
}