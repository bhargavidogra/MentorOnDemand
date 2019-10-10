package com.example.demo.user.trainings;


import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public interface TrainingDetailsService {

	TrainingDetails create(TrainingDetails td);
	
	TrainingDetails delete(int trainingId);

	List<TrainingDetails> findAll();

	TrainingDetails findById(int trainingId);

	TrainingDetails update(TrainingDetails td);

	List<TrainingDetails> findTrainingByMentorId(Integer mentorId);
	List<TrainingDetails> findTrainingByUsersId(Integer usersId);
     TrainingDetails findByIdAndMentorId(Integer trainingId,Integer mentorId);
	TrainingDetails findByIdAndUsersId(Integer trainingId,Integer usersId);


	List<TrainingDetails> findTrainingByStartDateBetween(Date startDate, Date endDate);
	

	

	
	

}
