import java.util.Scanner;
public class Averagemasks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double mark,total= 0;
		final int NUMMARKS = 6;
		System.out.println("This program finds the average of " +NUMMARKS+ " marks");
		for(int i =1;i <= 6;i++) {
			System.out.println("Please enter mark "+i+" of " +NUMMARKS+ " marks");
			mark = sc.nextDouble();
			total = total+=mark;
			
		}
		total = total/5;
		System.out.println("The average of the " +NUMMARKS+" marks is "+total);
		sc.close();
	}

}
