function calcularLetra(){
    const letras = 'TRWAGMYFPDXBNJZSQVHLCKE';

    const numeroDNI = document.getElementById('numeroDNI').value;
    
    console.log(numeroDNI);

    const index = numeroDNI % 23;

    console.log(index);

    const letra = letras.charAt(index);

    console.log(letra);

    document.getElementById('letra').innerHTML = letra;
}