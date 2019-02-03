import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class GetInputFromKeyboard {
	public static void main(String[] args){
		BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

		String name = "";
		int age = 0;
		System.out.print("Please Enter Your Name:");
		try{
		name =  dataIn.readLine();
		System.out.print("Please Enter Your Age: ");
		age = Integer.parseInt(dataIn.readLine());
		}catch(IOException e){
			System.out.println("Error!");
		}catch(NumberFormatException e){
			System.out.println("Catch Number Format Exception.")
		}
		System.out.println("Hello " + name + "!");
	}
}