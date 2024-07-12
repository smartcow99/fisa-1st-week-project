package hr_manager.controller;


import hr_manager.service.LoginService;
import hr_manager.sql.InitInformationUtil;

public class LoginController {
	
	private static LoginController instance = new LoginController();
	
	private static LoginService service = LoginService.getInstance();

	public LoginController() {
		InitInformationUtil util = InitInformationUtil.getInstance();
	}
	
	public static LoginController getInstance() {
		return instance;
	}
	
	
	public void userCheck(String email, String pw) {
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
