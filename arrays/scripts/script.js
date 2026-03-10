//array
//1.-creación
//array vacio
let array = [];
console.log(array);

//array con valores iniciales
let arrayConValores = [4,1,5,6,7,8];
console.log(arrayConValores);

//array creado con constructor
let arrayConstructor = new Array(); //podemos pasar un numero por parametro para especificar el numero de posiciones de nustro array
console.log(arrayConstructor);

//acceso mediante indice
console.log(arrayConValores[4]);

//metedos y propiedades de array
console.log(arrayConValores.length); //propiedad

arrayConValores.push(1);
console.log(arrayConValores);

arrayConValores.pop();
console.log(arrayConValores);

//recorrer un array
for(let i=0;i<arrayConValores.length;i++){
    console.log(arrayConValores[i]);
}

//funcion anonima
arrayConValores.forEach(function (elemento){
    console.log(elemento+1);
});


//arrow function
arrayConValores.forEach((elemento)=>{
    console.log(elemento+1);
});

let arrayDollars = arrayConValores.map(function (elemento){
    return elemento * 0.86;
});

console.log(arrayDollars);

let arrayMayorCuatro = arrayConValores.filter(function (elemento){
    if(elemento%2==0){
        return elemento;
    }
});

console.log(arrayMayorCuatro);

let primerPar = arrayConValores.find(function(elemento){
    if(elemento%2==0){
        return elemento;
    }
});

console.log(primerPar);

console.log(arrayConValores.includes(2));
console.log(arrayConValores.includes(4));

console.log(arrayConValores.sort());

arrayStrings = ["hola", "mundo", "desde", "js"];
let cadena = arrayStrings.join(' ');

console.log(cadena);