import { Component, signal } from '@angular/core';
import { TicketCard } from './ticket-card/ticket-card';
import { Ticket } from './models/ticket.model';

@Component({
  imports: [TicketCard],
  selector: 'app-root',
  styleUrl: './app.css',
  templateUrl: './app.html',
})
export class App {
  tickets = signal<Ticket[]> ([{
    id: 1,
    titulo: 'Error en el Login',
    descripcion: 'El boton de acceso devuelve un error 500 al pulsar',
    prioridad: 'Alta',
    estado: 'Pendiente',
    fechaCreacion: new Date(2026, 10, 22)
  },
  {
    id: 2,
    titulo: 'Actualizar logotipo',
    descripcion: 'Reemplazar el logo antiguo por la nueva versión SVG',
    prioridad: 'Baja',
    estado: 'Resuelto',
    fechaCreacion: new Date(2026, 10, 21)
  },
  {
    id: 3,
    titulo: 'Lentitud en informes',
    descripcion: 'La exportación a PDF trada mas de 10 minutos',
    prioridad: 'Media',
    estado: 'Pendiente',
    fechaCreacion: new Date(2026, 10, 20)
  }]);

  toggleEstadoTicket(id:number){
    this.tickets.update( lista => 
      lista.map(t => {
        if(t.id === id){
          const nuevoEstado = t.estado === 'Pendiente' ? 'Resuelto':'Pendiente';
          return {...t, estado: nuevoEstado};
        }
        return t;
      })
    );

    /*this.tickets.update( lista => {
      for(let i=0;i<lista.length;i++){
        if(lista[i].id === id){
          if(lista[i].estado === 'Pendiente'){
            lista[i].estado = 'Resuelto';
          }else{
            lista[i].estado = 'Pendiente';
          }

          break;
        }
      }

      return lista;
    });*/
  }

  eliminarTicket(id:number){
    this.tickets.update(lista => lista.filter(t => t.id != id));
  }

}
