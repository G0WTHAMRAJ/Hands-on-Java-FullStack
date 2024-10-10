import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Factorail1Component } from './factorail1.component';

describe('Factorail1Component', () => {
  let component: Factorail1Component;
  let fixture: ComponentFixture<Factorail1Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [Factorail1Component]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Factorail1Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
