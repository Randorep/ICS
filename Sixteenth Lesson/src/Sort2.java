import java.io.*;
public class Sort2 {
	public static void main(String[] args) throws IOException{
		int num,smallest,middle,largest;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter three numbers");
		num=Integer.parseInt(br.readLine());
		smallest=middle=largest=num;
		for (int i=2;i<=3;i++){
			System.out.println("Enter the "+i+" of three numbers");
			num=Integer.parseInt(br.readLine());
		
			if (num<smallest){
				middle=smallest;
				smallest=num;
			}
			else if (num>largest){
				middle=largest;
				largest=num;
			}
			else 
				middle=num;
		}
		System.out.println(smallest+"  "+middle+"  "+largest);	
	}
}

