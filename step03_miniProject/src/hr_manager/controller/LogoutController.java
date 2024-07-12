package hr_manager.controller;

import java.util.List;

import hr_manager.model.dto.Manager;
import hr_manager.model.dto.User;
import hr_manager.sql.InitInformationUtil;

public class LogoutController {
	private static LogoutController instance = new LogoutController();
	private List<User> users = InitInformationUtil.getInstance().getUsers();
	private List<Manager> managers = InitInformationUtil.getInstance().getManagers();

	public static LogoutController getInstance() {
		return instance;
	}

	public void printAll() {
		InitInformationUtil util = InitInformationUtil.getInstance();
		String userFilePath = "C:\\Users\\2-11\\seungji\\miniproject\\firstweek\\fisa-1st-week-project\\step03_miniProject\\src\\hr_manager\\sql\\user.txt";
		String managerFilePath = "C:\\Users\\2-11\\seungji\\miniproject\\firstweek\\fisa-1st-week-project\\step03_miniProject\\src\\hr_manager\\sql\\manager.txt";

		util.saveUsersToFile(userFilePath);
		util.saveManagersToFile(managerFilePath);
	}

}
