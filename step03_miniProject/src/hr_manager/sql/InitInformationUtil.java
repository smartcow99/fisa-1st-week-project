package hr_manager.sql;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

import hr_manager.controller.LoginController;
import hr_manager.model.dto.Manager;
import hr_manager.model.dto.User;
import lombok.Getter;

public class InitInformationUtil {

	private static InitInformationUtil instance = new InitInformationUtil();

	public static InitInformationUtil getInstance() {
		return instance;
	}

	ArrayList<User> users = new ArrayList<User>();
	ArrayList<Manager> managers = new ArrayList<Manager>();

	public ArrayList<User> getUsers() {
		return users;
	}

	public ArrayList<Manager> getManagers() {
		return managers;
	}

	// 새로운 메서드: 사용자 데이터를 파일로 저장
	public void saveUsersToFile(String filePath) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
			for (User user : users) {
				bw.write(user.toCsvString());
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public InitInformationUtil() {
		String basePath = System.getProperty("user.dir");
		String managerFilePath = basePath + "/src/hr_manager/sql/manager.txt";
		String userFilePath = basePath + "/src/hr_manager/sql/user.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(managerFilePath))) {

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

		try (BufferedReader br = new BufferedReader(new FileReader(userFilePath))) {

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

	}

}
