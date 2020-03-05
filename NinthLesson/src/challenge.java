import java.util.*;
public class challenge {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		int last = sc.nextInt();
		for(;last>=first;) {
			for(int lasts = last;lasts-1>=first;lasts--) {
				System.out.print('*');
			}
		for(int counter = 1;counter<=first;counter++ ) {
				System.out.print(first);
		}
			System.out.println();
			first++;
			sc.close();
		}
	}
}