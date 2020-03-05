import java.util.Scanner;
public class Class1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Which program would you like to run? 1 or 2");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			Class2.main(args);
			break;
		case 2:
			Class3.main(args);
			break;
		default:
			System.out.println("This option is not available");
		}
		sc.close();

	}

}
