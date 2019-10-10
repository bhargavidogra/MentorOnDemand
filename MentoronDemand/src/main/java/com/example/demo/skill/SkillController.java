package com.example.demo.skill;

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
import com.example.demo.payments.Payment;
import com.example.demo.user.trainings.TrainingDetails;
import com.example.demo.user.trainings.TrainingDetailsService;

@RestController
@CrossOrigin
@RequestMapping({"/skill"})
public class SkillController {

	@Autowired
	private SkillService skillService;
	@Autowired
	private MentorService mentorservice ; 
	@PostMapping
	public Skill create(@RequestBody Skill skill) {
Mentor tr=mentorservice.findById(skill.getMentorId());
		
		if(tr!=null)
		{
			tr.getSkills().add(skill);
			mentorservice.create(tr);
		
		} 
		return skill;
	//	return skillService.create(skill);
	}
	
	@GetMapping(path= {"/{id}"})
		public Skill findOne(@PathVariable("id")long id) {
			return skillService.findById(id);
		}
	 @GetMapping("/findSkillByMentorId/{mentorId}")
	    public List <Skill> findSkillByMentorId(@PathVariable(value = "mentorId")Integer mentorId) {
	        return skillService.findSkillByMentorId(mentorId);
	    }
	
	@PutMapping(path= {"/{id}"})
			public  Skill update(@PathVariable("id")long id,@RequestBody Skill skill) {
		       return skillService.update(skill);
	}
			
	 @DeleteMapping(path ={"/{id}"})
	    public Skill delete(@PathVariable("id") long id) {
	        return skillService.delete(id);
	    }
	 @GetMapping
	    public List<Skill> findAll(){
	        return skillService.findAll();
	    }
	
}
