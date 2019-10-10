import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TrainingCoursesInProgressComponent } from './training-courses-in-progress.component';

describe('TrainingCoursesInProgressComponent', () => {
  let component: TrainingCoursesInProgressComponent;
  let fixture: ComponentFixture<TrainingCoursesInProgressComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TrainingCoursesInProgressComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TrainingCoursesInProgressComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
