package com.example.demo.skill;

import java.util.List;

import org.springframework.data.repository.Repository;
//data JPA repository
public interface SkillRepository extends Repository<Skill,Long> {
	
void delete(Skill skill);

List<Skill> findAll();

Skill findOne(long id);

Skill save(Skill skill);

List<Skill> findSkillByMentorId(Integer mentorId);

}
