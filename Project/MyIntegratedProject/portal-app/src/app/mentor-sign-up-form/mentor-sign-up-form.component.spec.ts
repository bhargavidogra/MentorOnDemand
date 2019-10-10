import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MentorSignUpFormComponent } from './mentor-sign-up-form.component';

describe('MentorSignUpFormComponent', () => {
  let component: MentorSignUpFormComponent;
  let fixture: ComponentFixture<MentorSignUpFormComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MentorSignUpFormComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MentorSignUpFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
