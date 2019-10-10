import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { Training } from '../models/training.model';
import { TrainingViewService } from './training.service';
import { User } from '../models/user.model';
import { UserloginService } from '../user-login/user.service';
import { MentorloginService } from '../mentor-login/mentor.service';
declare var $: any;
@Component({
  selector: 'app-rainingstartenddayComponent',
  templateUrl: './trainingmentorenroll.component.html',
  styleUrls: ['./training.component.css']
})
export class TrainingMentorEnrollComponent implements OnInit {
  trainings: Training[];
  trainingId: number;
  showPayment: boolean;
  menid=sessionStorage.getItem('mentorid')

  constructor(private router: Router, private trainingService: TrainingViewService,private mentorloginService:MentorloginService) {

  }

  ngOnInit() {
    this.trainingService.getTrainings()
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
    
    var loggedInMentor = JSON.parse(sessionStorage.getItem('loggedinmentor'));
    if (loggedInMentor == null) {
      alert("please log In")
      this.router.navigateByUrl('/mentor-login')

    }
    else {
      this.menid=sessionStorage.getItem('mentorid')
      if(tr.mentor==null){
      tr.mentor=loggedInMentor;
      this.trainingService.enrollMentor(tr)
        .subscribe(data => {
        //  this.trainings = data;
          console.log(data);
        

        })
        alert("You are Enrolled as mentor for the course!")
      }
      else{
        alert("Mentor already alloted for the course!")
      }
    }
  };



  


}
