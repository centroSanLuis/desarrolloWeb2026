import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Primero } from './primero/primero';
import { Segundo } from './segundo/segundo';
import { Tercero } from './tercero/tercero';

@Component({
  imports: [RouterOutlet, Primero, Segundo, Tercero],
  selector: 'app-root',
  styleUrl: './app.css',
  templateUrl: './app.html',
})
export class App {
}
