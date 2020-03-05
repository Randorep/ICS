import java.util.Scanner;
import java.text.DecimalFormat;
import java.io.*;
public class Exercise1 {
	public static void main(String[]args)throws IOException{
		Double num1;
		Double num2;
		Double num3;
		Double num4;
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextDouble();
		num2 = sc.nextDouble();
		num3 = sc.nextDouble();	
		num4 = num1 + num2 +num3;
		num4 = num4 / 3;
		DecimalFormat num5 = new DecimalFormat("0.0");
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println("---");
		System.out.println(num5.format(num4));
		
	}
}
