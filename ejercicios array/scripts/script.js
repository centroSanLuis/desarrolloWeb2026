//ejercicios 1
let arrayNombres = ["Alberto", "Pepe", "Federico" , "Ritxi", "David"];

console.log(arrayNombres[2]);

//ejercico 2
let arrayColores = ["rojo", "verde"];

arrayColores.push("azul");
console.log(arrayColores);

arrayColores.unshift("negro");
console.log(arrayColores);

arrayColores.pop();
console.log(arrayColores);

arrayColores.shift();
console.log(arrayColores);

//ejercicio 3
let arrayProgramacion =  ["Java", "Python", "JavaScript"];
let existe = arrayProgramacion.includes("PHP");
console.log(existe);

if(existe){
    console.log(`El valor EXISTE`);
}else{
    console.log(`El valor NO existe`);
}

//ejercicio 4
let arrayNums = [10, 20, 30];

let arrayDobles = arrayNums.map(function (num){
    return num * 2;
});

console.log(arrayDobles);

//ejercicio 5
let arrayEdades = [12, 18, 25, 10, 30, 16];

let arrayMayoresDeEdad = arrayEdades.filter(function(edad){
    if(edad>=18){
        return edad;
    }
});

console.log(arrayMayoresDeEdad);

//ejercicio 6
let arrayPalabras =  ["Hola", "mundo", "JS"];
let frase = arrayPalabras.join(' ');

console.log(frase);

//ejercicio 7
let arrayNumsNeg = [5, 8, -3, 10, -2];
let numero = arrayNumsNeg.find(function(num){
    if(num<0){
        return num;
    }
});

console.log(numero);

let q = "Q";
let g = "G";

console.log(q>g);

//ejercicio 8
let arrayCompra = ["Queso Latino", "Guayaba", "Membrillo para pizza", "Requeson para pizza"];
arrayCompra.sort();
console.log(arrayCompra);

//ejercicio 8 bis
let arrayCompraBis = ["Queso Latino", "Guayaba", "Membrillo para pizza", "Requeson para pizza"];
arrayCompraBis.sort(function(a,b){
    if(a<b){
        return 1;
    }else if(a>b){
        return -1;
    }else{
        return 0;
    }
});

console.log(arrayCompraBis);

//ejercicio 8 bis bis
let arrayCompraBisBis = ["Queso Latino", "Guayaba", "Membrillo para pizza", "Requeson para pizza"];
arrayCompraBisBis.sort().reverse();

console.log(arrayCompraBisBis);

//ejercicio 9
let arrayNumerosSumar = [12, 18, 25, 10, 30, 16];
let sumaTotal = 0;

arrayNumerosSumar.forEach(function (numero){
    sumaTotal = sumaTotal + numero;
});

console.log(sumaTotal);

//ejercicio 10
let fraseNormal = 'La pizza va sin cochinadas';
let arrayFrase = fraseNormal.split(' ');
arrayFrase.reverse();
let fraseVuelta = arrayFrase.join(' ');

console.log(fraseVuelta);

//ejercicio 11
let arrayNotas = [3, 8, 5, 2, 10, 7, 4];

//funcion anonima
arrayNotas.forEach(function(nota){
    if(nota<5){
        console.log(`Nota ${nota}: SUSPENDIDO`);
    }else{
        console.log(`Nota ${nota}: APROBADO`);
    }
});

/*
//arrow function
arrayNotas.forEach((nota)=>{

});

//nombrando la funcion
arrayNotas.forEach(comprobarNota);

function comprobarNota(nota){

}*/

//ejercicio 12
let arrayCometarios = ["Hola", "Gana dinero fácil", "Me gusta el post", "Cómpralo ya"];

arrayCometarios.forEach(function(comentario){
    let comentarioLimpio = comentario.toLowerCase();

    comentarioLimpio = comentarioLimpio.replaceAll("á", "a");
    comentarioLimpio = comentarioLimpio.replaceAll("é", "e");
    comentarioLimpio = comentarioLimpio.replaceAll("í", "i");
    comentarioLimpio = comentarioLimpio.replaceAll("ó", "o");
    comentarioLimpio = comentarioLimpio.replaceAll("ú", "u");

    if(comentarioLimpio.indexOf("compra") < 0 && comentarioLimpio.indexOf("dinero") < 0){
        console.log(comentario);
    }
});

//ejericio 13
let arrayPrecios =  [45, 12, 89, 5, 24];
let minimo = arrayPrecios[0];

arrayPrecios.forEach(function(precio){

    if(precio < minimo){
        minimo = precio;
    }

});

console.log(minimo);

//ejercicio 14
let arrayNombres2 = ["Alberto", "Pepe", "Federico" , "Ritxi", "David"];

arrayNombres2.forEach(function(nombre){
    if(nombre.toLowerCase().indexOf('a') >= 0){
        console.log(`El nombre ${nombre} cumple con la condicion`);
    }
});

//ejercicio 15
let arrayNombresChungos = [" nico", " mArta ", "JUAN "];

arrayNombresChungos.forEach(function(nombre){
    console.log(nombre.toUpperCase().trim());
});

//ejericio 16
let arrayNums1to10 = [1,2,3,4,5,6,7,8,9,10];
let sumaPares = 0;

arrayNums1to10.forEach(function(numero){
    if(numero % 2 == 0){
        sumaPares = sumaPares + numero;
    }
});

console.log(sumaPares);

//ejercicio 17
let arrayProductos = ['llave inglesa', 'tornillo', 'destornillador'];
arrayProductos.forEach(function(producto, i){
    console.log(`Producto: ${producto} - ID: ${i+100}`);
});








