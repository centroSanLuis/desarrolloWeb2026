//SELECCION DE ELEMENTOS
console.log(document.getElementById('parrafo'));
console.log(document.getElementsByClassName('parrafoClass'));
console.log(document.getElementsByTagName('p'));

//MODIFICAR ATRIBUTOS
document.getElementById('parrafo').style.color = 'blue';
let arrayParrafos = document.getElementsByClassName('parrafoClass');

for(let i=0;i<arrayParrafos.length;i++){
    arrayParrafos[i].style.color = 'green';
}

let arrayParrafosTag = document.getElementsByTagName('p');

for(let i=0;i<arrayParrafosTag.length;i++){
    arrayParrafosTag[i].style.fontWeight = 'bold';
}

/*setTimeout(function(){
    document.getElementById('imagen').src = 'img/bulba.png';
}, 5000);*/

function cambioImagen(){
    document.getElementById('imagen').src = 'img/bulba.png';
}

document.getElementById('parrafo').innerHTML = 'He cambiado el texto de este parrafo';
//document.getElementById('parrafo').innerHTML = '<ul><li>pera</li><li>manzana</li><li>fresa</li></ul>';

//AÑADIR ELEMENTOS AL ARBOL DOM
let nuevoParrafo = document.createElement('p');
nuevoParrafo.innerText = 'Este parrafo le he creado en JS';

document.body.appendChild(nuevoParrafo);

//ELIMINAR ELEMENTOS DEL ARBOL DOM
document.getElementById('borrar').remove();