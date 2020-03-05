import java.io.*;
import java.text.DecimalFormat;
//import javax.swing.*;
public class Assign3 {
	public static void main(String[] args)throws IOException{
		String dd;
		Double c,e;
		//a = JOptionPane.showInputDialog("Radius");
		BufferedReader hh = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat("00000 0.00");
		dd = hh.readLine();
		c = Double.parseDouble(dd);
		e = c * c;
		final double d = Math.PI * e;
		final double k = 2 * Math.PI * c;
		System.out.println("The area of the circle is "+df.format(d)+ " and the perimeter of the circle is " + (double)(Math.round(k * 100)/100));
		hh.close();
}
}	