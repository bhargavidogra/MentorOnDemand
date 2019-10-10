import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ChangeFeeComponent } from './change-fee.component';

describe('ChangeFeeComponent', () => {
  let component: ChangeFeeComponent;
  let fixture: ComponentFixture<ChangeFeeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ChangeFeeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ChangeFeeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
