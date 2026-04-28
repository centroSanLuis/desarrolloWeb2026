const coche = {
    marca: "Toyota",
    modelo: "Corolla",
    año: 2020,
    color: "Rojo",
    velocidad: 0,
    velocidadMaxima: 180,
    arrancar: function(){
        this.velocidad = 10;
        console.log(`El coche ha arrancado y va a ${this.velocidad} km/h`);
    },
    acelerar: function(kmh){
        if(this.velocidad + kmh > this.velocidadMaxima) {
            this.velocidad = this.velocidadMaxima;
            console.log(`El coche ha alcanzado su velocidad máxima de ${this.velocidadMaxima} km/h`);
        }else{
            this.velocidad = this.velocidad + kmh;
            console.log(`El coche ha acelerado y va a ${this.velocidad} km/h`);
        }

    }
}

coche.arrancar();
coche.acelerar(50);
coche.acelerar(150);

const cocheJSON = JSON.stringify(coche);
const cocheObjeto = JSON.parse(cocheJSON);

console.log(coche);
console.log(cocheJSON);
console.log(cocheObjeto);

let a = 5;
let b = a;

b = b+10;

console.log(a);
console.log(b);

coche2 = coche;

coche2.color = "Azul";

console.log(coche);
console.log(coche2);

const heroe1 = {
    nombre: "Superman",
    edad: 30,
    poderes: ["super fuerza", "vuelo", "visión de rayos X"],
    ciudad: "Metrópolis",
    saludo: function(){
        console.log(`Hola, soy ${this.nombre}`);
    },
    usarPoder1: function(){
        console.log(`Uso mi poder: ${this.poderes[0]}`);
    }
};

const heroe2 = {
    nombre: "Batman",
    edad: 35,
    poderes: ["inteligencia", "habilidades de combate", "tecnología avanzada"],
    ciudad: "Gotham",
    saludo: function(){
        console.log(`Hola, soy ${this.nombre}`);
    }
};

const heroe3 = {
    nombre: "Spiderman",
    edad: 25,
    poderes: ["agilidad", "sentido arácnido", "fuerza proporcional a una araña"],
    ciudad: "Nueva York",
    saludo: function(){
        console.log(`Hola, soy ${this.nombre}`);
    }
};

let propiedadBuscar = "nombre";

heroe1.usarPoder1();

const heroes = [heroe1, heroe2, heroe3];

heroes.forEach(function(heroe) {
    heroe.saludo();
});

document.getElementById("btnBuscar").addEventListener("click", function() {
    const campoBuscar = document.getElementById("critero").value;
    const valorBuscar = document.getElementById("atributoBuscar").value;

    heroes.forEach(function(heroe) {
        if(heroe[campoBuscar] == valorBuscar) {
            console.log(heroe);
        }
    });
});
