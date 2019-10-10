import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { Training } from '../models/training.model';
import { TrainingViewService } from './training.service';
import { Payment } from '../models/payment.model';
declare var $:any;
@Component({
  selector: 'app-trainings',
  templateUrl: './training.component.html',
  styleUrls: ['./training.component.css']
})
export class TrainingViewComponent implements OnInit {
  trainings: Training[];
  trainingId: number;
  showPayment: boolean;
     payment:Payment; 
  
  constructor(private router: Router, private trainingService: TrainingViewService) {

  }

  ngOnInit() {
    this.trainingService.getTraining()
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

  // viewPayment(id) {
  //   this.trainingService.viewpayment.subscribe(tId=> this.trainingId = tId

  //   )
  // }

  openModal(id){
    sessionStorage.setItem('tId', id);
    this.showPayment != this.showPayment;
    }


    getPaymentby(trainingsId) {
     
      this.trainingService.getPaymentby(trainingsId)
      .subscribe(data => {
        this.payment = data;
       // console.log(this.payment);
        sessionStorage.setItem('userPayments', JSON.stringify(this.payment))
        this.router.navigateByUrl('user-payment')
      });
    }
}
