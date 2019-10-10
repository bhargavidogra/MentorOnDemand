import {Injectable} from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Training } from '../models/training.model';
import { Router } from '@angular/router';
import { BehaviorSubject } from 'rxjs';
import { Payment } from '../models/payment.model';

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable()
export class TrainingViewService {

  id=sessionStorage.getItem('userid')
  mentorid=sessionStorage.getItem("mentorid")
  start=sessionStorage.getItem("sd")
  end=sessionStorage.getItem("ed")

  private trainingId = new BehaviorSubject(0);
  tId = this.trainingId.asObservable();

  constructor(private http:HttpClient, private router: Router) {}
  private trainingUrl = 'http://localhost:8888/training';
  private paymentUrl = 'http://localhost:8888/payment';
  //private userUrl = '/api';

  public getTraining() {
    this.id=sessionStorage.getItem('userid')

    return this.http.get<Training[]>(this.trainingUrl+"/findTrainingByUsersId/"+this.id);
  }
  public getTrainings() {
    return this.http.get<Training[]>(this.trainingUrl);
  }
  public getTrainingmentor() {
   
    this.mentorid=sessionStorage.getItem("mentorid")
    return this.http.get<Training[]>(this.trainingUrl+"/findTrainingByMentorId/"+this.mentorid);
  }

  public getTrainingstartenddate() {
    this.start=sessionStorage.getItem("sd")
    this.end=sessionStorage.getItem("ed")
    return this.http.get<Training[]>(this.trainingUrl+"/findTrainingByStartDateBetween/" +this.start+"/"+this.end);
  }

  public deleteTraining(training) {
    return this.http.delete(this.trainingUrl + "/"+ training.id);
  }

  public createTraining(training) {
    return this.http.post<Training>(this.trainingUrl, training);
  }
  public viewpayment(id)
  {
    this.trainingId.next(id);
  }
  public enrollUser(training){
    return this.http.put<Training>(this.trainingUrl, training);
  }
  public enrollMentor(training)
  {
    let id = training.id;
    return this.http.put<Training>(this.trainingUrl +"/update/"+id, training);
  }


  public getPaymentby(trainingId) {
    let id = sessionStorage.getItem('userid');
     // alert(trainingId+""+id);
      
        return this.http.get<Payment>(this.paymentUrl+"/findPaymentByTrainingIdandUsersId/"+trainingId+"/"+id);
      }
}
