package com.example.demo.user.trainings;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
//data JPA repository
public interface TrainingDetailsRepository extends Repository<TrainingDetails,Integer> {
	
	
void delete(TrainingDetails td);

List<TrainingDetails> findAll();

TrainingDetails findOne(int id);

TrainingDetails save(TrainingDetails td);

//here if method name given as: List<TrainingDetails> findTrainingDetailsByMentorId(Integer mentorId); 
@Query("select trainingDetails from TrainingDetails trainingDetails where trainingDetails.mentor.mentorid=?")
List<TrainingDetails> findTrainingByMentorId(Integer mentorId);

List<TrainingDetails> findTrainingByUsersId(Integer usersId);

@Query("select trainingDetails from TrainingDetails trainingDetails where trainingDetails.id=? and trainingDetails.mentor.mentorid=?")
 TrainingDetails findByIdAndMentorId(Integer trainingId,Integer mentorId);
//here if naming done by convention no need to give the HQL query
TrainingDetails findByIdAndUsersId(Integer trainingId,Integer usersId);


List<TrainingDetails> findTrainingByStartDateBetween(Date startDate, Date endDate);


}
