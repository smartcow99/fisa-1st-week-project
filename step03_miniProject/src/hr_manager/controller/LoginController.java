package hr_manager.controller;

import org.junit.Test;

import hr_manager.service.LoginService;
import hr_manager.sql.InitInformationUtil;

public class LoginController {
	
	InitInformationUtil util = new InitInformationUtil();
	
	private static LoginController instance = new LoginController();
	
	//private static LoginService service = new LoginService();
	

	public static LoginController getInstance() {
		return instance;
	}

	@Test
	public void test() {
		InitInformationUtil iu = new InitInformationUtil();
		
	}
	
	/*
	public void userCheck(String email, String pw) {
		// TODO Auto-generated method stub
		String check = service.userCheck(email, pw);
		if(check.equals("user")) {
			UserView
		}
		else if(check.equals("manager")) {
			ManagerView
		}
		else {
			FailView
		}
		
	}
*/
}