import { Component } from '@angular/core';
import { Router } from '@angular/router';

import { Skill } from '../models/skill.model';
import { SkillService } from './skill.service';

@Component({
  templateUrl: './add-skill.component.html',
  styleUrls: ['./add-skill.component.css']
})
export class AddSkillComponent {
  mentorid=sessionStorage.getItem('mentorid')
  skill: Skill = new Skill();

  constructor(private router: Router, private skillService: SkillService) {

  }

  createSkill(): void {
    this.skill.mentorId=this.mentorid;
    this.skillService.createSkill(this.skill)
        .subscribe( data => {
          alert("Skill created successfully.");
        });

  };

}
