import { BrowserModule } from '@angular/platform-browser';
import { NgModule , CUSTOM_ELEMENTS_SCHEMA} from '@angular/core';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { UserComponent } from './user/user.component';
import { AppRoutingModule } from './app.routing.module';
import {UserService} from './user/user.service';
import {HttpClientModule} from "@angular/common/http";
import {AddUserComponent} from './user/add-user.component';
import {HomeComponent} from './home/home.component';
import {AdminloginComponent} from './adminlogin/adminlogin.component';
import {AdminDashboardComponent} from './admin-dashboard/admin-dashboard.component';
import {FormComponent} from './form/form.component';
import {UserPaymentComponent} from './user-payment/user-payment.component';
import {MentorLoginComponent} from './mentor-login/mentor-login.component';
import {MentorDashboardComponent} from './mentor-dashboard/mentor-dashboard.component';

import {MentorSignUpFormComponent} from './mentor-sign-up-form/mentor-sign-up-form.component';
import {AboutMentorComponent} from './about-mentor/about-mentor.component';

import {UserProfileComponent} from './user-profile/user-profile.component';
import {TrainingCoursesAvailableComponent} from './training-courses-available/training-courses-available.component';
import {TrainingCoursesCompletedComponent} from './training-courses-completed/training-courses-completed.component';
import {TrainingCoursesInProgressComponent} from './training-courses-in-progress/training-courses-in-progress.component';



import {UserDashboardComponent} from './user-dashboard/user-dashboard.component';
import {SpecializationEditComponent} from './specialization-edit/specialization-edit.component';
import {UserLoginComponent} from './user-login/user-login.component';
import {MentorProfileComponent} from './mentor-profile/mentor-profile.component';
import {PaymentDetailsMentorComponent} from './payment-details-mentor/payment-details-mentor.component';
import {TrainingsMentorDeliverComponent} from './trainings-mentor-deliver/trainings-mentor-deliver.component';
import {AdminProfileComponent} from './admin-profile/admin-profile.component';
import {AddBlockUserComponent} from './add-block-user/add-block-user.component';
import {AddBlockMentorComponent} from './add-block-mentor/add-block-mentor.component';
import {AddBlockTechnologyComponent} from './add-block-technology/add-block-technology.component';
import {ChangeFeeComponent} from './change-fee/change-fee.component';
import {MentorComponent} from '../app/mentor/mentor.component';
import {AddMentorComponent} from './mentor/add-mentor.component';
import {MentorService} from './mentor/mentor.service';
import {TechnologyComponent} from './technology/technology.component';
import {AddTechnologyComponent} from './technology/add-technology.component';
import {TechnologyService} from './technology/technology.service';
import {TrainingComponent} from './training/training.component';
import {AddTrainingComponent} from './training/add-training.component';
import {TrainingService} from './training/training.service';
import {PaymentComponent} from './payment/payment.component';
import {AddPaymentComponent} from './payment/add-payment.component';
import {PaymentService} from './payment/payment.service';
import {SkillComponent} from './skill/skill.component';
import {AddSkillComponent} from './skill/add-skill.component';
import {SkillService} from './skill/skill.service';
import {PaymentViewComponent} from './paymentView/payment.component';
import {PaymentViewService} from './paymentView/payment.service';
import {TrainingViewComponent} from './trainingView/training.component';
import {TrainingViewService} from './trainingView/training.service';
import {UserloginService} from './user-login/user.service';
import {MentorloginService} from './mentor-login/mentor.service';
import {UserprofileService} from './user-profile/user.service';
import {UseradminComponent} from './user/useradmin.component';
import {MentoradminComponent} from './mentor/mentoradmin.component';
import {MentorprofileService} from './mentor-profile/mentor.service';
import {TrainingMentorComponent} from './trainingView/trainingmentor.component';
import { NgCircleProgressModule } from 'ng-circle-progress';
import { UserpaymentService } from './user-payment/user.service';
import { UserdashboardService } from './user-dashboard/user.service';
import { TrainingstartenddayComponent } from './trainingView/trainingstartenddate.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { PaymentuserViewComponent } from './paymentView/paymentuser.component';
import { SkillmentorviewComponent } from './skill/skillmentorview.component';
import { TechnologyViewMentorComponent } from './technology/technologyviewmentor.component';
import { TrainingMentorEnrollComponent } from './trainingView/trainingmentorenroll.component';


@NgModule({
  declarations: [
    AppComponent,
    SkillmentorviewComponent,
    TechnologyViewMentorComponent,
    TrainingMentorEnrollComponent,
    UserComponent,
    PaymentuserViewComponent,
    MentorComponent,
    SkillComponent,
    MentoradminComponent,
    UseradminComponent,
    AddSkillComponent,
    TrainingViewComponent,
    TrainingComponent,
    AddPaymentComponent,
    TrainingstartenddayComponent,
    PaymentViewComponent,
    AddTrainingComponent,
    PaymentComponent,
    
    AddTechnologyComponent,
    ChangeFeeComponent,
    AddBlockTechnologyComponent,
    AddMentorComponent,
    AddBlockMentorComponent,
    PaymentDetailsMentorComponent,
    SpecializationEditComponent,
    AddUserComponent,
    AddBlockUserComponent,
    AdminProfileComponent,
    HomeComponent,
    FormComponent,
    MentorProfileComponent,
    UserProfileComponent,
    TrainingCoursesAvailableComponent,
    TrainingCoursesCompletedComponent,
    TrainingCoursesInProgressComponent,
    TrainingsMentorDeliverComponent,
    MentorLoginComponent,
    UserPaymentComponent,
    AdminloginComponent,
    AboutMentorComponent,
    TechnologyComponent,
    TrainingMentorComponent,
    AdminDashboardComponent,
    UserDashboardComponent,
    UserLoginComponent,
    MentorDashboardComponent,
    MentorSignUpFormComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    NgbModule,
    NgCircleProgressModule.forRoot({
      radius: 25,
      outerStrokeWidth: 8,
      innerStrokeWidth: 4,
      outerStrokeColor: "#78C000",
      innerStrokeColor: "#C7E596",
      animationDuration: 200,
      
    })
  ],
  providers: [UserService,UserdashboardService,UserpaymentService,UserprofileService,MentorloginService,MentorService,TechnologyService,TrainingService,PaymentService,SkillService,UserloginService,TrainingViewService,PaymentViewService,MentorprofileService],
  bootstrap: [AppComponent],
  schemas: [ CUSTOM_ELEMENTS_SCHEMA ]
})
export class AppModule { }
