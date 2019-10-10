import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { Technology } from '../models/technology.model';
import { TechnologyService } from './technology.service';

@Component({
  selector: 'app-technology',
  templateUrl: './technology.component.html',
  styles: []
})
export class TechnologyComponent implements OnInit {

  technologies: Technology[];

  constructor(private router: Router, private technologyService: TechnologyService) {

  }

  ngOnInit() {
    this.technologyService.getTechnology()
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


