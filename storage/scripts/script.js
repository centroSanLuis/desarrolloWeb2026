cargarDatosEnTabla();

document.getElementById("btnGuardar").addEventListener('click', ()=>{

    const nombre = document.getElementById('nombre').value;
    const apellidos = document.getElementById('apellidos').value;
    const edad = document.getElementById('edad').value;
    const equipo = document.getElementById('equipo').value;

    const usuario = {
        nombre: nombre,
        apellidos: apellidos,
        edad: edad,
        equipo: equipo
    };

    const usuarios = localStorage.getItem("usuarios");

    if(usuarios == null){
        const arrayUsuarios = [];

        arrayUsuarios.push(usuario);

        localStorage.setItem("usuarios", JSON.stringify(arrayUsuarios));
    }else{
        const arrayUsuarios = JSON.parse(usuarios);

        arrayUsuarios.push(usuario);

        localStorage.setItem("usuarios", JSON.stringify(arrayUsuarios));
    }

    cargarDatosEnTabla();

});

function cargarDatosEnTabla(){
    const cuerpoTabla = document.querySelector("#tablaUsuarios tbody");

    cuerpoTabla.innerHTML = '';

    const usuariosGuardados = localStorage.getItem("usuarios");

    if(usuariosGuardados != null){

        arrayUsuarios = JSON.parse(usuariosGuardados);

        arrayUsuarios.forEach(function(usuario){
            const fila = document.createElement('tr');

            fila.innerHTML = `
                <td>${usuario.nombre}</td>
                <td>${usuario.apellidos}</td>
                <td>${usuario.edad}</td>
                <td>${usuario.equipo}</td>
            `;

            cuerpoTabla.appendChild(fila);
        });

    }else{
        const fila = document.createElement('tr');

        fila.innerHTML = `<td colspan="4">No hay usuarios en la BD</td>` ;

        cuerpoTabla.appendChild(fila);
    }
}