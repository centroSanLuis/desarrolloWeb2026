//ejercicio1

document.getElementById('btnSaludar').addEventListener('click', function(){
    let nombre = document.getElementById('nombre').value;
    document.getElementById('resultadoSaludo').innerText = `¡Hola ${nombre}!`;
});

//ejericio2
document.getElementById('btnCambiarColor').addEventListener('click', function(){
    //this.parentNode.children[1].style.backgroundColor = 'yellow';
    const cuadrado = document.getElementById('cuadrado');
    let colorFondo = cuadrado.style.backgroundColor;

    if(colorFondo == 'yellow'){
        cuadrado.style.backgroundColor = 'white';
    }else{
        cuadrado.style.backgroundColor = 'yellow';
    }
});

//ejercicio3
document.getElementById('btnSumar').addEventListener('click', function(){
    let contador = document.getElementById('contador');
    let numero = parseInt(contador.innerText);

    contador.innerText = numero+1;
});

//ejercicio4
document.getElementById('btnGrande').addEventListener('click', formatearTexto);
document.getElementById('btnAzul').addEventListener('click', formatearTexto);
document.getElementById('btnSubrayado').addEventListener('click', formatearTexto);

function formatearTexto(){
    let texto = document.getElementById('texto');

    if(this.innerText == 'Grande'){
        texto.style.fontSize = '40px';
    } else if(this.innerText == 'Azul'){
        texto.style.color = 'blue';
    }else{
        texto.style.textDecoration = 'underline';
    }
}

//ejercicio5
document.getElementById('btnMostrarOcultarImg').addEventListener('click', function(){
    let imagen = document.getElementById('imgLogo');

    console.log(imagen.style.display);

    if(imagen.style.display == 'none'){
        imagen.style.display = 'block';
        this.innerText = 'Ocultar';
    }else{
        imagen.style.display = 'none';
        this.innerText = 'Mostrar';
    }
});

//ejercicio6
document.getElementById('btnAnadirProducto').addEventListener('click', function(){
    let producto = document.getElementById('producto').value;
    let lista = document.getElementById('listaProductos');

    let li = document.createElement('li');
    li.innerText = producto;

    lista.appendChild(li);
});

//ejericio7
document.getElementById('pass').addEventListener('input', function(){
    let msjError = document.getElementById('msjError');
    if(this.value.length < 8){
        msjError.innerText = 'Muy corta';
        this.style.borderColor = 'red';
    }else{
        msjError.innerText = '';
        this.style.borderColor = 'green';
    }
});

//ejercicio8

let pokemones = ['https://www.pokemon.com/static-assets/content-assets/cms2/img/pokedex/detail/001.png', 'https://www.pokemon.com/static-assets/content-assets/cms2/img/pokedex/detail/002.png', 'https://www.pokemon.com/static-assets/content-assets/cms2/img/pokedex/detail/003.png', 'https://www.pokemon.com/static-assets/content-assets/cms2/img/pokedex/detail/004.png'];

let index = 0;

document.getElementById('btnAnterior').addEventListener('click', function(){
    if(index > 0){
        index = index - 1;
        document.getElementById('imgCarrusel').src = pokemones[index];
    }

    deshabilitarHabilitarBotones();

});

document.getElementById('btnSiguiente').addEventListener('click', function(){
    if(index < pokemones.length-1){
        index = index + 1;
        document.getElementById('imgCarrusel').src = pokemones[index];
    }

    deshabilitarHabilitarBotones();

});

function deshabilitarHabilitarBotones(){
    const btnAnterior = document.getElementById('btnAnterior');
    const btnSiguiente = document.getElementById('btnSiguiente');;

    if(index != 0){
        btnAnterior.disabled = false;
    }else{
        btnAnterior.disabled = true;
    }

    if(index != pokemones.length-1){
        btnSiguiente.disabled = false;
    }else{
        btnSiguiente.disabled = true;
    }
}


//ejercicio9
document.getElementById('btnCambioColor').addEventListener('click', function(){
    let red = Math.floor(Math.random()*256);
    let green = Math.floor(Math.random()*256);
    let blue = Math.floor(Math.random()*256);

    document.body.style.backgroundColor = `rgb(${red}, ${green}, ${blue})`;
});