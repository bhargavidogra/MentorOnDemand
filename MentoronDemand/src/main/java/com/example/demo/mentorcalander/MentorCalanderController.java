package com.example.demo.mentorcalander;

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

@RestController
@CrossOrigin
@RequestMapping({"/mentorcalander"})
public class MentorCalanderController {

	@Autowired
	private MentorCalanderService mentorCalanderService;
	
	@PostMapping
	public MentorCalander create(@RequestBody MentorCalander mentorCalander) {
		return mentorCalanderService.create(mentorCalander);
	}
	
	@GetMapping(path= {"/{mentorId}"})
		public MentorCalander findOne(@PathVariable("mentorId")int id) {
			return mentorCalanderService.findById(id);
		}
	
	@PutMapping(path= {"/{mentorId}"})
			public  MentorCalander update(@PathVariable("mentorId")int id,@RequestBody MentorCalander mentorCalander) {
		       return mentorCalanderService.update(mentorCalander);
	}
			
	 @DeleteMapping(path ={"/{mentorId}"})
	    public MentorCalander delete(@PathVariable("mentorId") int id) {
	        return mentorCalanderService.delete(id);
	    }
	 @GetMapping
	    public List<MentorCalander> findAll(){
	        return mentorCalanderService.findAll();
	    }
	
}
