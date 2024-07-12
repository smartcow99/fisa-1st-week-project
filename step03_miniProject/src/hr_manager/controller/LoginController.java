package hr_manager.controller;


import hr_manager.service.LoginService;
import hr_manager.sql.InitInformationUtil;
import hr_manager.view.ManagerView;

public class LoginController {
	
	private static LoginController instance = new LoginController();
	
	private static LoginService service = LoginService.getInstance();

	static InitInformationUtil util = InitInformationUtil.getInstance();
	
	public static LoginController getInstance() {
		return instance;
	}
	
	
	public void userCheck(String email, String pw) {
		String check = service.userCheck(email, pw);
		System.out.println(check);
		if(check.equals("user")) {
//			UserView
			System.out.println("user");
		}
		else if(check.equals("manager")) {
			ManagerView.showMenu();
		}
//		else {
//			FailView
//		}
		
	}
}
