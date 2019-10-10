package com.example.demo.user.trainings;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mentor.Mentor;
import com.example.demo.user.User;

@RestController
@CrossOrigin
@RequestMapping({"/training"})
public class TrainingDetailsController {

	@Autowired
	private TrainingDetailsServiceImpl trainingsService;
	
	@PostMapping
	public TrainingDetails create(@RequestBody TrainingDetails td) {
		return trainingsService.create(td);
	}
	
	@GetMapping(path= {"/{id}"})
		public TrainingDetails findOne(@PathVariable("id")int id) {
			return trainingsService.findById(id);
		}
	
	/*@PutMapping(path= {"/{id}"})
			public  TrainingDetails update(@PathVariable("id")int id,@RequestBody TrainingDetails td) {
		       return trainingsService.update(td);
	}*/
	
	 @PutMapping(path= {"/update/{id}"})
		public TrainingDetails update(@PathVariable("id")int id,@RequestBody TrainingDetails td) {
			
//			 user.setId(id);
		/* TrainingDetails tr=trainingsService.findById(mentor.getTrainingId());
			
			if(tr!=null)
			{
				tr.getUsers().add(user);
				
				trainingsService.update(tr);
				
			
			}  */
			return trainingsService.update(td);
			
		        
		    }
			
	 @DeleteMapping(path ={"/{id}"})
	    public TrainingDetails delete(@PathVariable("id") int id) {
	        return trainingsService.delete(id);
	    }
	 @GetMapping
	    public List<TrainingDetails> findAll(){
	        return trainingsService.findAll();
	    }
	 
	 @GetMapping("/findTrainingByMentorId/{mentorId}")
	    public List <TrainingDetails> getCoursesByMentor(@PathVariable(value = "mentorId")Integer mentorId) {
	        return trainingsService.findTrainingByMentorId(mentorId);
	    }
	 
	 @GetMapping("/findTrainingByUsersId/{usersId}")
	    public List <TrainingDetails> getCoursesByUsers(@PathVariable(value = "usersId")Integer usersId) {
	        return trainingsService.findTrainingByUsersId(usersId);
	    }
	 
	 
	 @GetMapping("/findByIdAndMentorId/{trainingId}/{mentorId}")
	    public TrainingDetails findByIdAndMentorId(@PathVariable(value = "trainingId")Integer trainingId,@PathVariable(value = "mentorId")Integer mentorId) {
		 System.out.println(trainingsService.findByIdAndMentorId(trainingId,mentorId));
		 
	        return trainingsService.findByIdAndMentorId(trainingId,mentorId);
	    }
	 
	 @GetMapping("/findByIdAndUsersId/{trainingId}/{usersId}")
	    public TrainingDetails findByIdAndUsersId(@PathVariable(value = "trainingId")Integer trainingId,@PathVariable(value = "usersId")Integer usersId) {
		 System.out.println(trainingsService.findByIdAndUsersId(trainingId,usersId));
		 
	        return trainingsService.findByIdAndUsersId(trainingId,usersId);
	    }
	 
	 
	 
	 
	 @GetMapping("/findTrainingByStartDateBetween/{startDate}/{endDate}")
	    public List<TrainingDetails> findTrainingByStartDateBetween(@PathVariable (value = "startDate") @DateTimeFormat(pattern="yyyy-MM-dd")Date startDate,@PathVariable(value = "endDate") @DateTimeFormat(pattern="yyyy-MM-dd")Date endDate) {

		 
		 //@DateTimeFormat(Pattern="YYYY-MM-DD")Date toDate
	    /*	SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
	    	Date dateStartDate1;
			try {
				dateStartDate1 = simpleDateFormat.parse(startDate);
			} catch (ParseException e) {
				dateStartDate1=new Date();
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	Date dateStartDate2;
			try {
				dateStartDate2 = simpleDateFormat.parse(endDate);
			} catch (ParseException e) {
				dateStartDate2=new Date();
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  */
			return trainingsService.findTrainingByStartDateBetween(startDate, endDate);
	    }
	    }
	 
	 
	

