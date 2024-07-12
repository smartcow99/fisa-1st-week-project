package hr_manager.controller;

import hr_manager.service.LoginService;

public class LoginController {
	
	private static LoginController instance = new LoginController();
	
	private static LoginService service = new LoginService();
	
	private LoginController() {}

	public static LoginController getInstance() {
		return instance;
	}

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

}
