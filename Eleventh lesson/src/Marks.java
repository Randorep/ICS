import java.util.Scanner;
public class Marks {
	public static void main(String[] args) {
		//Variables
		Scanner sc = new Scanner(System.in);
		String input;
		int marks;
		int markSum = 0;
		int studentSum = 0;
		int studentCounts = 0;
		final int MARKCOUNT = 5;
		
		System.out.println("Name of the student?");
		input = sc.next();
		while(!input.equalsIgnoreCase("end")) {
			studentCounts++;
			markSum  = 0;
			for(int count = 1;count<=MARKCOUNT;count++) {
				System.out.println("Please enter mark number "+ count);
				marks = sc.nextInt();
				markSum = markSum+=marks;

			}
			markSum = markSum/MARKCOUNT;
			System.out.println(input + "'s average is " + markSum);
			studentSum = studentSum +markSum;
			System.out.println("Name of the student?");
			input = sc.next();
		}
		if(studentCounts != 0 && input.equalsIgnoreCase("end")) {
			studentSum = studentSum/studentCounts;
			System.out.println("The class average is "+ studentSum);
		}
		else if(studentCounts == 0){
			System.out.println("The class average is 0");
		}
		sc.close();
	}
}
