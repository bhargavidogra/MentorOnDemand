import {Injectable} from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { Payment } from '../models/payment.model';


const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable()
export class PaymentViewService {
  mentorid=sessionStorage.getItem("mentorid")
  userid=sessionStorage.getItem("userid")

  constructor(private http:HttpClient) {}

  private paymentUrl = 'http://localhost:8888/payment';
  //private userUrl = '/api';

  public getPayment() {
    this.mentorid=sessionStorage.getItem("mentorid")
    return this.http.get<Payment[]>(this.paymentUrl+"/findPaymentByMentorId/"+this.mentorid);
  }
  public getPaymentuser() {
    this.userid=sessionStorage.getItem("userid")
    return this.http.get<Payment[]>(this.paymentUrl+"/findPaymentByUserId/"+this.userid);
  }
  public deletePayment(payment) {
    return this.http.delete(this.paymentUrl + "/"+ payment.id);
  }

  public createPayment(payment) {
    return this.http.post<Payment>(this.paymentUrl, payment);
  }

}
