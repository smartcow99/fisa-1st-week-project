package hr_manager.controller;

import hr_manager.service.LoginService;
import hr_manager.view.ManagerView;
import hr_manager.view.UserView;

public class LoginController {

	private static LoginController instance = new LoginController();

	private static LoginService service = new LoginService();

	private static ManagerView mView = new ManagerView();

	private LoginController() {
	}

	public static LoginController getInstance() {
		return instance;
	}

	public void userCheck(String email, String pw) {
		String check = service.userCheck(email, pw);
//		if(check.equals("user")) {
//			Userview(email);
//		}
//		else if(check.equals("manager")) {
//			ManagerView
//		}
//		else {
//			FailView
//		}
		mView.showMenu();
		System.out.println(check);

	}

}
