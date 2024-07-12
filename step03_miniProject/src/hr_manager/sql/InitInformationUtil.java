package hr_manager.sql;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;


import hr_manager.controller.LoginController;
import hr_manager.model.dto.Manager;
import hr_manager.model.dto.User;

public class InitInformationUtil {
	
	private static InitInformationUtil instance = new InitInformationUtil();
	
	public static InitInformationUtil getInstance() {
		return instance;
	}
	
	static ArrayList<User> users = new ArrayList<User>();
	static ArrayList<Manager> managers = new ArrayList<Manager>();
	
	public InitInformationUtil() {

		try (BufferedReader br = new BufferedReader(new FileReader(
				"C:\\Users\\2-11\\seungji\\miniproject\\firstweek\\fisa-1st-week-project\\step03_miniProject\\src\\hr_manager\\sql\\manager.txt"))) {

			String line;
			while ((line = br.readLine()) != null) {
				String[] s = line.split(",");
				Manager manager = Manager.builder().no(Integer.parseInt(s[0])).name(s[1]).tel(s[2]).email(s[3]).pw(s[4])
						.build();
				managers.add(manager);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		try (BufferedReader br = new BufferedReader(new FileReader(
				"C:\\Users\\2-11\\seungji\\miniproject\\firstweek\\fisa-1st-week-project\\step03_miniProject\\src\\hr_manager\\sql\\user.txt"))) {

			String line;
			while ((line = br.readLine()) != null) {
				String[] s = line.split(",");
				User user = User.builder().no(Integer.parseInt(s[0])).email(s[1]).pw(s[2]).name(s[3]).cls(s[4])
						.tel(s[5]).build();
				users.add(user);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(users);
		System.out.println(managers);
	}
	
}
