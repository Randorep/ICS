import java.util.Scanner;
public class DividedBy2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int counter = 0;
		while(num1%2 == 0) {
			num1 = num1/2;
			counter++;
		}
		System.out.println("The number of times this number can be divided by 2 without any remainder is "+counter);
		sc.close();
	}
}
