public class Conditional_SwitchCase {

	public static void main( String[] args){
		int grade = 100;

		switch (grade){
			case 100:
			System.out.println("Excellent!");
			//break;

			case 90:
			System.out.println("Good job!");
			break;

			case 80:
			System.out.println("Study Harder!");
			break;

			default:
			System.out.println("Sorry, you failed!");
		}
	}
}