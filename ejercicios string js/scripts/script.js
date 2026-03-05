//ejercicio 1

let texto = 'En un lugar de la mancha cuyo nombre no quiero recordar';
let contador = 0;

for(let i=0;i<texto.length;i++){
    if(texto.charAt(i) == 'a'){
        contador = contador + 1;
    }
}

console.log(contador);

//ejercicio 2
cadenaAlReves('hola');

function cadenaAlReves(cadena){
    let nuevaCadena = '';
    //recorrer una cadena de manera inversa
    for(let i=cadena.length-1;i>=0;i--){
        nuevaCadena = nuevaCadena + cadena.charAt(i);
    }

    console.log(nuevaCadena);
}

esPalindromo('ana');
esPalindromo('jose luis');

//ejercicio 3
function esPalindromo(cadena){
    //darle la vuelta a cadena
    let nuevaCadena = '';

    for(let i=cadena.length-1;i>=0;i--){
        nuevaCadena = nuevaCadena + cadena.charAt(i);
    }
    //preguntar si cadena es igual que cadena al reves
    if(cadena == nuevaCadena){
        //si es igual decimos que es un palindromo
        console.log(`la palabra "${cadena}" es un palindromo`)
    }else{
        //si no, pues no es un palindromo
        console.log(`la palabra "${cadena}" NO es un palindromo`);
    }

}

//ejercicio 4

//creo una funcion palabraProhibida que recibe 2 parametros, el primero es la cadena, por ejemplo "Javascript es malo". El segundo parametro será la palabra que quiero poner con asteriscos.
function palabraProhibida(cadena, palabraSustituir){
    let desde = cadena.indexOf(palabraSustituir);
    let hasta = desde + palabraSustituir.length;
    console.log(desde);
    console.log(hasta);

    //if(indice != -1)
    if(desde>=0){
        //11 <13
        //11,12
        //11 + 2 = 13
        for(let i=desde;i < hasta;i++){
            cadenaInicial = cadena.slice(0, i);
            cadenaFinal = cadena.slice(i+1);
            
            cadena = cadenaInicial + '*' + cadenaFinal;
        }

        console.log(cadena);
    }

}

palabraProhibida('Javascript es malo', 'Javascript'); // Javascript es ****