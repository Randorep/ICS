import java.util.Scanner;
public class Selection {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int TestNum = sc.nextInt();
		int AddNum = 0;
		for(int i = 1;i<=TestNum-1;i++) {
			if(TestNum%i == 0) {
				AddNum = AddNum += i;
			}
		}
		if(AddNum == TestNum) {
			System.out.println(TestNum + " is a perfect number.");
		}
		else{
			System.out.println(TestNum + " is not a perfect number.");	
		}
		sc.close();
	}

}

