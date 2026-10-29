import { CurrencyPipe, DatePipe } from '@angular/common';
import { Component, signal } from '@angular/core';

@Component({
  imports: [CurrencyPipe, DatePipe],
  selector: 'app-root',
  styleUrl: './app.css',
  templateUrl: './app.html',
})
export class App {
  precio = signal<number>(4.55675);
  today = signal<number>(Date.now());
}
