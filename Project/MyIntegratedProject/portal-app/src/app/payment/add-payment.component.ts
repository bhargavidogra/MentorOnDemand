import { Component } from '@angular/core';
import { Router } from '@angular/router';

import { Payment } from '../models/payment.model';
import { PaymentService } from '../payment/payment.service';

@Component({
  templateUrl: './add-payment.component.html',
  styleUrls: ['./add-payment.component.css']
})
export class AddPaymentComponent {
  userid=sessionStorage.getItem('userid')
  payment: Payment = new Payment();

  constructor(private router: Router, private paymentService: PaymentService) {

  }

  createPayment(): void {
this.payment.userId=this.userid;
    this.paymentService.createPayment(this.payment)
        .subscribe( data => {
          
          alert("Payment Module added successfully.");
        });

  };

}