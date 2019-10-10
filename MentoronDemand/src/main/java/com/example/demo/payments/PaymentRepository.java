package com.example.demo.payments;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import com.example.demo.user.trainings.TrainingDetails;
//data JPA repository
public interface PaymentRepository extends Repository<Payment,Long> {
	
void delete(Payment td);

List<Payment> findAll();

Payment findOne(long id);

Payment save(Payment td);
@Query("select payment from Payment payment where payment.mentorId=?")
List<Payment> findPaymentByMentorId(Integer mentorId);

List<Payment> findPaymentByUserId(Integer userId);
@Query("select payment from Payment payment where payment.trainingId=? and payment.userId=?")
Payment findPaymentByTrainingIdandUsersId(Integer trainingid, Integer usersId);

}
