import { Component, inject, signal } from '@angular/core';
import { FormBuilder, ReactiveFormsModule, Validators } from '@angular/forms';

@Component({
  imports: [ReactiveFormsModule],
  selector: 'app-root',
  styleUrl: './app.css',
  templateUrl: './app.html',
})
export class App {
  private fb = inject(FormBuilder).nonNullable;
  
  form = this.fb.group({
    nombre: ['', Validators.required],
    email: ['', [Validators.required, Validators.email]],
    edad: [18, [Validators.required, Validators.min(18)]]
  });

  enviar(){
    if(this.form.invalid) return;

    const datos = this.form.getRawValue();
    console.log(datos);
  }
}
