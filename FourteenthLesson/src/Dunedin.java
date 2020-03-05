import java.util.Scanner;
public class Dunedin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Batter's name");
		String batterName = sc.next();
		final String EXIT = "exit";
		while(!batterName.equalsIgnoreCase(EXIT)) {
			System.out.println("Input Batter's average");
			int batterScore = sc.nextInt();
			if(batterScore >= 300) {
				System.out.println("Send Batter to Toronto");
			}
			else if(batterScore >= 275) {
				System.out.println("Send Batter to Dunedin");
			}
			else if(batterScore < 275) {
				System.out.println("Release Batter");
			}
			System.out.println("Input Batter's name");
			batterName = sc.next();
		}
		sc.close();

	}
}
