import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Pipes07Component } from './pipes07.component';

describe('Pipes07Component', () => {
  let component: Pipes07Component;
  let fixture: ComponentFixture<Pipes07Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ Pipes07Component ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(Pipes07Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
