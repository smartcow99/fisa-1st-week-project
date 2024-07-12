package hr_manager.service;

import java.util.ArrayList;

import hr_manager.model.dto.Manager;
import hr_manager.model.dto.User;
import hr_manager.sql.InitInformationUtil;

public class LoginService {

	private static LoginService instance = new LoginService();

	private ArrayList<User> user = InitInformationUtil.getInstance().getUsers();
	private ArrayList<Manager> manager = InitInformationUtil.getInstance().getManagers();
	
	public LoginService() {
	}

	public static LoginService getInstance() {
		return instance;
	}

	public String userCheck(String email, String pw) {

		for (User u : user) {
			if (u.getEmail().equals(email) && u.getPw().equals(pw)) {
				return "user";
			}
		}
		for (Manager m : manager) {
			if (m.getEmail().equals(email) && m.getPw().equals(pw)) {
				return "manager";
			}
		}
		return "fail";
	}

}
