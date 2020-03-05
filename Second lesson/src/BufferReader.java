import java.io.*; //allow access to the code in the io (input/output) package
				//we need this to get keyboard input
public class BufferReader {
	public static void main(String[] args) throws IOException {//need the IOException to handle errors
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//declare and instantiate a BufferedReader object
																				//called br - used to get keyboard input
		String name;//declare a variable of type String called 'name'
		System.out.println("Please enter your name");
		name = br.readLine();//use the readLine() method to get keyboard input and store the value in the variable 'name'
		System.out.println("Your name is "+name);//print the message 'The name.....' and concatenate the message
															//with the variable name
		
	}
}
