package hr_manager.service;

import java.util.ArrayList;

import hr_manager.model.dto.User;

public class ManagerService {
	private ArrayList<User> user = new ArrayList<User>();

	public User getUser(String email) {
		for(User u : user) {
			if(u.getEmail().equals(email)) {
				return u;
			}
		}
		return null;
	}

	public ArrayList<User> getUserList() {
		return user;
	}

	public void delUser(User u) {
		// TODO Auto-generated method stub
		user.remove(u);
		
	}

	public void addUser(User u) {
		// TODO Auto-generated method stub
		user.add(u);
	}

}
