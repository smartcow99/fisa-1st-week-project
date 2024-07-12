package hr_manager.view;

import java.util.Scanner;

import hr_manager.controller.LoginController;

public class StartView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Manager Info
		
		
		// User Info
		
		
		LoginController controller = LoginController.getInstance();
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.println("----Menu----");
			System.out.println("(1) Login ");
			System.out.println("(2) Exit ");
			int i = sc.nextInt();
			if(i == 1) {
				System.out.println("--- Login ---");
				System.out.print("Email: ");
				String email = sc.next();
				System.out.print("Password: ");
				String pw = sc.next();
//				System.out.println(email + " " + pw);
				controller.userCheck(email, pw);
			}
			else {
				System.out.println("End Process...");
				break;
			}
		}
		
	}

}
