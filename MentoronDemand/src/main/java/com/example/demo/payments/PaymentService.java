package com.example.demo.payments;

import java.util.List;

import com.example.demo.user.trainings.TrainingDetails;

public interface PaymentService {

	Payment create(Payment td);
	
	Payment delete(long id);

	List<Payment> findAll();

	Payment findById(long id);

	Payment update(Payment td);

	List<Payment> findPaymentByMentorId(Integer mentorId);

	List<Payment> findPaymentByUserId(Integer userId);

	Payment findPaymentByTrainingIdandUsersId(Integer trainingid, Integer usersId);

}
