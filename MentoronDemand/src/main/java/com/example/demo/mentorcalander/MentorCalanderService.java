package com.example.demo.mentorcalander;

import java.util.List;

public interface MentorCalanderService {

	MentorCalander create(MentorCalander mentorCalander);
	
	MentorCalander delete(int id);

	List<MentorCalander> findAll();

	MentorCalander findById(int id);

	MentorCalander update(MentorCalander mentorCalander);

}
