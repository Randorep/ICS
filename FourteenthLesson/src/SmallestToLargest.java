import java.util.Scanner;
import java.util.Arrays;
public class SmallestToLargest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int num1 = sc.nextInt();
		final int num2 = sc.nextInt();
		final int num3 = sc.nextInt();
		int[] arr = {num1,num2,num3};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		sc.close();
	}

}
