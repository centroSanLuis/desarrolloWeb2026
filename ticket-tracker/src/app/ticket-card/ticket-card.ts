import { Component, input, output } from '@angular/core';
import { UpperCasePipe, TitleCasePipe, DatePipe } from '@angular/common';
import { Ticket } from '../models/ticket.model';

@Component({
  imports: [UpperCasePipe, TitleCasePipe, DatePipe],
  selector: 'app-ticket-card',
  styleUrl: './ticket-card.css',
  templateUrl: './ticket-card.html',
})
export class TicketCard {
  ticket = input.required<Ticket>();
  cambiarEstado = output<number>();
  eliminar = output<number>();

  onCambiarEstado(){
    this.cambiarEstado.emit(this.ticket().id);
  }

  onEliminar(){
    this.eliminar.emit(this.ticket().id);
  }
}
