package hr_manager.service;


import java.util.ArrayList;
import hr_manager.model.dto.User;

public class UserService {
	private static UserService userServiceInstance = new UserService();
	
	private UserService() {}
	
	public static UserService getUserServiceInstance() {
		return userServiceInstance;
	}
	
	//User 저장
	private ArrayList<User> UserList = new ArrayList<User>();
	
	/*
	 *  모든 User
	 *  
	 *  @return 모든 UserInfo
	 */
	public ArrayList<User> getUserList(){
		return UserList;
	}
	
	/*
	 * 로그인한 user email로 검색
	 * 
	 */
	public User getUser(String email) {
		//존재하는 프로젝트들 하나씩 뽑음
		for (User user : UserList) {
			if (user != null && user.getEmail().equals(email)) {
				return user;
				//유저 존재 여부 확인 && 존재하는유저 email 반환 후 parameter 로 유입된 email과 비교
			}
		}
		return null;
	}

}
