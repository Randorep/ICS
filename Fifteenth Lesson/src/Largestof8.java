import java.util.Scanner;
public class Largestof8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int largestNum = sc.nextInt();
		for(int i =1;i < 8;i++) {
			int nextnum = sc.nextInt();
			if(nextnum>largestNum){
				largestNum = nextnum;
			}
		}
		sc.close();
		System.out.println(largestNum);
	}

}
