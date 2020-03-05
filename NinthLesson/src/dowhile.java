import java.util.*;
public class dowhile {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		String password;
		String correctpass = "passwordprotected";
		int passwordcount = 3;
		System.out.println("Please enter your password!");
		do {
			password = sc.next();
			if(!password.equals(correctpass)&&passwordcount >=1) {
				passwordcount -=1;
				System.out.println("You have "+passwordcount+" tries left.");
			}
				else if (!password.equals(correctpass)){
					System.out.println("Wrong password!");
					System.out.println("Please enter once again!");
				}
			}
		
		while(!password.equals(correctpass)&& passwordcount > 0);
		if(passwordcount>0) {
		System.out.println("Password Correct");
		}
		if(passwordcount <=0) {
			System.out.println("You've been locked out.");
		sc.close();
		}
	}
}
