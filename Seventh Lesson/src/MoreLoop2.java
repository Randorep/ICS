import java.util.Scanner;
public class MoreLoop2 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int num2 = 0;
		int num1 = sc.nextInt();
		for(int i = 2;i<=num1;i++) {
			if((i)%2 == 0) {
				num2 = num2 + i;
			}
		}
		sc.close();
		System.out.println(num2);
	}
}
