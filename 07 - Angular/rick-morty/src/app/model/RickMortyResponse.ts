export interface RickMortyResponse{
    info: Info;
    results: Personaje[];
}

export interface Personaje{
    id: number;
    name: string;
    status: 'Alive' | 'Dead' | 'unknown';
    species: string;
    image: string;
}

export interface Info{
    count: number;
    pages: number;
    next: string | null;
    prev: string | null;
}