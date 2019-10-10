import { Component } from '@angular/core';
import { Router } from '@angular/router';

import { Mentor } from '../models/mentor.model';
import { MentorService } from './mentor.service';

@Component({
  templateUrl: './add-mentor.component.html',
  styleUrls: ['./add-mentor.component.css']
})
export class AddMentorComponent {

  mentor: Mentor = new Mentor();

  constructor(private router: Router, private mentorService: MentorService) {

  }

  createUser(): void {
    this.mentorService.createMentor(this.mentor)
        .subscribe( data => {
          alert("Mentor created successfully.");
        });

  };

}
