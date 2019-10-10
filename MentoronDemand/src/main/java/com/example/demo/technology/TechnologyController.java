package com.example.demo.technology;

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

import com.example.demo.mentor.Mentor;
import com.example.demo.mentor.MentorService;
import com.example.demo.skill.Skill;

@RestController
@CrossOrigin
@RequestMapping({"/technology"})
public class TechnologyController {

	@Autowired
	private TechnologyService trainingsService;
	@Autowired
	private MentorService mentorservice ; 
	@PostMapping
	public Technology create(@RequestBody Technology td) {
		
Mentor tr=mentorservice.findById(td.getMentorId());
		
		if(tr!=null)
		{
			tr.getTechnology().add(td);
			mentorservice.create(tr);
		
		} 
		return td;
		
		
		//return trainingsService.create(td);
	}
	
	@GetMapping(path= {"/{id}"})
		public Technology findOne(@PathVariable("id")long id) {
			return trainingsService.findById(id);
		}
	
	 @GetMapping("/findTechnologyByMentorId/{mentorId}")
	    public List <Technology> findTechnologyByMentorId(@PathVariable(value = "mentorId")Integer mentorId) {
	        return trainingsService.findTechnologyByMentorId(mentorId);
	    }
	 
	
	
	@PutMapping(path= {"/{id}"})
			public  Technology update(@PathVariable("id")long id,@RequestBody Technology td) {
		       return trainingsService.update(td);
	}
			
	 @DeleteMapping(path ={"/{id}"})
	    public Technology delete(@PathVariable("id") long id) {
	        return trainingsService.delete(id);
	    }
	 @GetMapping
	    public List<Technology> findAll(){
	        return trainingsService.findAll();
	    }
	
}
