import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AddBlockTechnologyComponent } from './add-block-technology.component';

describe('AddBlockTechnologyComponent', () => {
  let component: AddBlockTechnologyComponent;
  let fixture: ComponentFixture<AddBlockTechnologyComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AddBlockTechnologyComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AddBlockTechnologyComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
