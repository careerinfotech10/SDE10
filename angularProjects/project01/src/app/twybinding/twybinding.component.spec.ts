import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TwybindingComponent } from './twybinding.component';

describe('TwybindingComponent', () => {
  let component: TwybindingComponent;
  let fixture: ComponentFixture<TwybindingComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TwybindingComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TwybindingComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
