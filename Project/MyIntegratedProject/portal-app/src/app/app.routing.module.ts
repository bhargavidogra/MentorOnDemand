import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {MentorProfileComponent} from './mentor-profile/mentor-profile.component';

import { UserComponent } from './user/user.component';
import {AddUserComponent} from './user/add-user.component';
import { HomeComponent } from './home/home.component';
import {FormComponent} from './form/form.component';
import {UserDashboardComponent} from './user-dashboard/user-dashboard.component';
import {UserLoginComponent} from './user-login/user-login.component';
import {AdminloginComponent} from './adminlogin/adminlogin.component';
import {AdminDashboardComponent} from './admin-dashboard/admin-dashboard.component';
import {UserProfileComponent} from './user-profile/user-profile.component';
import {TrainingCoursesAvailableComponent} from './training-courses-available/training-courses-available.component';
import {TrainingCoursesCompletedComponent} from './training-courses-completed/training-courses-completed.component';
import {TrainingCoursesInProgressComponent} from './training-courses-in-progress/training-courses-in-progress.component';
import {UserPaymentComponent} from './user-payment/user-payment.component';
import {MentorLoginComponent} from './mentor-login/mentor-login.component';
import {MentorSignUpFormComponent} from './mentor-sign-up-form/mentor-sign-up-form.component';
import {MentorDashboardComponent} from './mentor-dashboard/mentor-dashboard.component';
import {AboutMentorComponent} from './about-mentor/about-mentor.component';
import {TrainingsMentorDeliverComponent} from './trainings-mentor-deliver/trainings-mentor-deliver.component';
import {SpecializationEditComponent} from './specialization-edit/specialization-edit.component';
import {PaymentDetailsMentorComponent} from './payment-details-mentor/payment-details-mentor.component';
import {AdminProfileComponent} from './admin-profile/admin-profile.component';
import {AddBlockUserComponent} from './add-block-user/add-block-user.component';
import {AddBlockMentorComponent} from './add-block-mentor/add-block-mentor.component';
import {AddBlockTechnologyComponent} from './add-block-technology/add-block-technology.component';
import {ChangeFeeComponent} from './change-fee/change-fee.component';
import {MentorComponent} from '../app/mentor/mentor.component';
import {AddMentorComponent} from './mentor/add-mentor.component';
import {TechnologyComponent} from './technology/technology.component';
import {AddTechnologyComponent} from './technology/add-technology.component';
import {TrainingComponent} from './training/training.component';
import {AddTrainingComponent} from './training/add-training.component';
import {PaymentComponent} from './payment/payment.component';
import {AddPaymentComponent} from './payment/add-payment.component';
import {SkillComponent} from './skill/skill.component';
import {AddSkillComponent} from './skill/add-skill.component';
import {PaymentViewComponent} from './paymentView/payment.component';
import {TrainingViewComponent} from './trainingView/training.component';
import {UseradminComponent} from './user/useradmin.component';
import {MentoradminComponent} from './mentor/mentoradmin.component';
import {TrainingMentorComponent} from './trainingView/trainingmentor.component';
import { TrainingstartenddayComponent } from './trainingView/trainingstartenddate.component';
import { PaymentuserViewComponent } from './paymentView/paymentuser.component';
import { SkillmentorviewComponent } from './skill/skillmentorview.component';
import { TechnologyViewMentorComponent } from './technology/technologyviewmentor.component';
import { TrainingMentorEnrollComponent } from './trainingView/trainingmentorenroll.component';




const routes: Routes = [
  { path: 'users', component: UserComponent },
  { path: 'skillviewmentor', component: SkillmentorviewComponent },
  { path: 'techviewmentor', component: TechnologyViewMentorComponent },
  { path: 'trainingmentorenroll', component: TrainingMentorEnrollComponent },

  { path: 'paymentuserview', component: PaymentuserViewComponent },
  { path: 'mentor', component: MentorComponent },
  { path: 'technology', component: TechnologyComponent },
  { path: 'payment', component: PaymentComponent },
  { path: 'trainingviewmentor', component: TrainingMentorComponent },
  { path: 'trainingstartenddate', component: TrainingstartenddayComponent },
  { path: 'paymentview', component: PaymentViewComponent },
  { path: 'trainingview', component: TrainingViewComponent },
  { path: 'skill', component: SkillComponent },
  { path: 'addskill', component: AddSkillComponent },
  { path: 'addpayment', component: AddPaymentComponent },
  { path: 'training', component: TrainingComponent },
  { path: 'addtechnology', component: AddTechnologyComponent },
  { path: 'addtraining', component: AddTrainingComponent },
  { path: 'addmentor', component: AddMentorComponent },
  { path: 'admin-profile', component: AdminProfileComponent },
  { path: 'change-fee', component: ChangeFeeComponent },
  { path: 'add-block-technology', component: AddBlockTechnologyComponent },
  { path: 'add-block-mentor', component: AddBlockMentorComponent },
  { path: 'add-block-user', component: AddBlockUserComponent },
  { path: 'specialization-edit', component: SpecializationEditComponent },
  { path: 'payment-details-mentor', component: PaymentDetailsMentorComponent },
  { path: 'trainings-mentor-deliver', component: TrainingsMentorDeliverComponent },
  { path: 'add', component: AddUserComponent },
  { path: 'home', component: HomeComponent },
  { path: 'about-mentor', component: AboutMentorComponent },
  { path: 'form', component: FormComponent },
  { path: 'adminlogin', component: AdminloginComponent },
  { path: 'mentor-sign-up-form', component: MentorSignUpFormComponent },
  { path: 'mentor-dashboard', component: MentorDashboardComponent },
  { path: 'user-payment', component: UserPaymentComponent },
  { path: 'mentor-login', component: MentorLoginComponent },
  { path: 'admin-dashboard', component: AdminDashboardComponent },
  { path: 'training-courses-available', component: TrainingCoursesAvailableComponent },
  { path: 'training-courses-completed', component: TrainingCoursesCompletedComponent },
  { path: 'training-courses-in-progress', component: TrainingCoursesInProgressComponent },
  { path: 'user-profile', component: UserProfileComponent },
  { path: 'mentor-profile', component: MentorProfileComponent },
  { path: 'user-dashboard', component: UserDashboardComponent },
  { path: 'user-login', component: UserLoginComponent },
  { path: 'useradmin', component: UseradminComponent },
  { path: 'mentoradmin', component: MentoradminComponent },
];

@NgModule({
  imports: [
    RouterModule.forRoot(routes)
  ],
  exports: [
    RouterModule
  ],
  declarations: []
})
export class AppRoutingModule { }
