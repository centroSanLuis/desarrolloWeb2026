document.getElementById("btnGuardar").addEventListener('click', (evt)=>{

    evt.preventDefault();
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

    console.log(usuario);

    localStorage.setItem(nombre, JSON.stringify(usuario));

    user = localStorage.getItem(nombre);

    console.log(JSON.parse(user));

    //return false;
});