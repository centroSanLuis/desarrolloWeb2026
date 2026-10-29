import { Component, input, signal } from '@angular/core';

@Component({
  imports: [],
  selector: 'app-tarjeta-usuario',
  styleUrl: './tarjeta-usuario.css',
  templateUrl: './tarjeta-usuario.html',
})
export class TarjetaUsuario {
  nombre = input.required<string>();
  profesion = input.required<string>();
  avatarUrl = input.required<string>();

  enLinea = signal(true);

  cambiarEstado(){
    this.enLinea.update(estadoActual => !estadoActual);

    /*this.enLinea.update(function(estadoActual){
      return !estadoActual;
    });*/
  }

}
