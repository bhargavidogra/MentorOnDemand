import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { Skill } from '../models/skill.model';
import { SkillService } from './skill.service';

@Component({
  selector: 'app-skillmentorview',
  templateUrl: './skillmentorview.component.html',
  styles: []
})
export class SkillmentorviewComponent implements OnInit {

  skills: Skill[];

  constructor(private router: Router, private skillService: SkillService) {

  }

  ngOnInit() {
    this.skillService.getSkillMentorview()
      .subscribe( data => {
        this.skills = data;
      });
  };

  deleteSkill(skill: Skill): void {
    this.skillService.deleteSkill(skill)
      .subscribe( data => {
        this.skills = this.skills.filter(u => u !== skill);
      })
  };

}


