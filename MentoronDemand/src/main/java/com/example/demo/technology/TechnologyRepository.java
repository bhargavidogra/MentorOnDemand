package com.example.demo.technology;

import java.util.List;

import org.springframework.data.repository.Repository;
//data JPA repository
public interface TechnologyRepository extends Repository<Technology,Long> {
	
void delete(Technology td);

List<Technology> findAll();

Technology findOne(long id);

Technology save(Technology td);

List<Technology> findTechnologyByMentorId(Integer mentorId);

}
