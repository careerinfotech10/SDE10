import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ParappipesComponent } from './parappipes.component';

describe('ParappipesComponent', () => {
  let component: ParappipesComponent;
  let fixture: ComponentFixture<ParappipesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ParappipesComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ParappipesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
