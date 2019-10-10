import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { Mentor } from '../models/mentor.model';
import { MentorloginService } from './mentor.service';
@Component({
  selector: 'app-mentor-login',
  templateUrl: './mentor-login.component.html',
  styleUrls: ['./mentor-login.component.css']
})
export class MentorLoginComponent implements OnInit {
  mentors: Mentor[];
  mentor: Mentor = new Mentor();

  constructor(private router: Router, private mentorService: MentorloginService) {

  }

  ngOnInit() {
    this.mentorService.getMentors()
      .subscribe( data => {
        this.mentors = data;
      });
  };

  deleteMentor(mentor: Mentor): void {
    this.mentorService.deleteMentor(mentor)
      .subscribe( data => {
        this.mentors = this.mentors.filter(u => u !== mentor);
      })
  };


  validate(userName, password): void{
    this.mentorService.validate(userName,password).subscribe(data =>{
      if(data==null){
        alert("Invalid Username or Password!");
      }
      else if(!data.active){
        alert("mentor is blocked!!");
      }
      else{
        console.log(data);
        sessionStorage.setItem('loggedinmentor',JSON.stringify(data));
        sessionStorage.setItem('mentorid',data.id)
        this.router.navigate(['mentor-dashboard']);
      }
    })
  };


}
