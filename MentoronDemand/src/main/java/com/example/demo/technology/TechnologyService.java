package com.example.demo.technology;

import java.util.List;

public interface TechnologyService {

	Technology create(Technology td);
	
	Technology delete(long id);

	List<Technology> findAll();

	Technology findById(long id);

	Technology update(Technology td);

	List<Technology> findTechnologyByMentorId(Integer mentorId);

}
