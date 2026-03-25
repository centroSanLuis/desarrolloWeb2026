let productos = ["manzana", "Pera", "platano", "SANDIA"];
let precios = [1.5, 2.0, 1.2, 5.0];
let stock = [10, 0, 5, 8];

function limpiarProductos(){
    for(let i=0; i< productos.length; i++){
        let producto = productos[i];

        //ponemos toda la palabra en minusculas
        producto = producto.toLowerCase();

        //cogemos el primer caracter lo ponemos en mayus y pegamos el resto de la palabra
        producto = producto.charAt(0).toUpperCase() + producto.slice(1);

        productos[i] = producto;

    }
}

limpiarProductos();

function buscarProducto(){

    const productoBuscar = document.getElementById('producto').value;
    let encontrado = false;
    let fruta = '';
    let precio = 0;
    let estado = '';

    console.log(productoBuscar);

    for(let i=0; i<productos.length; i++){
        let producto = productos[i];

        if(producto.toLowerCase() == productoBuscar.toLowerCase()){
            encontrado = true;
            fruta = productos[i];
            precio = precios[i];
            estado = calcularStock(i);
            break;
        }
    }

    if(encontrado){
        document.getElementById('resultado').innerHTML = `El producto ${fruta} tiene un precio de ${precio}€ (${estado})`;
    }else{
        document.getElementById('resultado').innerHTML = `El producto ${productoBuscar} no existe`;
    }

}

function calcularStock(index){
    const numStock = stock[index];

    if(numStock==0){
        return 'AGOTADO';
    }else if(numStock > 5){
        return 'Disponible';
    }else{
        return 'Ultimas unidades';
    }
}