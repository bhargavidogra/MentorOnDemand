import { Component } from '@angular/core';
import { Router } from '@angular/router';

import { Technology } from '../models/technology.model';
import { TechnologyService } from './technology.service';

@Component({
  templateUrl: './add-technology.component.html',
  styleUrls: ['./add-technology.component.css']
})
export class AddTechnologyComponent {
  mentorid=sessionStorage.getItem('mentorid')
  technologies: Technology = new Technology();

  constructor(private router: Router, private technologyService: TechnologyService) {

  }

  createTechnology(): void {
    this.technologies.mentorId=this.mentorid;
    this.technologyService.createTechnology(this.technologies)
        .subscribe( data => {
          alert("Technology created successfully.");
        });

  };

}
