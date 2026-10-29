import { Component, input } from '@angular/core';
import { Personaje } from '../model/RickMortyResponse';
import { LowerCasePipe, UpperCasePipe } from '@angular/common';

@Component({
  imports: [UpperCasePipe, LowerCasePipe],
  selector: 'app-personaje-component',
  styleUrl: './personaje-component.css',
  templateUrl: './personaje-component.html',
})
export class PersonajeComponent {

  personaje = input<Personaje>();

}
