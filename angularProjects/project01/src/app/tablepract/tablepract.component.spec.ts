import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TablepractComponent } from './tablepract.component';

describe('TablepractComponent', () => {
  let component: TablepractComponent;
  let fixture: ComponentFixture<TablepractComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TablepractComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TablepractComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
