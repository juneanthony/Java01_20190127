public class Conditional_SwitchCase_01 {

	public static void main( String[] args){
		String fruit = "apple";

		switch (fruit){
			case orange:
			System.out.println("Excellent!");
			//break;

			case apple:
			System.out.println("Good job!");
			break;

			case grape:
			System.out.println("Study Harder!");
			break;

			default:
			System.out.println("Sorry, you failed!");
		}
	}
}