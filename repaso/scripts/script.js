//ejercicio 1
document.getElementById('panico').addEventListener('click', function(evt){
    console.log(evt);
    console.log(this);
    //document.getElementById('panico').innerHTML = '¡ALERTA!';
    //this.innerHTML = '¡ALERTA!';
    //evt.target.innerHTML = '¡ALERTA!';
    //document.body.style.backgroundColor = 'red';

    if(document.body.style.backgroundColor == 'red'){
        evt.target.innerHTML = 'Pulsame';
        document.body.style.backgroundColor = 'white';
    }else{
        evt.target.innerHTML = '¡ALERTA!';
        document.body.style.backgroundColor = 'red';
    }
});

//ejercicio 2
document.getElementById('arial').addEventListener('click',cambioTipografia);
document.getElementById('courier').addEventListener('click',cambioTipografia);
document.getElementById('times').addEventListener('click',cambioTipografia);

function cambioTipografia(){
    console.log(this);

    if(this.innerHTML == 'Arial'){
        document.getElementById('cambioTipoLetra').style.fontFamily = 'arial';
    }else if(this.innerHTML == 'Courier'){
        document.getElementById('cambioTipoLetra').style.fontFamily = 'Courier';
    }else{
        document.getElementById('cambioTipoLetra').style.fontFamily = 'Times';
    }
    
}

//ejercicio 3
document.getElementById('calculadoraParrafos').addEventListener('click', function(){
    const numParrafos = document.getElementsByTagName('p').length;
    document.getElementById('numParrafos').innerHTML = `El número de parrafos es ${numParrafos}`;
});

//ejercicio 4
document.getElementById('cambiarModo').addEventListener('click', function(){
    console.log(document.body.className);
    const imagen = this.children[0];
    if(document.body.className == 'light-mode'){
        document.body.className = 'dark-mode';
        imagen.src = 'img/light.svg';
        imagen.alt = 'light mode';
    }else{
        document.body.className = 'light-mode';
        imagen.src = 'img/dark.svg';
        imagen.alt = 'dark mode';
    }
});

//ejercicio5
/*document.getElementById('imagenOpacidad').addEventListener('mouseenter',function(){
    this.style.opacity = 0;
    this.style.transition = 'opacity 0.5s ease';
});

document.getElementById('imagenOpacidad').addEventListener('mouseleave',function(){
    this.style.opacity = 1;
    this.style.transition = 'opacity 0.5s ease';
});*/
document.getElementById('imagenOpacidad').addEventListener('mouseenter',mostrarOcultarImagen);
document.getElementById('imagenOpacidad').addEventListener('mouseleave',mostrarOcultarImagen);

function mostrarOcultarImagen(evt){
    this.style.transition = 'opacity 0.5s ease';
    
    if(evt.type == 'mouseenter'){
        this.style.opacity = 0;
    }else{
        this.style.opacity = 1;
    }
}

//ejercicio6
let nombres = ['Alberto ', ' JaysOn  ', 'MariaN'];

function limpiarNombres(array){
    let resultado = new Array();

    for(let i=0; i<array.length; i++){
        resultado[i] = array[i].toLowerCase().trim();
    }

    return resultado;
}

let nombresLimpios = limpiarNombres(nombres);
console.log(nombresLimpios);

//ejericio7
const herramientas =  ["Editor", "Terminal", "Compilador"];

if(herramientas.includes("Terminal")){
    console.log('La palabra esta dentro del array');
}else{
    console.log('La palabra NO esta dentro del array');
}

//ejercicio8
const precios = [20, 56, 12, 135, 8, 49, 68];

precios.forEach(function(value){
    if(value > 50){
        console.log(value);
    }
});

//ejercicio9
function crearEmail(nombre, apellido){
    //let email = nombre + "." + apellido + "@centrosanluis.com";
    let nombreSinEspacios = '';
    let apellidoSinEspacios = '';

    for(let i=0; i<nombre.length; i++){
        if(nombre.charAt(i) != ' '){
            nombreSinEspacios = nombreSinEspacios + nombre.charAt(i);
        }
    }

    for(let i=0; i<apellido.length; i++){
        if(apellido.charAt(i) != ' '){
            apellidoSinEspacios = apellidoSinEspacios + apellido.charAt(i);
        }
    }


    let email = `${nombreSinEspacios.toLocaleLowerCase()}.${apellidoSinEspacios.toLocaleLowerCase()}@centrosanluis.com`;
    return email;
    //return `${nombre}.${apellido}@centrosanluis.com`;
}

console.log(crearEmail('Luis Alberto', 'Garcia de Cortazar'));

//ejercicio10
function cadenaAlReves(cadena){
    /*let arrayCadena = cadena.split('');
    console.log(arrayCadena);

    let arrayAlReves = arrayCadena.reverse();
    console.log(arrayAlReves);

    let cadenaAlReves = arrayAlReves.join('');
    console.log(cadenaAlReves);*/

    let cadenaAlReves = '';
    
    for(let i=cadena.length-1; i>=0; i--){
        cadenaAlReves = cadenaAlReves + cadena.charAt(i);
    }

    console.log(cadenaAlReves);
}

cadenaAlReves('hola');

//Ejercicio11
document.getElementById('btnCalcularEdad').addEventListener('click', function(){
    let edad = document.getElementById('edad').value;

    document.getElementById('resultadoCalcularEdad').innerHTML = `La edad humana de tu perro es ${edad * 7}`;
})

