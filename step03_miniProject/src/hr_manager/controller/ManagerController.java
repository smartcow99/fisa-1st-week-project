package hr_manager.controller;

import java.util.ArrayList;

import hr_manager.model.dto.User;
import hr_manager.service.ManagerService;

public class ManagerController {

	private ArrayList<User> user = new ArrayList<User>();

	private static ManagerController instance = new ManagerController();

	private static ManagerService service = new ManagerService();

	public static ManagerController getInstance() {
		return instance;
	}

	// 전체 유저 검색
	public void getAllUser() {
		EndView.projectListView(service.getUserList());
	}

	// 특정 유저 검색
	public void getUser(String email) {
		EndView.projectView(service.getUser(email));
	}

	// 사용자 추가
	public void addUser(String email, String pw, String name, String cls, String tel) {
		user.add()
	}

	// 사용자 삭제
	public void delUser(String email) {
		// TODO Auto-generated method stub
		
	}

}
