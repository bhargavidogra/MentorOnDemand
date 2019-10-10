import {Injectable} from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { Skill } from '../models/skill.model';


const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable()
export class SkillService {
  mentorid=sessionStorage.getItem('mentorid')

  constructor(private http:HttpClient) {}

  private skillUrl = 'http://localhost:8888/skill';
  //private userUrl = '/api';

  public getSkill() {
    return this.http.get<Skill[]>(this.skillUrl);
  }

  public getSkillMentorview() {
    this.mentorid=sessionStorage.getItem('mentorid')
    
    return this.http.get<Skill[]>(this.skillUrl+ "/findSkillByMentorId/"+ this.mentorid);
  }

  public deleteSkill(skill) {
    return this.http.delete(this.skillUrl + "/"+ skill.id);
  }

  public createSkill(skill) {
    return this.http.post<Skill>(this.skillUrl,skill);
  }

}
