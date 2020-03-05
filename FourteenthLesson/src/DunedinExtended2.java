import java.util.Scanner;
public class DunedinExtended2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Pitcher's name");
		String pitcherName = sc.next();
		String exitString = "exit";
		while(!pitcherName.equalsIgnoreCase(exitString)) {
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
			System.out.println("Input Pitcher's name");
			pitcherName = sc.next();
		}
		sc.close();
	}
}
