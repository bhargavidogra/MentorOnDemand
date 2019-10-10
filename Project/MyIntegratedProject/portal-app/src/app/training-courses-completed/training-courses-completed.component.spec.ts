import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TrainingCoursesCompletedComponent } from './training-courses-completed.component';

describe('TrainingCoursesCompletedComponent', () => {
  let component: TrainingCoursesCompletedComponent;
  let fixture: ComponentFixture<TrainingCoursesCompletedComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TrainingCoursesCompletedComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TrainingCoursesCompletedComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
