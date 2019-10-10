import {Injectable} from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { Mentor } from '../models/mentor.model';
import { Training } from '../models/training.model';


const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable()
export class MentorloginService {

  constructor(private http:HttpClient) {}

  private mentorUrl = 'http://localhost:8888/mentor';
  //private userUrl = '/api';
  private trainingUrl = 'http://localhost:8888/training';

  public getMentors() {
    return this.http.get<Mentor[]>(this.mentorUrl);
  }

  public deleteMentor(mentor) {
    return this.http.delete(this.mentorUrl + "/"+ mentor.id);
  }

  public createMentor(mentor) {
    return this.http.post<Mentor>(this.mentorUrl, mentor);
  }

  public validate(userName, password){
    return this.http.get<Mentor>(this.mentorUrl + "/"+userName + "/" + password);
  }

  public enrollMentor(training){
    return this.http.put<Training>(this.trainingUrl, training);
  }

}
