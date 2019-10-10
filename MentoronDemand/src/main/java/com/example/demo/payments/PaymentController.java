package com.example.demo.payments;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.user.User;
import com.example.demo.user.UserService;
import com.example.demo.user.trainings.TrainingDetails;
import com.example.demo.user.trainings.TrainingDetailsService;

@RestController
@CrossOrigin
@RequestMapping({"/payment"})
public class PaymentController {

	@Autowired
	private PaymentService paymentService;
	@Autowired
	private TrainingDetailsService trainingsService; 
	@Autowired
	private UserService userservice; 
	@PostMapping
	public Payment create(@RequestBody Payment td) {
		
		TrainingDetails tr=trainingsService.findById(td.getTrainingId());
		User ur=userservice.findById(td.getUserId());
		if(tr!=null)
		{
			tr.getPayment().add(td);
			ur.getPayment().add(td);
			paymentService.create(td);
//			userService.cre
		
		}
		return td;
		/*return paymentService.create(td);*/
	}
	
	@GetMapping(path= {"/{id}"})
		public Payment findOne(@PathVariable("id")long id) {
			return paymentService.findById(id);
		}
	
	@PutMapping(path= {"/{id}"})
			public  Payment update(@PathVariable("id")long id,@RequestBody Payment td) {
		       return paymentService.update(td);
	}
	
	 @GetMapping("/findPaymentByMentorId/{mentorId}")
	    public List <Payment> getPaymentByMentor(@PathVariable(value = "mentorId")Integer mentorId) {
	        return paymentService.findPaymentByMentorId(mentorId);
	    }
	  
	  @GetMapping("/findPaymentByTrainingIdandUsersId/{trainingId}/{userId}")
	  public Payment findPaymentByTrainingIdandUsersId(@PathVariable(value = "trainingId") Integer trainingid,@PathVariable(value = "userId")Integer usersId){
	    	System.out.println(paymentService.findPaymentByTrainingIdandUsersId(trainingid, usersId));
	    	return paymentService.findPaymentByTrainingIdandUsersId(trainingid,usersId);}
	 
	 @GetMapping("/findPaymentByUserId/{userId}")
	    public List <Payment> findPaymentByUserId(@PathVariable(value = "userId")Integer userId) {
	        return paymentService.findPaymentByUserId(userId);
	    }
	 
			
	 @DeleteMapping(path ={"/{id}"})
	    public Payment delete(@PathVariable("id") long id) {
	        return paymentService.delete(id);
	    }
	 @GetMapping
	    public List<Payment> findAll(){
	        return paymentService.findAll();
	    }
	
}
