//este script lo hemos sustituido por el otro, tambien hemos cambiado los buttons para que llamen diractamente a operaciones, si queremos que vuelvan a llamar a esto hay que hacer en el HTML:
/*
    <button type="button" onclick="sumar()">+</button>
    <button type="button" onclick="restar()">-</button>
    <button type="button" onclick="multiplicar()">*</button>
    <button type="button" onclick="dividir()">/</button>
    <button type="button" onclick="porcentaje()">%</button>
*/
function sumar(){
    const n1 = document.getElementById('numero1').value;
    const n2 = document.getElementById('numero2').value;

    if(isNaN(n1) || isNaN(n2)){
        document.getElementById('resultado').innerHTML = `Algún valor introducido no es numérico`;
    }else{
        const numeroCambiado1 = parseInt(n1); 
        const numeroCambiado2 = parseInt(n2); 
        const resultado = numeroCambiado1 + numeroCambiado2;
        document.getElementById('resultado').innerHTML = resultado;
    }
}

function restar(){
    const n1 = document.getElementById('numero1').value;
    const n2 = document.getElementById('numero2').value;

    if(isNaN(n1) || isNaN(n2)){
        document.getElementById('resultado').innerHTML = `Algún valor introducido no es numérico`;
    }else{
        const numeroCambiado1 = parseInt(n1); 
        const numeroCambiado2 = parseInt(n2); 
        const resultado = numeroCambiado1 - numeroCambiado2;
        document.getElementById('resultado').innerHTML = resultado;
    }
}

function multiplicar(){
    const n1 = document.getElementById('numero1').value;
    const n2 = document.getElementById('numero2').value;

    if(isNaN(n1) || isNaN(n2)){
        document.getElementById('resultado').innerHTML = `Algún valor introducido no es numérico`;
    }else{
        const numeroCambiado1 = parseInt(n1); 
        const numeroCambiado2 = parseInt(n2); 
        const resultado = numeroCambiado1 * numeroCambiado2;
        document.getElementById('resultado').innerHTML = resultado;
    }
}

function dividir(){
    const n1 = document.getElementById('numero1').value;
    const n2 = document.getElementById('numero2').value;

    if(isNaN(n1) || isNaN(n2)){
        document.getElementById('resultado').innerHTML = `Algún valor introducido no es numérico`;
    }else{
        const numeroCambiado1 = parseInt(n1); 
        const numeroCambiado2 = parseInt(n2); 
        const resultado = numeroCambiado1 / numeroCambiado2;
        document.getElementById('resultado').innerHTML = resultado;
    }
}

function porcentaje(){
    const n1 = document.getElementById('numero1').value;
    const n2 = document.getElementById('numero2').value;

    if(isNaN(n1) || isNaN(n2)){
        document.getElementById('resultado').innerHTML = `Algún valor introducido no es numérico`;
    }else{
        const numeroCambiado1 = parseInt(n1); 
        const numeroCambiado2 = parseInt(n2); 
        const resultado = (numeroCambiado1 * numeroCambiado2)/100;
        document.getElementById('resultado').innerHTML = resultado;
    }
}