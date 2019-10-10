import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AddBlockMentorComponent } from './add-block-mentor.component';

describe('AddBlockMentorComponent', () => {
  let component: AddBlockMentorComponent;
  let fixture: ComponentFixture<AddBlockMentorComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AddBlockMentorComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AddBlockMentorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
