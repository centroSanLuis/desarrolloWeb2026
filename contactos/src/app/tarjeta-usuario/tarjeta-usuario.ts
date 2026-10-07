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

  enLinea = true;

  cambiarEstado(){
    this.enLinea = !this.enLinea;
  }

}
