const productos = ['Leche', 'Pan', 'Queso'];
const precios = [1.2, 0.8, 4.50];
const stock = [5, 10, 2];

document.getElementById('btnBuscar').addEventListener('click', function(){
    let encontrado = false;
    let divResultado = document.getElementById('resultadoBusqueda');
    const productoBuscar = document.getElementById('buscarProducto').value;

    productos.forEach((producto, i)=>{
        if(producto.toLowerCase() == productoBuscar.toLowerCase().trim()){
            encontrado = true;
            divResultado.innerHTML = `${productos[i]} ${precios[i].toFixed(2)}€ [<span id='stock'>${stock[i]}</span> restantes]`;

            let btnComprar = document.createElement('button');
            btnComprar.innerText = 'Comprar'
            btnComprar.addEventListener('click', function(){

                if(stock[i]>0){
                    stock[i] = stock[i]-1;

                    let divStock = document.getElementById('stock');

                    if(stock[i] == 0){
                        this.disabled = true;
                    }else if(stock[i]>0 && stock[i] <3){
                        divStock.style.color = 'red';
                        divStock.style.fontWeight = 'bold';
                    }

                    divStock.innerText = stock[i];

                }

            });
            
            if(stock[i] == 0){
                btnComprar.disabled = true;
            }

            divResultado.appendChild(btnComprar);
        }
    });

    //if(encontrado==false)
    if(!encontrado){
        divResultado.innerText = "Producto no encontrado";
    }

});