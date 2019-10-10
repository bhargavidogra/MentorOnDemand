import { Component, OnInit } from '@angular/core';
import { Training } from '../models/training.model';
import { UserpaymentService } from './user.service';
import { User } from '../models/user.model';
import { Payment } from '../models/payment.model';

@Component({
  selector: 'app-user-payment',
  templateUrl: './user-payment.component.html',
  styleUrls: ['./user-payment.component.css'],
  providers: [UserpaymentService]
})
export class UserPaymentComponent implements OnInit {


  trainingId: string;
  training:Training;
  user:User;
  userId:string;
  userpayment:Payment;
  constructor(private userpaymentService:UserpaymentService) { }

  ngOnInit() {
   /* this.trainingId = sessionStorage.getItem('id');
    this.userpaymentService.findtraining(this.trainingId).subscribe(training => {
      this.training = training;
      console.log(this.training); */
     /* this.userId = sessionStorage.getItem('userid');
      this.userpaymentService.findUser(this.userId).subscribe(user => {
        this.user = user;
        console.log(this.user); */

        this.userpayment = JSON.parse(sessionStorage.getItem('userPayments'));
   // alert(this.userpayment);
      
    
  }



}
