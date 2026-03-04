//Ejercicio 1

/*var nombre;
nombre = 'Alberto';*/
/*var nombre = 'Alberto';*/

let nombre = 'Alberto';
//alert('Hola ' + nombre);

console.log('Hola ' + nombre);

//Ejercicio 2
/*let fecha = new Date();
let anoActual = fecha.getFullYear();*/
let anoActual = 2026;
let anoNacimiento = 1983;

console.log(anoActual - anoNacimiento);

parImpar(6);

//Ejercicio 3
function cambiarTextoParrafo(){
    const parrafo = document.getElementById('parrafo');

    parrafo.innerHTML = 'Tenemos un nuevo texto';
}

//Ejercicio 4
// + suma
// - resta
// / division
// * multiplicacion
// % resto, modulo, residuo...
function parImpar(numero){
    /*
    < menor
    <= menor igual
    > mayor
    >= mayor igual
    == igual
    != distinto
    ! negacion
    === extricatmente igual

    5=='5' => true
    5==='5' => false

    */
    console.log(numero);

    if(numero%2 == 0){
        console.log("Es un numero par");
    }else{
        console.log("Es un numero impar");
    }
}

// Ejercicio 5
let lista = ["manzana", "pasta", "pesto", "mozzarella", "tomate"];

console.log(lista[2]);

//Ejercicio 6
let edad = 25;
if(edad>=18){
    console.log("Puedes pasar!");
}else{
    console.log("Acceso denegado!");
}

//Ejercicio 7
// i++ es sumarle uno a i; es lo mismo que hacer i = i + 1
for(let i=0;i<=20;i++){
    if(i%2 == 0){
        console.log(i);
    }
}

//Ejercicio 10
function cambiarColor(){
    document.getElementById('cuerpo').style.backgroundColor = 'red';
}
