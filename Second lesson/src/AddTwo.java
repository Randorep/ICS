//allow access to the code in the io (input/output) package
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
				//we need this to get keyboard input
public class AddTwo {
	public static void main(String[] args) throws IOException {//need the IOException to handle errors
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//declare and instantiate a BufferedReader object
																				//called br - used to get keyboard input
		int num2,num1,sum;
		System.out.println("Please enter first number");
		num1 = Integer.parseInt(br.readLine());
		num2 = Integer.parseInt(br.readLine());
		sum = num1+num2;
		System.out.println("The sum of the two numbers is "+sum);
		
	}
}
