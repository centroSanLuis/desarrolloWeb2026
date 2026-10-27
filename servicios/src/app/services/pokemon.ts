import { HttpClient } from '@angular/common/http';
import { inject, Service } from '@angular/core';
import { Observable } from 'rxjs';
import { PokemonRespuesta } from '../pokemon';

@Service()
export class Pokemon {
  private http = inject(HttpClient);

  //constructor(http: HttpClient){}

  getPokemon(nombre: string): Observable<PokemonRespuesta> {
    return this.http.get<PokemonRespuesta>(`https://pokeapi.co/api/v2/pokemon/${nombre}`);
  }
}
