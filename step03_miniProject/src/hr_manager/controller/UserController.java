package hr_manager.controller;


import hr_manager.service.UserService;
import hr_manager.view.EndView;

public class UserController {
	
	private static UserController userInstance = new UserController();

	private static UserService userService = UserService.getUserServiceInstance();

	private UserController() {}

	public static UserController getUserInstance() {
		return userInstance; // 주소값만 제공해서 공유 
	}

	/*
	 * 모든 User 검색
	 * @return 모든 User
	 */
	public void getUserList() {
		EndView.projectUserListView(userService.getUserList());	
	}
	
	/*
	 * 로그인 되어있는 유저의 정보
	 * @param email 로그인에 사용한 이메일
	 * @return email에 맞는 유저 정보
	 * user가 로그인한 email을 받아와
	 */
	public void getUser(String email) {
		EndView.projectUserView(userService.getUser(email));
	}

}
