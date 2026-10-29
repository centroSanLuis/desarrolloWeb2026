import { Component, inject, signal } from '@angular/core';
import { RickMortyService } from './services/rick-morty-service';
import { Info, Personaje, RickMortyResponse } from './model/RickMortyResponse';
import { PersonajeComponent } from './personaje-component/personaje-component';

@Component({
  imports: [PersonajeComponent],
  selector: 'app-root',
  styleUrl: './app.css',
  templateUrl: './app.html',
})
export class App {
  rickMortyService = inject(RickMortyService);
  personajes = signal<Personaje[]>([]);
  info = signal<Info | null>(null);

  constructor(){
    this.rickMortyService.getPersonajes().subscribe({
      next: (respuesta) => {
        console.log(respuesta.info);
        console.log(respuesta.results);
        this.personajes.set(respuesta.results);
        this.info.set(respuesta.info);
      }
    });
  }

  anterior(){
    const url = this.info()?.prev;
    if(!url) return;
    this.rickMortyService.getPersonajesByURL(url).subscribe({
      next: (respuesta) => {
        console.log(respuesta.info);
        console.log(respuesta.results);
        this.personajes.set(respuesta.results);
        this.info.set(respuesta.info);
      }
    });
  }

  siguiente(){
    const url = this.info()?.next;
    if(!url) return;
    this.rickMortyService.getPersonajesByURL(url).subscribe({
      next: (respuesta) => {
        console.log(respuesta.info);
        console.log(respuesta.results);
        this.personajes.set(respuesta.results);
        this.info.set(respuesta.info);
      }
    });
  }
}
