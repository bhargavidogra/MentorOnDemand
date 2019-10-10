package com.example.demo.mentor;

import java.util.List;

import com.example.demo.user.User;

public interface MentorService {

	Mentor create(Mentor mentor);
	
	Mentor delete(int id);

	List<Mentor> findAll();

	Mentor findById(int id);

	Mentor update(Mentor mentor);

	Mentor validateuser(String userName, String password);
	
	 List<Mentor> findByActive(Boolean active);

}
