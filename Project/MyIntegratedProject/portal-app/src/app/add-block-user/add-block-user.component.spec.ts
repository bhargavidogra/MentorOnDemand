import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AddBlockUserComponent } from './add-block-user.component';

describe('AddBlockUserComponent', () => {
  let component: AddBlockUserComponent;
  let fixture: ComponentFixture<AddBlockUserComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AddBlockUserComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AddBlockUserComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
