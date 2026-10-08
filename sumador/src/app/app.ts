import { Component, signal } from '@angular/core';

@Component({
  imports: [],
  selector: 'app-root',
  styles: `
    h3{
      display: block;
    }

    button{
      background-color: red;
    }
  `,
  template: `
    <h3>Puntuacion {{ puntos() }}</h3>
    <button (click)="sumarPunto()">+1 punto</button>
    <button (click)="resetearPuntos()">Resetear</button>
  `
})
export class App {
  puntos = signal<number>(0);

  sumarPunto(){
    this.puntos.update(valorActual => valorActual + 1);

    /*this.puntos.update(function(valorActual){
      return valorActual + 1;
    });*/
  }

  resetearPuntos(){
    this.puntos.set(0);
  }
}
