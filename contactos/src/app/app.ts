import { Component, signal } from '@angular/core';

import { TarjetaUsuario } from './tarjeta-usuario/tarjeta-usuario';

@Component({
  imports: [TarjetaUsuario],
  selector: 'app-root',
  styleUrl: './app.css',
  templateUrl: './app.html',
})
export class App {}
