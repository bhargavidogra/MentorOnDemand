package com.example.demo.mentor;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import com.example.demo.user.User;
//data JPA repository
public interface MentorRepository extends Repository<Mentor,Integer> {
	
void delete(Mentor mentor);

List<Mentor> findAll();
@Query("select mentor from Mentor mentor where mentor.mentorid=?")
Mentor findOne(int id);

Mentor save(Mentor mentor);
@Query("select mentor from Mentor mentor where mentor.userName=? and mentor.password=?")
Mentor validateuser(String userName, String password);
List<Mentor> findByActive(Boolean active);
}
