import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { Payment} from '../models/payment.model';
import { PaymentViewService } from './payment.service';

@Component({
  selector: 'app-payment',
  templateUrl: './payment.component.html',
  styleUrls: ['./payment.component.css']
})
export class PaymentViewComponent implements OnInit {
  payments: Payment[];

  constructor(private router: Router, private paymentService: PaymentViewService) {

  }

  ngOnInit() {
    this.paymentService.getPayment()
      .subscribe( data => {
        this.payments = data;
      });
  };

  deletePayment(payment: Payment): void {
    this.paymentService.deletePayment(payment)
      .subscribe( data => {
        this.payments = this.payments.filter(u => u !== payment);
      })
  };


}