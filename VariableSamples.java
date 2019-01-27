public class VariableSamples {
	public static void main(String[] args){
	//declare a data type with variable name
	//result and boolean data type
	boolean result = true;

	//declare a data type with variable name
	//option and char data type
	char option;
	option = 'C'; //assign 'C' to option

	//declare a data type with variable name
	//grade, double data type with variable name to 0.0
	double grade = 0.0;

	int counter = 5;

	System.out.println("Result: " + result);
	System.out.println("Option: " + option);
	System.out.println("Grade: " + grade);
	System.out.println("Grade: " + counter);

	result = false;
	option = 'G';
	grade = 1.0;
	counter++;

	System.out.println("The result is " + result);
	System.out.println("The options are " + option);
	System.out.println("The grade is " + grade);
	System.out.println("Grade: " + counter);
	}
}