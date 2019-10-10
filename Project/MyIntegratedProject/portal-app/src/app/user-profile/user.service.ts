import {Injectable} from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { User } from '../models/user.model';


const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable()
export class UserprofileService {
  id=sessionStorage.getItem('userid')

  constructor(private http:HttpClient) {}

  private userUrl = 'http://localhost:8888/user';
  //private userUrl = '/api';

  public getUsers() {
    this.id=sessionStorage.getItem('userid')
    return this.http.get<User[]>(this.userUrl+"/findOne/"+this.id);
  }
  public getUser() {
    this.id=sessionStorage.getItem('userid')
    return this.http.get<User>(this.userUrl+"/findOneuser/"+this.id);
  }

  public deleteUser(user) {
    return this.http.delete(this.userUrl + "/"+ user.id);
  }

  public createUser(user) {
    return this.http.post<User>(this.userUrl, user);
  }

}
