import java.util.Scanner;
public class DunedinExtended3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type p or b to indicate pitcher or batter/type exit to exit");
		String firstInput = sc.next();
		String exitString = "exit";
		int counter = 0;
		while(!firstInput.equalsIgnoreCase(exitString)) {
			if(firstInput.equalsIgnoreCase("p")) {
				counter ++;
				System.out.println("Input Pitcher's score");
				int pitcherScore = sc.nextInt();
				if(pitcherScore > 87) {
					System.out.println("Assign Pitcher to Toronto");
				}
				else if(pitcherScore > 82) {
					System.out.println("Assign Pitcher to Dunedin");
				}
				else {
					System.out.println("Release Pitcher");
				}
			}
			else if(firstInput.equalsIgnoreCase("b")) {
				counter++;
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
			}
			System.out.println("Type p or b to indicate pitcher or batter/type exit to exit");
			firstInput = sc.next();
		}
		System.out.println("Total players sent to Toronto, Dunedin, and outright released is/are " +counter);
		sc.close();
	}
}