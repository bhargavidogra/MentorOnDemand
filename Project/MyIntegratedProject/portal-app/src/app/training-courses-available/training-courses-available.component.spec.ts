import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TrainingCoursesAvailableComponent } from './training-courses-available.component';

describe('TrainingCoursesAvailableComponent', () => {
  let component: TrainingCoursesAvailableComponent;
  let fixture: ComponentFixture<TrainingCoursesAvailableComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TrainingCoursesAvailableComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TrainingCoursesAvailableComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
