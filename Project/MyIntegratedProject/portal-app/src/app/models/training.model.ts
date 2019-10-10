import { Mentor } from './mentor.model';
import { Technology } from './technology.model';

import { User } from './user.model';
import { Skill } from './skill.model';
import { Payment } from './payment.model';
export class Training {

  id: number;
  progress: number;
  commissionAmount: number;
  rating: number;
  avgRating:number;
  startDate:Date;
  endDate:Date;
  startTime:string;
  endTime:string;
  amountReceived:number;
  mentorId:string;
  mentorName:string;
  userId:number;
  userName:string;
  skillId:number;
  skillName:string;
  fees:number;
  status:Boolean;
  mentor:Mentor;
  user:User[];
  skill:Skill[];
  technology:Technology;
  payment:Payment[];
}
