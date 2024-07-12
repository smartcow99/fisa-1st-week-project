package hr_manager.view;

import java.util.ArrayList;
import hr_manager.model.dto.User;

public class EndView {
	// 모든 유저 출력
	public static void projectUserListView(ArrayList<User> allUser) {
		int index = 1;
		for (User user : allUser) {
			if (user != null) {
				System.out.println("[ User : " + (index++) + "] " + "유저 이름 : " + user.getName() + ", class : "
						+ user.getCls() + ", 전화번호 : " + user.getTel() + ", email : " + user.getEmail());
			}
		}
	}

	public static void projectUserView(User user) {
		if (user != null) {
			System.out.println("User : " + "유저 이름 : " + user.getName() + ", class : " + user.getCls() + ", 전화번호 : "
					+ user.getTel() + ", email : " + user.getEmail());
		} else {
			System.out.println("해당 유저는 존재하지 않습니다.");
		}
	}
}