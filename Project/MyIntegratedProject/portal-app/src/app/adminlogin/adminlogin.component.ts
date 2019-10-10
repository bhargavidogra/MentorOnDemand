import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
@Component({
  selector: 'app-adminlogin',
  templateUrl: './adminlogin.component.html',
  styleUrls: ['./adminlogin.component.css']
})
export class AdminloginComponent implements OnInit {

  
  constructor(private router: Router) { }

  ngOnInit() {
   
  }
  validate(userName, password): void{
    
      if(userName=="admin" || password=="admin123"){
        this.router.navigate(['admin-dashboard']);
        
      }
      else {
        alert("Invalid Username or Password!");
      }
  }

  }