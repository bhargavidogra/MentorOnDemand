import {Injectable} from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import {Training }from '../models/training.model'

import { User } from '../models/user.model';


const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable()
export class UserdashboardService {

  constructor(private http:HttpClient) {}

  private userUrl = 'http://localhost:8888/user';
  private trainingUrl='http://localhost:8888/training'
  //private userUrl = '/api';

  public getUsers() {
    return this.http.get<User[]>(this.userUrl);
  }

  public deleteUser(user) {
    return this.http.delete(this.userUrl + "/"+ user.id);
  }

  public createUser(user) {
    return this.http.post<User>(this.userUrl, user);
  }

  public validate(userName, password){
    return this.http.get<User>(this.userUrl + "/"+userName + "/" + password);
  }

  public findtraining(startdate,enddate ){
    return this.http.get<Training>(this.trainingUrl +"/findTrainingByStartDateBetween/"+ "/"+startdate + "/" + enddate);
  }
}
