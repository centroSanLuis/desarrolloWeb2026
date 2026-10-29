import { Routes } from '@angular/router';
import { Home } from './home/home';
import { Productos } from './productos/productos';
import { Contacto } from './contacto/contacto';

export const routes: Routes = [
    {path: '', component: Home, title: 'Home'},
    {path: 'productos', component: Productos, title: 'Productos'},
    {path: 'contacto', component: Contacto, title: 'Contacto'},
    {path: '**', redirectTo: ''}
];
