import { HttpClient } from '@angular/common/http';
import { inject, Service } from '@angular/core';
import { Observable } from 'rxjs';
import { RickMortyResponse } from '../model/RickMortyResponse';


@Service()
export class RickMortyService {
    readonly http = inject(HttpClient);
    private readonly url = 'https://rickandmortyapi.com/api/';

    getPersonajes(): Observable<RickMortyResponse>{
        return this.http.get<RickMortyResponse>(`${this.url}/character`);
    }

    getPersonajesByURL(url:string | null): Observable<RickMortyResponse>{
        if(url){
            return this.http.get<RickMortyResponse>(url);
        }else{
            return this.getPersonajes();
        }
    }
}
