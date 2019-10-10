package com.example.demo.user;

import java.util.List;

import com.example.demo.user.trainings.TrainingDetails;

public interface UserService {

	User create(User user);
	
	User delete(int id);

	List<User> findAll();

	User findById(int id);

	User update(User user);

	User validateuser(String userName, String password);

	 List<User> findByActive(Boolean active);

}
