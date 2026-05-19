package main;

import juegos.Juego;
import juegos.JuegoAdivinaNumero;

public class Main {

    static void main() {
        /*
        //Crea una instancia de la clase Juego indicando que el número de vidas es 5.
        Juego juego = new Juego(5);

        //Llama al metodo MuestraVidasRestantes del objeto creado.
        juego.muestraVidasRestantes();

        //Resta una vida al valor del atributo con las vidas y vuelve a llamar MuestraVidasRestantes.
        //juego.numVidas = juego.numVidas-1;
        juego.quitaVida();
        juego.muestraVidasRestantes();

        //Crea otra instancia de la clase Juego indicando que el número de vidas es también de 5
        Juego juego2 = new Juego(5);

        //Llama al metodo MuestraVidasRestantes de la nueva instancia y luego al de la instancia anterior
        juego2.muestraVidasRestantes();
        juego.muestraVidasRestantes();

        juego.reiniciarPartida();
        //juego.muestraVidasRestantes();

        juego.actualizaRecord();
        juego2.actualizaRecord();
        */
        JuegoAdivinaNumero j = new JuegoAdivinaNumero(5,5);

        j.juega();
    }

}
