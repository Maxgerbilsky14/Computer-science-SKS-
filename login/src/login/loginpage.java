package login;

import java.util.Scanner;

public class loginpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner UsernameScan = new Scanner(System.in);
		
		System.out.print("username: ");
		String username = UsernameScan.nextLine();
		

		Scanner Passwordscan = new Scanner(System.in);
		System.out.print("Password: ");
		String password = Passwordscan.nextLine();
		
		
		if (username.equals("MAX")&& password.equals("12345")) {
			System.out.print("LOG IN SUCSSEFUL, WELCOME " + username);
			
		}
		else {
			System.out.print("BLOCKED");
		}
		

	}

}
