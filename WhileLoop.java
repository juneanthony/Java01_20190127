public class WhileLoop {

	public static void main( String[] args){
		int x = 0;

		while (x < 10){
			if (x == 4) break;
			System.out.println(x);
			x++;
		}
	}
}