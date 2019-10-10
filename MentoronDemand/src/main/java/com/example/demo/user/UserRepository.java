package com.example.demo.user;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import com.example.demo.user.trainings.TrainingDetails;
//data JPA repository
public interface UserRepository extends Repository<User,Integer> {
	
void delete(User user);

List<User> findAll();
@Query("select user from User user where user.id=?")
User findOne(int id);

User save(User user);
@Query("select user from User user where user.userName=? and user.password=?")
User validateuser(String userName, String password);

List<User> findByActive(Boolean active);
}
