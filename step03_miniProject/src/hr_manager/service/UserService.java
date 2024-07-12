package hr_manager.service;


import java.util.ArrayList;
import hr_manager.model.dto.User;
import hr_manager.sql.InitInformationUtil;

public class UserService {
	private static UserService userServiceInstance = new UserService();
	
	private UserService() {}
	
	public static UserService getUserServiceInstance() {
		return userServiceInstance;
	}
	//User 저장
	private ArrayList<User> UserList = InitInformationUtil.getInstance().getUsers();
	
	/*
	 *  모든 User
	 *  @return 모든 UserInfo
	 */
	public ArrayList<User> getUserList(){
		return UserList;
	}
	
	/*
	 * 로그인한 user email로 검색
	 */
	public User getUser(String email) {
		for (User user : UserList) {
			if (user != null && user.getEmail().equals(email)) {
				return user;
				//유저 존재 여부 확인 && 존재하는유저 email 반환 후 parameter 로 유입된 email과 비교
			}
		}
		return null;
	}

}
