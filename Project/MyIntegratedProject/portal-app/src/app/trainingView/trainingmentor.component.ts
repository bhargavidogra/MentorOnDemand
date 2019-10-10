import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { Training } from '../models/training.model';
import { TrainingViewService } from './training.service';

@Component({
  selector: 'app-trainingmentor',
  templateUrl: './trainingmentor.component.html',
  styleUrls: ['./training.component.css']
})
export class TrainingMentorComponent implements OnInit {
  trainings: Training[];

  constructor(private router: Router, private trainingService: TrainingViewService) {

  }

  ngOnInit() {
    this.trainingService.getTrainingmentor()
      .subscribe( data => {
        this.trainings = data;
      });
  };

  deleteTraining(training: Training): void {
    this.trainingService.deleteTraining(training)
      .subscribe( data => {
        this.trainings = this.trainings.filter(u => u !== training);
      })
  };


}
