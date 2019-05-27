package com.in28minutes.rest.webservices.restfullwebservices.user;
import java.util.List;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.Date;

@Component
public class UserDaoService {
	public static int usersCount=3;
	public static List<User> users = new ArrayList<>();
	
	static {
		users.add(new User(1,"Adam", new Date()));
		users.add(new User(2,"Eve", new Date()));
		users.add(new User(3,"Jack", new Date()));
	}
	
	public List<User> findAll(){
		return users;
	}
	
	public User save(User user) {
		if (user.getId() == null) {
			user.setId(++usersCount);
		}
		users.add(user);
		return user;
	}
	
	public User findOne(int id) {
		for(User user:users) {
			if(user.getId()==id) {
				return user;
			}
		}
		return null;
	}
	
	
}
