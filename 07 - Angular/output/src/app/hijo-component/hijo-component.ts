import { Component, output } from '@angular/core';

@Component({
  imports: [],
  selector: 'app-hijo-component',
  styleUrl: './hijo-component.css',
  templateUrl: './hijo-component.html',
})
export class HijoComponent {
  alSeleccionar = output<number>();

  ejecutarAccion(){
    this.alSeleccionar.emit(5);
  }
}
