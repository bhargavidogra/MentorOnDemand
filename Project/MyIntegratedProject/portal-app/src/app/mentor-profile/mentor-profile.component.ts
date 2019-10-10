import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { Mentor } from '../models/mentor.model';
import { MentorprofileService } from './mentor.service';
@Component({
  selector: 'app-mentor-profile',
  templateUrl: './mentor-profile.component.html',
  styleUrls: ['./mentor-profile.component.css']
})
export class MentorProfileComponent implements OnInit {

  mentors: Mentor[];
 mentor : Mentor = new Mentor();

  constructor(private router: Router, private mentorService: MentorprofileService) {

  }

  ngOnInit() {
    this.mentorService.getMentor()
      .subscribe( data => {
        this.mentor = data;
      });
  };

  deleteMentor(mentor: Mentor): void {
    this.mentorService.deleteMentor(mentor)
      .subscribe( data => {
        this.mentors = this.mentors.filter(u => u !== mentor);
      })
  };


}
