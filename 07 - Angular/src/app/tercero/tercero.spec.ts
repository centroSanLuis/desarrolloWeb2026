import { ComponentFixture, TestBed } from '@angular/core/testing';
import { Tercero } from './tercero';

describe('Tercero', () => {
  let component: Tercero;
  let fixture: ComponentFixture<Tercero>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Tercero],
    }).compileComponents();

    fixture = TestBed.createComponent(Tercero);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
