console.log("hola");
console.log('hola');

console.log("Billy 'El niño' Jones");
console.log('Billy "El niño" Jones');

console.log("Billy \"El niño\" Jones");

console.log('c:\\windows\\users\\');

let nombre = 'Alberto';
let apellidos = 'GCR';
let edad = 42;

console.log('Me llamo ' + nombre + ' ' + apellidos + ' y tengo ' + edad + ' años');

console.log(`Me llamo ${nombre} ${apellidos} y tengo ${edad} años`);

let precio = 5;
let impuesto = 1.21;

console.log(`El precio final es ${precio*impuesto}`);

console.log(nombre.length);
console.log(nombre.charAt(3));
console.log(nombre.charAt(nombre.length-1));//ultimo caracter independiente de cuantos caracteres tenga el string
console.log(nombre.at(-1));//ultimo caracter independiente de cuantos caracteres tenga el string NUEVA VERSIÓN

console.log(nombre.slice(2,5)); //se muestra desde la posicion 2 hasta la 4, el 5 no esta incluido
console.log(nombre.slice(2));// se muestra desde la posicion 2 hasta el final
console.log(nombre.slice(-2)); //se cuenta desde atras

console.log(nombre.substring(2,5))// es igual que el slice
console.log(nombre.substring(-2,5))// aqui el valor negativo se cambia por 0

console.log(nombre.substr(2,2)); //empieza en el 2 y muestra 2 caracteres

console.log(nombre.toUpperCase());
console.log(nombre.toLowerCase());

console.log(nombre.replace('a', 'b')); //reemplaza un caracter por otro pero solo el primero

console.log(nombre.replaceAll('a', 'b')); //lo mismo pero reemplaza TODO

let productos = 'producto1|producto2|producto3';
console.log(productos.split("|"));