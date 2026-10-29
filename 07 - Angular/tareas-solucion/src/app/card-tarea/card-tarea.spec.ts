import { ComponentFixture, TestBed } from '@angular/core/testing';
import { CardTarea } from './card-tarea';

describe('CardTarea', () => {
  let component: CardTarea;
  let fixture: ComponentFixture<CardTarea>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [CardTarea],
    }).compileComponents();

    fixture = TestBed.createComponent(CardTarea);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
