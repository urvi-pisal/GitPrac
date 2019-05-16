import java.util.*;
public class praccC {
	
	public static void main (String[] args) {
		Random m = new Random();
		System.out.println("Give me your favorite smallest integer?");
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		System.out.println("Give me your favorite largest integer?"); // This line was switched with the line below
		int y = in.nextInt();
		System.out.println("Now selecting a random number from " + x + " to " + y + " : " + (m.nextInt(y-x) + x)); // needed m.nextInt(), y and x, y is switched with x
		
		

	}

}
