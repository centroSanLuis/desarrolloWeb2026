//1.Crea un objeto llamado persona con tu nombre, apellido, edad y ciudad. Muestra el nombre y la ciudad en una sola frase por consola.
const persona = {
  nombre: "Alberto",
  apellidos: "Garcia de Cortazar",
  edad: 42,
  ciudad: "Bilbao"
};

console.log(`${persona.nombre} ${persona.ciudad}`);

//2. Crea un objeto coche con marca y modelo. Después de crearlo, cambia el modelo por otro y añade una propiedad nueva: color.

const coche = {
    marca: "ford",
    modelo: "fiesta"
};

coche.modelo = "focus";
coche.color = "azul";

console.log(coche);

//3. Crea un objeto smartphone. Dentro, debe tener una propiedad especificaciones que sea otro objeto con ram, almacenamiento y procesador. Accede a la RAM.

const smartphone = {
    especificaciones: {
        ram: 32,
        almacenamiento: 256,
        prcesador: "A5"
    }
}

console.log(smartphone.especificaciones.ram);

//4. Crea un array llamado estudiantes. Dentro debe haber 3 objetos, cada uno con nombre y nota. Usa un .forEach para mostrar solo los nombres. [he añadido la nota media]

const estudiantes = [
    {nombre:"Alberto", nota: 7}, 
    {nombre: "Federico", nota: 4}, 
    {nombre: "Pako", nota: 5}
];

let sumaNotas = 0;

estudiantes.forEach(function(estudiante){
    console.log(estudiante.nombre);
    sumaNotas = sumaNotas + estudiante.nota;
});

const notaMedia = sumaNotas/estudiantes.length;

console.log(`La nota media de los estudiantes es ${notaMedia.toFixed(2)}`);

//5. Crea un objeto producto con nombre, precio y stock. Usa un if para mostrar "Hay existencias" si el stock es mayor a 0, o "Agotado" si es 0.

const producto = {
    nombre: "cocacola",
    precio: 1.5,
    stock: 0
}

if(producto.stock > 0){
    console.log("Hay Existencias");
}else{
    console.log("Agotado");
}

//6. Crea un objeto perro con nombre. Añade una propiedad que sea una función llamada ladrar que haga un console.log("¡Guau guau!"). Ejecútala con perro.ladrar().

const perro = {
    nombre: "Firulais",
    ladrar: function(){
        console.log("¡Guau guau!");
    }
}

perro.ladrar();

//7. Crea un array de 3 objetos paises (nombre, capital). Usa un bucle para mostrar por consola: "La capital de [nombre] es [capital]".

const paises = [
    {nombre: "Francia", capital: "Paris"},
    {nombre: "Alemania", capital: "Berlin"},
    {nombre: "Italia", capital: "Roma"}
];

paises.forEach((pais)=>{
    console.log(`La capital de ${pais.nombre} es ${pais.capital}`);
});

//8. Dado un array de objetos libros (titulo, autor), usa .find() para buscar el objeto que tenga como título "El Quijote" y muéstralo por consola.

const libros = [
    {titulo: "El nombre del viento", autor: "Patrick"},
    {titulo: "El Quijote", autor: "Cervantes"}
];

const libro = libros.find((libro)=>libro.titulo === "El Quijote");

/*
const libro = libros.find((libro)=>{ return libro.titulo === "El Quijote"});

const libro = libros.find(function(libro){
    return libro.titulo === "El Quijote";
});

const libro = libros.find(function(libro){
    if(libro.titulo === "El Quijote"){
        return true;
    }else{
        return false;
    }
});
*/

console.log(libro);


//9. Tienes un array de empleados con nombre y sueldo. Usa .filter() para crear un nuevo array que solo tenga a los que ganan más de 2000€.

const empleados = [
    {nombre: "Alberto", sueldo: 1200},
    {nombre: "Federico", sueldo: 2500},
    {nombre: "Pako", sueldo: 2100}
];

const empleadosSueldoAlto = empleados.filter((empleado)=> empleado.sueldo > 2000);
/*const empleadosSueldoAlto = empleados.filter((empleado)=>{ return empleado.sueldo > 2000});
const empleadosSueldoAlto = empleados.filter(function(empleado){ 
    return empleado.sueldo > 2000
});
const empleadosSueldoAlto = empleados.filter(function(empleado){ 
    if(empleado.sueldo > 2000){
        return true;
    }else{
        return false;
    }
});*/

console.log(empleadosSueldoAlto);

//10. Toma un objeto cualquiera y usa JSON.stringify(objeto) para convertirlo a texto. Luego usa JSON.parse() para volverlo a convertir en objeto.
const personaJSON = JSON.stringify(persona);
const personaObj = JSON.parse(personaJSON);

console.log(personaJSON);
console.log(personaObj);
