import { ComponentFixture, TestBed } from '@angular/core/testing';
import { HijoComponent } from './hijo-component';

describe('HijoComponent', () => {
  let component: HijoComponent;
  let fixture: ComponentFixture<HijoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [HijoComponent],
    }).compileComponents();

    fixture = TestBed.createComponent(HijoComponent);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
