import { Component, inject, signal } from '@angular/core';
import { Pokemon } from './services/pokemon';
import { PokemonRespuesta } from './pokemon';
import { FormsModule } from '@angular/forms';

@Component({
  imports: [FormsModule],
  selector: 'app-root',
  styleUrl: './app.css',
  templateUrl: './app.html',
})
export class App {
  readonly pokemonService = inject(Pokemon);

  pokemon = signal<PokemonRespuesta | null>(null);
  error = signal<string>('');
  cargando = signal<boolean>(false);
  busqueda = signal<string>('');

  buscarPokemon(nombre: string){
    this.cargando.set(true);
    this.error.set('');

    this.pokemonService.getPokemon(nombre).subscribe({
      next: (poke) => {
        this.pokemon.set(poke);
        this.cargando.set(false);
      }
    });
  }

  buscarPokemonPorNombreNumero(){
    this.buscarPokemon(this.busqueda());
  }
}
