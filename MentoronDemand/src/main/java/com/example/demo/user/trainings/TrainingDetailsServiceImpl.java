package com.example.demo.user.trainings;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrainingDetailsServiceImpl implements TrainingDetailsService {
	
	@Autowired
	private TrainingDetailsRepository repository;
	
	
	
	

	@Override
	public TrainingDetails create(TrainingDetails td) {
		// TODO Auto-generated method stub
		return repository.save(td);
	}

	@Override
	public TrainingDetails delete(int id) {
		// TODO Auto-generated method stub
		
		TrainingDetails user =findById(id);
		if(user!=null)
		{
			repository.delete(user);
		}
		return user;
	}

	@Override
	public List<TrainingDetails> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public TrainingDetails findById(int id) {
		// TODO Auto-generated method stub
		return repository.findOne(id);
	}

	@Override
	public TrainingDetails update(TrainingDetails td) {
		// TODO Auto-generated method stub
		return repository.save(td);
	}

	@Override
	public List<TrainingDetails> findTrainingByMentorId(Integer mentorId) {
		// TODO Auto-generated method stub
		return  repository.findTrainingByMentorId(mentorId);
	}

	@Override
	public List<TrainingDetails> findTrainingByUsersId(Integer usersId) {
		// TODO Auto-generated method stub
		return repository.findTrainingByUsersId(usersId);
	}

	@Override
	public TrainingDetails findByIdAndMentorId(Integer id, Integer mentorId) {
		// TODO Auto-generated method stub
		return repository.findByIdAndMentorId(id,mentorId);
	}

	@Override
	public TrainingDetails findByIdAndUsersId(Integer id, Integer usersId) {
		// TODO Auto-generated method stub
		return repository.findByIdAndUsersId(id,usersId);
	}

	@Override
	public List<TrainingDetails> findTrainingByStartDateBetween(Date startDate, Date endDate) {
		// TODO Auto-generated method stub
		return repository.findTrainingByStartDateBetween(startDate,endDate);
	}

	
	

	

	

}
