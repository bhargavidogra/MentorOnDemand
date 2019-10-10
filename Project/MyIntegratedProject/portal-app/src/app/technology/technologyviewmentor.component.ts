import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { Technology } from '../models/technology.model';
import { TechnologyService } from './technology.service';

@Component({
  selector: 'app-technologyviewmentor',
  templateUrl: './technologyviewmentor.component.html',
  styles: []
})
export class TechnologyViewMentorComponent implements OnInit {

  technologies: Technology[];

  constructor(private router: Router, private technologyService: TechnologyService) {

  }

  ngOnInit() {
    this.technologyService.getTechnologyViewMentor()
      .subscribe( data => {
        this.technologies = data;
      });
  };

  deleteTechnology(technology: Technology): void {
    this.technologyService.deleteTechnology(technology)
      .subscribe( data => {
        this.technologies = this.technologies.filter(u => u !== technology);
      })
  };

}


