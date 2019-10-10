package com.example.demo.mentor;

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

@RestController
@CrossOrigin
@RequestMapping({"/mentor"})
public class MentorController {

	@Autowired
	private MentorService mentorService;
	
	@PostMapping
	public Mentor create(@RequestBody Mentor mentor) {
		return mentorService.create(mentor);
	}
	
	@GetMapping(path= {"/{mentorid}"})
		public Mentor findOne(@PathVariable("mentorid")int id) {
			return mentorService.findById(id);
		}
	
	
	
	 @GetMapping("/findOnementor/{mentorid}")
		public Mentor findOnementor(@PathVariable("mentorid")int id) {
			return mentorService.findById(id);
		}
			
	 @DeleteMapping(path ={"/{mentorid}"})
	    public Mentor delete(@PathVariable("mentorid") int id) {
	        return mentorService.delete(id);
	    }
	 @GetMapping
	    public List<Mentor> findAll(){
	        return mentorService.findAll();
	    }
	 
	 @GetMapping(path= {"/{userName}/{password}"})
		public Mentor validateuser(@PathVariable("userName")String userName,@PathVariable("password")String password) {
			return mentorService.validateuser(userName,password);
		}
	 
	 @PutMapping(path= {"/update/{id}"})
		public Mentor update(@PathVariable("id")int id,@RequestBody Mentor mentor) {
			
//			 user.setId(id);
		 
		 
		        return mentorService.update(mentor);
		    }
	 @GetMapping(path = {"/active/{active}"})
		public List<Mentor> findByActive(@PathVariable("active") Boolean active)
		{
			return mentorService.findByActive(active);
		}
	 
	
}
