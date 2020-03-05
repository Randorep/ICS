import java.util.Scanner;
public class Combos {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Welcome to PopEyes, we have 4 combos: combo 1;combo 2;combo 3;combo 4. Which one would you like to order?");
		String num1 = sc.nextLine();
		num1 = num1.toLowerCase();
		int MealNum = 0;
		while(!num1.equalsIgnoreCase("end order")) {
			num1 = sc.nextLine();
			num1.toLowerCase();
			switch(num1) {
			case "combo 1":
				MealNum +=1;
			case "combo 2":
				MealNum +=1;
			case "combo 3":
				MealNum +=1;
			case "combo 4":
				MealNum +=1;
			}
		}
		System.out.println("The total amount of orders counted is/are " +  MealNum+".");
		sc.close();

	}
}
