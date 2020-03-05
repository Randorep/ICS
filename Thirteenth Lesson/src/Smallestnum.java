import java.util.Scanner;
public class Smallestnum {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String num1 = "",num2 = "";
		int num3 = 0,num4 = 0;
		num1 = "";
		num2 = "";
		int counter = 0;
		do {
			if(counter == 0) {
				num1 = sc.next();
			}
			if(num1.equalsIgnoreCase("end")) {
				break;
			}
			else {
				num3 = Integer.parseInt(num1);
			}
			if(counter == 0) {
				num2 = sc.next();
			}
			if(num2.equalsIgnoreCase("end")) {
				break;
			}
			else {
				num4 = Integer.parseInt(num2);
			}
			if(num3>num4) {
				num1 = sc.next();
			}
			else {
				num2 = sc.next();
			}
			counter ++;

		}while(true);
		if(num3>num4 && !num1.equalsIgnoreCase("end") && !num2.equalsIgnoreCase("end")) {
			System.out.println(num4);
		}
		else if(num1.equalsIgnoreCase("end") ||num2.equalsIgnoreCase("end") && counter == 0) {
			System.out.println("No input/smallest number");
		}
		else {
			System.out.println(num3);
		}
		sc.close();
	}
}