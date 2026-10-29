import { Component, signal } from '@angular/core';

@Component({
  imports: [],
  selector: 'app-root',
  styleUrl: './app.css',
  templateUrl: './app.html',
})
export class App {
  userType = signal<string>('');
  frutas = signal<string[]>(['Manzana','Naranja','Pera','Platano','Kiwi']);

  cambiarRol(rol:string){
    this.userType.set(rol);
  }
}
