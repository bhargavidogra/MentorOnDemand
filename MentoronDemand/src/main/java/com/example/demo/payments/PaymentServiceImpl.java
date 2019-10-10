package com.example.demo.payments;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.user.trainings.TrainingDetails;

@Service
public class PaymentServiceImpl implements PaymentService {
	
	@Autowired
	private PaymentRepository repository;

	@Override
	public Payment create(Payment td) {
		// TODO Auto-generated method stub
		return repository.save(td);
	}

	@Override
	public Payment delete(long id) {
		// TODO Auto-generated method stub
		
		Payment user =findById(id);
		if(user!=null)
		{
			repository.delete(user);
		}
		return user;
	}

	@Override
	public List<Payment> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Payment findById(long id) {
		// TODO Auto-generated method stub
		return repository.findOne(id);
	}

	@Override
	public Payment update(Payment td) {
		// TODO Auto-generated method stub
		return repository.save(td);
	}

	@Override
	public List<Payment> findPaymentByMentorId(Integer mentorId) {
		// TODO Auto-generated method stub
		return repository.findPaymentByMentorId(mentorId);
	}

	@Override
	public List<Payment> findPaymentByUserId(Integer userId) {
		// TODO Auto-generated method stub
		return repository.findPaymentByUserId(userId);
	}

	@Override
	public Payment findPaymentByTrainingIdandUsersId(Integer trainingid, Integer usersId) {
		// TODO Auto-generated method stub
		return repository.findPaymentByTrainingIdandUsersId(trainingid,usersId);
	}
	

	

}
