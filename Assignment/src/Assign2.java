import java.io.*;
public class Assign2 {
	public static void main(String[] args) throws IOException{
		String a;
		String b;
		String c;
		String d;
		float num1;
		float num2;
		float num3;
		float num4;
		float sum;
		float avg;
		Integer counter = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		a = br.readLine();
		counter++;
		b = br.readLine();
		counter++;
		c = br.readLine();
		counter++;
		d = br.readLine();
		counter++;
		num1 = Float.parseFloat(a);
		num2 = Float.parseFloat(b);
		num3 = Float.parseFloat(c);
		num4 = Float.parseFloat(d);
		sum = num1 + num2 + num3 + num4;
		System.out.println(counter);
		avg = sum/counter;
		System.out.println("Your sum is " +sum + " and your average is " +avg);
		
	}
}
