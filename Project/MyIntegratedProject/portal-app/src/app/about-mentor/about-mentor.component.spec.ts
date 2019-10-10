import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AboutMentorComponent } from './about-mentor.component';

describe('AboutMentorComponent', () => {
  let component: AboutMentorComponent;
  let fixture: ComponentFixture<AboutMentorComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AboutMentorComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AboutMentorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
