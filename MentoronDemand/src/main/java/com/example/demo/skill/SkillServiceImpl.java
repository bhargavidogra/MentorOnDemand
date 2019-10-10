package com.example.demo.skill;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillServiceImpl implements SkillService {
	
	@Autowired
	private SkillRepository repository;

	@Override
	public Skill create(Skill skill) {
		// TODO Auto-generated method stub
		return repository.save(skill);
	}

	@Override
	public Skill delete(long id) {
		// TODO Auto-generated method stub
		
		Skill skill =findById(id);
		if(skill!=null)
		{
			repository.delete(skill);
		}
		return skill;
	}

	@Override
	public List<Skill> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Skill findById(long id) {
		// TODO Auto-generated method stub
		return repository.findOne(id);
	}

	@Override
	public Skill update(Skill skill) {
		// TODO Auto-generated method stub
		return repository.save(skill);
	}

	@Override
	public List<Skill> findSkillByMentorId(Integer mentorId) {
		// TODO Auto-generated method stub
		return  repository.findSkillByMentorId(mentorId);
	}
	

	

}
