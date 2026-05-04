cargarLibrosEnTabla();

document.getElementById('btnGuardar').addEventListener('click', ()=>{
    const isbn = document.getElementById('isbn').value;
    const titulo = document.getElementById('titulo').value;
    const autor = document.getElementById('autor').value;
    const precio = document.getElementById('precio').value;
    const genero = document.getElementById('genero').value;
    const sinopsis = document.getElementById('sinopsis').value;

    const libro = {
        isbn: isbn,
        titulo: titulo,
        autor: autor,
        precio: precio,
        genero: genero,
        sinopsis: sinopsis
    }

    const libros = localStorage.getItem("libros");
    let arrayLibros = [];

    if(libros){
        arrayLibros = JSON.parse(libros);
    }

    arrayLibros.push(libro);

    localStorage.setItem("libros", JSON.stringify(arrayLibros));

    document.forms[0].reset();

    cargarLibrosEnTabla();
});

document.getElementById('btnBuscar').addEventListener('click', ()=>{
    const titulo = document.getElementById('buscar').value;

    const libros = localStorage.getItem("libros");

    if(libros){
        arrayLibros = JSON.parse(libros);
        const cuerpoTabla = document.getElementById("cuerpoTabla");

        cuerpoTabla.innerHTML = '';

        const arrayFiltado = arrayLibros.filter((libro)=>{
            if(libro.titulo.toLowerCase().includes(titulo.toLowerCase())){
                return libro;
            }
        });

        arrayFiltado.forEach((libro)=>{
             cuerpoTabla.innerHTML += `
                <tr>
                    <td>${libro.isbn}</td>
                    <td>${libro.titulo}</td>
                    <td>${libro.autor}</td>
                    <td>${libro.precio}</td>
                    <td>${libro.genero}</td>
                </tr>                
             `;
        });
    }

});

document.getElementById('btnBorrarFiltro').addEventListener('click', ()=>{
    cargarLibrosEnTabla();
    document.getElementById('buscar').value = '';
});

function cargarLibrosEnTabla() {
    const libros = localStorage.getItem("libros");

    const cuerpoTabla = document.getElementById("cuerpoTabla");

    cuerpoTabla.innerHTML = '';

    if(libros){
        arrayLibros = JSON.parse(libros);

        arrayLibros.forEach((libro, index)=>{
            cuerpoTabla.innerHTML += `
                <tr>
                    <td>${libro.isbn}</td>
                    <td>${libro.titulo}</td>
                    <td>${libro.autor}</td>
                    <td>${libro.precio}</td>
                    <td>${libro.genero}</td>
                    <td><button onclick="borrarLibro(${index})">Borrar</button></td>
                    <td><button onclick="editarLibro(${index})">Editar</button></td>
                </tr>
            `;
        });
    }else{
        cuerpoTabla.innerHTML = `
            <tr>
                <td colspan="6">No hay libros disponibles</td>
            </tr>
        `;
    }

}

function borrarLibro(index){
    const libros = localStorage.getItem("libros");

    if(libros){
        arrayLibros = JSON.parse(libros);

        arrayLibros.splice(index, 1);

        localStorage.setItem("libros", JSON.stringify(arrayLibros));

        cargarLibrosEnTabla();
    }
}

function editarLibro(index){
    const libros = localStorage.getItem("libros");

    document.getElementById('btnGuardar').style.display = 'none';
    document.getElementById('btnEditar').style.display = 'block';

    if(libros){
        arrayLibros = JSON.parse(libros);

        const libro = arrayLibros[index];

        document.getElementById('isbn').value = libro.isbn;
        document.getElementById('titulo').value = libro.titulo;
        document.getElementById('autor').value = libro.autor;
        document.getElementById('precio').value = libro.precio;
        document.getElementById('genero').value = libro.genero;
        document.getElementById('sinopsis').value = libro.sinopsis;

        document.getElementById('isbn').disabled = true;
    }
}

document.getElementById('btnEditar').addEventListener('click', function(){
    const libros = localStorage.getItem("libros");

    const isbn = document.getElementById('isbn').value;

    console.log(isbn);

    if(libros){
        arrayLibros = JSON.parse(libros);

        let index = arrayLibros.findIndex((libro)=>{
            if(libro.isbn == isbn){
                return libro;
            }
        });

        const titulo = document.getElementById('titulo').value;
        const autor = document.getElementById('autor').value;
        const precio = document.getElementById('precio').value;
        const genero = document.getElementById('genero').value;
        const sinopsis = document.getElementById('sinopsis').value;

        arrayLibros[index] = {
            isbn: isbn,
            titulo: titulo,
            autor: autor,
            precio: precio,
            genero: genero,
            sinopsis: sinopsis
        };
        
        localStorage.setItem("libros", JSON.stringify(arrayLibros));

        cargarLibrosEnTabla();

        document.forms[0].reset();

        document.getElementById('isbn').disabled = false;

        document.getElementById('btnGuardar').style.display = 'block';
        document.getElementById('btnEditar').style.display = 'none';
    }
});
