import { Component, input, output, signal } from '@angular/core';

@Component({
  imports: [],
  selector: 'app-card-tarea',
  styleUrl: './card-tarea.css',
  templateUrl: './card-tarea.html',
})
export class CardTarea {
  nombre = input.required<string>();
  id = input.required<number>();
  tareaFinalizada = signal<boolean>(false);

  idTareaCambioEstado = output<number>();

  cambiarEstado(){
    this.tareaFinalizada.update((value) => !value);
    this.idTareaCambioEstado.emit(this.id());
  }
}
