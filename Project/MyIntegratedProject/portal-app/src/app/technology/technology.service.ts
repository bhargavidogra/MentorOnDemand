import {Injectable} from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { Technology} from '../models/technology.model';


const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable()
export class TechnologyService {
  mentorid=sessionStorage.getItem('mentorid')
  constructor(private http:HttpClient) {}

  private technologyUrl = 'http://localhost:8888/technology';
  //private userUrl = '/api';

  public getTechnology() {
    return this.http.get<Technology[]>(this.technologyUrl);
  }
  public getTechnologyViewMentor() {
    this.mentorid=sessionStorage.getItem('mentorid')
    return this.http.get<Technology[]>(this.technologyUrl+"/findTechnologyByMentorId/"+this.mentorid);
  }

  public deleteTechnology(technology) {
    return this.http.delete(this.technologyUrl + "/"+ technology.id);
  }

  public createTechnology(technology) {
    return this.http.post<Technology>(this.technologyUrl, technology);
  }

}
