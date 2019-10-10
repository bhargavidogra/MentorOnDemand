package com.example.demo.mentorcalander;

import java.util.List;

import org.springframework.data.repository.Repository;
//data JPA repository
public interface MentorCalanderRepository extends Repository<MentorCalander,Integer> {
	
void delete(MentorCalander mentorCalander);

List<MentorCalander> findAll();

MentorCalander findOne(int id);

MentorCalander save(MentorCalander mentorCalander);

}
