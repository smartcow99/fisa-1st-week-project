package hr_manager.view;

import java.util.ArrayList;
import java.util.Scanner;

import hr_manager.controller.ManagerController;
import hr_manager.model.dto.User;

public class ManagerView {

	public ManagerView() {
	}

	private static ManagerController controller = ManagerController.getInstance();

	public static void showMenu() {
		Scanner sc = new Scanner(System.in);
		Boolean flag = true;
		while (flag) {
			System.out.println("--- Menu ---");
			System.out.println("(1) 전체 사용자 보기");
			System.out.println("(2) 특정 사용자 검색");
			System.out.println("(3) 사용자 추가");
			System.out.println("(4) 사용자 삭제");
			System.out.println("(5) 종료");
			int i = sc.nextInt();
			switch (i) {
			case 1: {
				controller.getAllUser();
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
				System.out.println("--- 사용자 정보 입력 ---");

				System.out.println("Email: ");
				String email = sc.next();

				System.out.println("Password: ");
				String pw = sc.next();

				System.out.println("Name: ");
				String name = sc.next();

				System.out.println("Class: ");
				String cls = sc.next();

				System.out.println("Tel: ");
				String tel = sc.next();

				controller.addUser(email, pw, name, cls, tel);
				break;
			}
			case 4: {
				System.out.println("--- 사용자 정보 입력 ---");

				System.out.println("Email: ");
				String email = sc.next();
				
				controller.delUser(email);
				break;
			}
			default:
				System.out.println("etc");
				flag = false;
				break;
			}
		}
	}

//	public void projectListView(ArrayList<user>) {
//		
//	}
}
