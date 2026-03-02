const btnHora = document.getElementById('hora');

btnHora.style.backgroundColor = 'red';

function mostrarHora(){
    btnHora.innerHTML = 'Este texto ha cambiado!';
}

//tipos de datos
//number
let numero = 10.10;
//string
let cadena = 'Alberto';
//boolean
let bool = true; //false
//array
let array = [5,4,5,8,"Perro"];
console.log(array);

const mayorEdad = 18;
let edad = 42;

//condicional
if(edad >= mayorEdad){
    console.log("Puedes pasar!");
}else{
    console.log("No puedes pasar!");
}

for(let i=0 ; i<5 ; i++){
    console.log("Hola!");
}

for(let i=0; i<array.length;i++){
    console.log(array[i]);
}