package hr_manager.view;

import java.util.ArrayList;
import java.util.Scanner;

import hr_manager.controller.ManagerController;
import hr_manager.model.dto.User;

public class ManagerView {

	public ManagerView() {}
	
	ManagerController controller = ManagerController.getInstance();
	
	public void showMenu() {
		Scanner sc = new Scanner(System.in);
		Boolean flag = true;
		while(flag) {
			System.out.println("--- Menu ---");
			System.out.println("(1) 전체 사용자 보기");
			System.out.println("(2) 특정 사용자 검색");
			System.out.println("(3) 사용자 추가");
			System.out.println("(4) 사용자 삭제");
			System.out.println("(5) 종료");
			int i = sc.nextInt();
			switch (i) {
			case 1: {
				System.out.println("1");
				break;
			}
			case 2: {
				System.out.println("2");
				break;
			}
			case 3: {
				System.out.println("3");
				break;
			}
			case 4: {
				System.out.println("4");
				break;
			}
			default:
				System.out.println("etc");
				flag = false;
				break;
			}
		}
	}
	
	public void projectListView(ArrayList<user>) {
		
	}
}
