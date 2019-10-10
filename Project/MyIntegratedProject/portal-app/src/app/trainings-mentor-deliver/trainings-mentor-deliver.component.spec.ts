import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TrainingsMentorDeliverComponent } from './trainings-mentor-deliver.component';

describe('TrainingsMentorDeliverComponent', () => {
  let component: TrainingsMentorDeliverComponent;
  let fixture: ComponentFixture<TrainingsMentorDeliverComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TrainingsMentorDeliverComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TrainingsMentorDeliverComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
