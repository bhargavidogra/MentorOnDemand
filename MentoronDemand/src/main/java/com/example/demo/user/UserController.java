package com.example.demo.user;

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

import com.example.demo.user.trainings.TrainingDetails;
import com.example.demo.user.trainings.TrainingDetailsService;

@RestController
@CrossOrigin
@RequestMapping({"/user"})
public class UserController {

	@Autowired
	private UserService userService;
	@Autowired
	private TrainingDetailsService trainingsService; 
	
	@PostMapping
	public User create(@RequestBody User user) {
/*TrainingDetails tr=trainingsService.findById(user.getTrainingId());
		
		if(tr!=null)
		{
			tr.getUsers().add(user);
			trainingsService.create(tr);
		
		}
		return user;*/
return userService.create(user);
	}
	
	@GetMapping(path= {"{id}"})
		public User findOne(@PathVariable("id")int id) {
			return userService.findById(id);
		}
	
			
	 @DeleteMapping(path ={"/{id}"})
	    public User delete(@PathVariable("id") int id) {
	        return userService.delete(id);
	    }
	 @GetMapping
	    public List<User> findAll(){
	        return userService.findAll();
	    }
	 @GetMapping("/findOneuser/{id}")
		public User findOneuser(@PathVariable("id")int id) {
			return userService.findById(id);
		}
	
	 @GetMapping(path= {"/{userName}/{password}"})
		public User validateuser(@PathVariable("userName")String userName,@PathVariable("password")String password) {
			return userService.validateuser(userName,password);
		}
	 
	 
	 @PutMapping(path= {"/update/{id}"})
		public User update(@PathVariable("id")int id,@RequestBody User user) {
			
//			 user.setId(id);
		 TrainingDetails tr=trainingsService.findById(user.getTrainingId());
			
			if(tr!=null)
			{
				tr.getUsers().add(user);
				
				trainingsService.update(tr);
				
			
			}
			return user;
			
		        
		    }
	 
	 
	 @PutMapping(path= {"/updates/{id}"})
		public User updates(@PathVariable("id")int id,@RequestBody User user) {
			
//			
			return userService.update(user);
			
		        
		    }
	 
	 
	 @GetMapping(path = {"/active/{active}"})
		public List<User> findByActive(@PathVariable("active") Boolean active)
		{
			return userService.findByActive(active);
		}
	 
}
