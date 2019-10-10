import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { Training } from '../models/training.model';
import { TrainingViewService } from './training.service';
import { User } from '../models/user.model';
import { UserloginService } from '../user-login/user.service';
declare var $: any;
@Component({
  selector: 'app-rainingstartenddayComponent',
  templateUrl: './trainingstartenddate.component.html',
  styleUrls: ['./training.component.css']
})
export class TrainingstartenddayComponent implements OnInit {
  trainings: Training[];
  trainingId: number;
  showPayment: boolean;
  

  constructor(private router: Router, private trainingService: TrainingViewService,private userloginService:UserloginService) {

  }

  ngOnInit() {
    this.trainingService.getTrainingstartenddate()
      .subscribe(data => {
        this.trainings = data;
      });
  };

  deleteTraining(training: Training): void {
    this.trainingService.deleteTraining(training)
      .subscribe(data => {
        this.trainings = this.trainings.filter(u => u !== training);
      })
  };

  // viewPayment(id) {
  //   this.trainingService.viewpayment.subscribe(tId=> this.trainingId = tId

  //   )
  // }
  settraining(tr): void {
    var loggedInUser = JSON.parse(sessionStorage.getItem('loggedinuser'));
    if (loggedInUser == null) {
      alert("please log In")
      this.router.navigateByUrl('/user-login')

    }
    else {
      loggedInUser.trainingId=tr.id;
      this.userloginService.enrollUser(loggedInUser)
        .subscribe(data => {
          console.log(data);
          

        })
        alert("You are Enrolled for the course!")
    }
  };



  


}
