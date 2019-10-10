package com.example.demo.technology;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TechnologyServiceImpl implements TechnologyService {
	
	@Autowired
	private TechnologyRepository repository;

	@Override
	public Technology create(Technology td) {
		// TODO Auto-generated method stub
		return repository.save(td);
	}

	@Override
	public Technology delete(long id) {
		// TODO Auto-generated method stub
		
		Technology user =findById(id);
		if(user!=null)
		{
			repository.delete(user);
		}
		return user;
	}

	@Override
	public List<Technology> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Technology findById(long id) {
		// TODO Auto-generated method stub
		return repository.findOne(id);
	}

	@Override
	public Technology update(Technology td) {
		return repository.save(td);
	}

	@Override
	public List<Technology> findTechnologyByMentorId(Integer mentorId) {
		// TODO Auto-generated method stub
		return repository.findTechnologyByMentorId(mentorId);
	}
	

	

}
