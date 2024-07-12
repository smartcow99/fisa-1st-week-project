package hr_manager.view;

import java.util.Scanner;

import hr_manager.controller.UserController;

public class UserView {
	
	private String email;
	
    UserController controller = UserController.getUserInstance();

    public UserView(String email) {
        this.email = email;
    }


	public void showMenu() {
		Scanner sc = new Scanner(System.in);
		Boolean flag = true;
		while (flag) {
			System.out.println("--- Menu ---");
			System.out.println("(1) 전체 사용자 보기");
			System.out.println("(2) 특정 사용자 검색");
			System.out.println("(3) 현재 사용자 보기");
			System.out.println("(4) 종료");
			int i = sc.nextInt();
			switch (i) {
			case 1: {
				controller.getUserList();
				break;
			}
			case 2: {
				System.out.println("--- 사용자 정보 입력 ---");

				System.out.println("Email: ");
				String email = sc.next();

				controller.getUser(email);
				break;
			}
			case 3: {
                controller.getUser(this.email);
                break;
            }
			default:
				System.out.println("etc");
				flag = false;
				break;
			}
		}
	}

//	public UserView(String email) {
//
//		System.out.println("UserView is called");
//		System.out.println(email);
//	}

}
