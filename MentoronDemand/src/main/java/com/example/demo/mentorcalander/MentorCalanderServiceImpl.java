package com.example.demo.mentorcalander;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MentorCalanderServiceImpl implements MentorCalanderService {
	
	@Autowired
	private MentorCalanderRepository repository;

	@Override
	public MentorCalander create(MentorCalander mentorCalander) {
		// TODO Auto-generated method stub
		return repository.save(mentorCalander);
	}

	@Override
	public MentorCalander delete(int id) {
		// TODO Auto-generated method stub
		
		MentorCalander mentorCalander =findById(id);
		if(mentorCalander!=null)
		{
			repository.delete(mentorCalander);
		}
		return mentorCalander;
	}

	@Override
	public List<MentorCalander> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public MentorCalander findById(int id) {
		// TODO Auto-generated method stub
		return repository.findOne(id);
	}

	@Override
	public MentorCalander update(MentorCalander mentorCalander) {
		// TODO Auto-generated method stub
		return repository.save(mentorCalander);
	}
	

	

}
