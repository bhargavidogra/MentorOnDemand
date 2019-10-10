import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PaymentDetailsMentorComponent } from './payment-details-mentor.component';

describe('PaymentDetailsMentorComponent', () => {
  let component: PaymentDetailsMentorComponent;
  let fixture: ComponentFixture<PaymentDetailsMentorComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PaymentDetailsMentorComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PaymentDetailsMentorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
