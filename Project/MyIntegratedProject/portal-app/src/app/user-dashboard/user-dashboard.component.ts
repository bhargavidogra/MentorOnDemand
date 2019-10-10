import { Component, OnInit } from '@angular/core';
import { UserdashboardService } from './user.service'
import { User } from '../models/user.model';
import { Router } from '@angular/router';

@Component({
  selector: 'app-user-dashboard',
  templateUrl: './user-dashboard.component.html',
  styleUrls: ['./user-dashboard.component.css']
})
export class UserDashboardComponent implements OnInit {
  users: User[];
  user: User = new User();
 
  constructor(private router: Router, private userService: UserdashboardService) {

  }

  ngOnInit() {
  }

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
