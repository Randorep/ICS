
public class MoreLoop1 {
	public static void main(String[]arg) {
		double num1,num4 = 0;
		double num3;
		for(int i =91;i<= 989;i++) {
			num1 = i;
			num3 = (num1/13)%1;
			if(num3 == 0) {
				num4 = num4+=num1;
			}
		}
		System.out.println((int)num4);
	}
}
