function operaciones(tipoOperacion){
    const n1 = document.getElementById('numero1').value;
    const n2 = document.getElementById('numero2').value;

    if(isNaN(n1) || isNaN(n2)){
        document.getElementById('resultado').innerHTML = `Algún valor introducido no es numérico`;
    }else{
        const numeroCambiado1 = parseInt(n1); 
        const numeroCambiado2 = parseInt(n2);

        let resultado = 0;

        switch(tipoOperacion){
            case 'sumar':
                resultado = numeroCambiado1 + numeroCambiado2;
                break;
            case 'restar':
                resultado = numeroCambiado1 - numeroCambiado2;
                break; 
            case 'multiplicar':
                resultado = numeroCambiado1 * numeroCambiado2;
                break; 
            case 'dividir':
                resultado = numeroCambiado1 / numeroCambiado2;
                break;
            case 'porcentaje':
                resultado = (numeroCambiado1 * numeroCambiado2)/100;
                break;
            default:
                document.getElementById('resultado').innerHTML = `operación no válida`;
        }

        document.getElementById('resultado').innerHTML = resultado;
    }
}