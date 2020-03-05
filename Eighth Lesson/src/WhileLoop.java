import java.util.*;
public class WhileLoop {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int count = 1;
		String name;
		System.out.println("This program reads a name and exits if 'stop' is entered");
		System.out.println("Enter a name or 'stop' to quit");
		name = sc.next();
		while(!name.equalsIgnoreCase("stop")) {//loop while name is not(!) equal to 'stop
			System.out.println("You entered the name " + name);
			count++;
			name = sc.next();
		}
		
	}
}
