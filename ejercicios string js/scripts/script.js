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

//ejercicio 5
function capitalizar(frase){
    let array = frase.split(' ');

    let fraseCapitalizada = '';

    for(let i=0; i<array.length; i++){
        console.log(array[i]);
        let palabra = array[i];

        let primeraLetra = palabra.charAt(0);

        let palabraCapitalizada = palabra.replace(primeraLetra, primeraLetra.toUpperCase());

        console.log(palabraCapitalizada);

        fraseCapitalizada = fraseCapitalizada + ' ' + palabraCapitalizada;
    }

    fraseCapitalizada = fraseCapitalizada.trim();

    console.log(fraseCapitalizada);

}

capitalizar('hola mundo desde js');

//Ejercicio 5 BIS
function capitalizar2(frase){
    let primeraLetra = frase.charAt(0);

    frase = frase.replace(primeraLetra, primeraLetra.toUpperCase());

    for(let i=0;i<frase.length;i++){
        if(frase.charAt(i) == ' '){
            //let letraCapitalizada = frase.charAt(i+1).toUpperCase();
            let letra = frase.charAt(i+1);
            let letraCapitalizada = letra.toUpperCase();

            let principioFrase = frase.slice(0,i+1);
            let finalFrase = frase.slice(i+2);

            frase = principioFrase + letraCapitalizada + finalFrase;
        }

    }

    console.log(frase);
}

capitalizar2('hola mundo desde js');

//ejercicio 6

function separarNombre(email){
    let indiceArroba = email.indexOf('@');

    let nombreUsuario = email.slice(0,indiceArroba);

    console.log(nombreUsuario);
}

separarNombre('acortazar@centrosanluis.com');

//ejercicio 7
function contarVocales(frase){
    let contador = 0;
    for(let i=0;i<frase.length;i++){
        let letra = frase.charAt(i);
        if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
            contador++;
        }
    }

    console.log(`el numero de vocales es ${contador}`);
}

contarVocales('animo chic@s que lo vais a conseguir');

//ejercicio 8
function analizarTexto(frase){
    let array = frase.split(' ');

    console.log(`La frase tiene ${array.length} palabras`);

    let palabraMasLarga = '';
    let contadorPalabras = 0;

    for(let i=0;i<array.length;i++){
        tamanoPalabra = array[i].length;
        if(tamanoPalabra > contadorPalabras){
            palabraMasLarga = array[i];
            contadorPalabras = tamanoPalabra;
        }
    }

    console.log(`La palabra mas larga es ${palabraMasLarga}`);

    let contadorLetras = {};

    for(let i=0;i<frase.length;i++){
        let letra = frase.charAt(i);

        if(letra != ' '){
            if(contadorLetras[letra]){
                contadorLetras[letra]++;
            }else{
                contadorLetras[letra] = 1;
            }
        }
    }

    console.log(contadorLetras);
}

analizarTexto('Cuantas veces aparece cada letra');

