import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { Payment} from '../models/payment.model';
import { PaymentViewService } from './payment.service';

@Component({
  selector: 'app-paymentuser',
  templateUrl: './paymentuser.component.html',
  styleUrls: ['./payment.component.css']
})
export class PaymentuserViewComponent implements OnInit {
  payments: Payment[];

  constructor(private router: Router, private paymentService: PaymentViewService) {

  }

  ngOnInit() {
    this.paymentService.getPaymentuser()
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
