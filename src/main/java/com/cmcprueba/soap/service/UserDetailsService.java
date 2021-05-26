package com.cmcprueba.soap.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import com.cmcprueba.soap.bean.User;
import com.cmcprueba.users.Authentication;

@Component
public class UserDetailsService {
	
	private static List<User> users = new ArrayList<>();
	static {
		Authentication auth1 = new  Authentication();
		auth1.setLastDate("26/05/2021");
		auth1.setLasthour("5:30 PM");
		auth1.setAttempts(6);
		User user1 = new User(1, "Jhair Andres Escobar", "janska029@gmail.com","3208216504",auth1);
		users.add(user1);
		Authentication auth2 = new  Authentication();
		auth2.setLastDate("20/04/2021");
		auth2.setLasthour("1:30 AM");
		auth2.setAttempts(5);
		User user2 = new User(2, "David valdes", "David@gmail.com","65987123",auth2);
		users.add(user2);
		Authentication auth3 = new  Authentication();
		auth2.setLastDate("10/04/2021");
		auth2.setLasthour("12:36 PM");
		auth2.setAttempts(1);
		User user3 = new User(3, "Maria camila", "camila@gmail.com","89745631",auth3);
		users.add(user3);
		
	}
	
	public User findById(int id) {
		for (User user : users) {
			if (user.getId() == id)
				return user;
		}
		return null;
	}
	
	public List<User> findAll() {
		return users;
	}
	
	public int deleteById(int id) {
		for (User user : users) {
			if (user.getId() == id)
				users.remove(user);
				return 1;
		}
		return 0;
	}

}
