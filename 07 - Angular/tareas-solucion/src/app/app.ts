import { Component, signal } from '@angular/core';
import { CardTarea } from './card-tarea/card-tarea';

@Component({
  imports: [CardTarea],
  selector: 'app-root',
  styleUrl: './app.css',
  templateUrl: './app.html',
})
export class App {
  tareasRealizadas = signal<number>(0);
  estadoTareas = signal<number[]>([0,0,0]);
  tareasTotales = this.estadoTareas().length;

  cambiarEstado(id: number){
    //console.log(id);
    
    this.estadoTareas()[id]==0?this.estadoTareas()[id]=1:this.estadoTareas()[id]=0; 
    
    const resultado = this.estadoTareas().filter((estado) => estado === 1);

    this.tareasRealizadas.set(resultado.length);
  }
}
