import { Component, signal } from '@angular/core';
import { HijoComponent } from './hijo-component/hijo-component';

@Component({
  imports: [HijoComponent],
  selector: 'app-root',
  styleUrl: './app.css',
  templateUrl: './app.html',
})
export class App {

  recibirId(id:number){
    console.log(id);
  }
}
