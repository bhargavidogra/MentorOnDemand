import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { User } from '../models/user.model';
import { UserprofileService } from './user.service';
@Component({
  selector: 'app-user-profile',
  templateUrl: './user-profile.component.html',
  styleUrls: ['./user-profile.component.css'],
  providers: [UserprofileService]
})
export class UserProfileComponent implements OnInit {
  users: User[];
  user:User=new User();

  constructor(private router: Router, private userService: UserprofileService) {

  }

  ngOnInit() {
    this.userService.getUser()
      .subscribe( data => {
        this.user = data;
        console.log(data, this.user );
        
      },
      
      error => {
        console.log("swcfo;who;cfwehro;iu" + error );
        
      });
  };

  deleteUser(user: User): void {
    this.userService.deleteUser(user)
      .subscribe( data => {
        this.users = this.users.filter(u => u !== user);
      })
  };

}
