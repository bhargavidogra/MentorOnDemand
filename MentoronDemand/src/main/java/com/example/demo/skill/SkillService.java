package com.example.demo.skill;

import java.util.List;

public interface SkillService {

	Skill create(Skill skill);
	
	Skill delete(long id);

	List<Skill> findAll();

	Skill findById(long id);

	Skill update(Skill skill);

	List<Skill> findSkillByMentorId(Integer mentorId);

}
