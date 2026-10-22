export type Prioridad = 'Baja' | 'Media' | 'Alta';
export type Estado = 'Pendiente' | 'Resuelto';

export interface Ticket{
    id: number;
    titulo: string;
    descripcion: string;
    prioridad: Prioridad;
    estado: Estado;
    fechaCreacion: Date;
}