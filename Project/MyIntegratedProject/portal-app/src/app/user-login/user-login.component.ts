import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { User } from '../models/user.model';
import {Training }from '../models/training.model'
import { UserloginService } from './user.service';
import {TrainingService} from '../training/training.service';
@Component({
  selector: 'app-user-login',
  templateUrl: './user-login.component.html',
  styleUrls: ['./user-login.component.css']
})
export class UserLoginComponent implements OnInit {

  users: User[];
  user: User = new User();
  training:Training[];
  constructor(private router: Router, private userService: UserloginService) {

  }

  ngOnInit() {
    this.userService.getUsers()
      .subscribe( data => {
        this.users = data;
      });
  };

  deleteUser(user: User): void {
    this.userService.deleteUser(user)
      .subscribe( data => {
        this.users = this.users.filter(u => u !== user);
      })
  };

  



  validate(userName, password): void{
    this.userService.validate(userName,password).subscribe(data =>{
      if(data==null){
        alert("Invalid Username or Password!");
      }
      else if(!data.active){
        alert("user is blocked!!");
      }
      else{
        sessionStorage.setItem('loggedinuser',JSON.stringify(data));
        sessionStorage.setItem('userid',data.id);
        this.router.navigate(['user-dashboard']);
      }
    })
  };

  findtraining(startdate, enddate): void{
    this.userService.findtraining(startdate,enddate).subscribe(data =>{
      if(data==null){
        alert("Invalid !");
      }
      else{
        sessionStorage.setItem('sd',startdate);
        sessionStorage.setItem('ed',enddate);
        this.router.navigate(['trainingstartenddate']);
      }
    })
  };
}
