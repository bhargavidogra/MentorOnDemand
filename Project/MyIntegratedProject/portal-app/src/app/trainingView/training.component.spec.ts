import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TrainingViewComponent } from './training.component';

describe('TrainingComponent', () => {
  let component: TrainingViewComponent;
  let fixture: ComponentFixture<TrainingViewComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TrainingViewComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TrainingViewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
