package main;

import juegos.*;

import java.util.Scanner;

public class Main {

    static void main() {
        Jugable juego = eligeJuego();

        juego.muestraNombre();
        juego.muestraInfo();
        juego.juega();
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
        //JuegoAdivinaNumero j = new JuegoAdivinaNumero(5,5);
        /*JuegoAdivinaNumero jan = new JuegoAdivinaNumero(5,5);
        JuegoAdivinaPar jap = new JuegoAdivinaPar(5,6);
        JuegoAdivinaImpar jai = new JuegoAdivinaImpar(5,3);

        jan.muestraNombre();
        jan.muestraInfo();
        jan.juega();

        jap.muestraNombre();
        jap.muestraInfo();
        jap.juega();

        jai.muestraNombre();
        jai.muestraInfo();
        jai.juega();*/


    }

    public static Jugable eligeJuego(){
        Scanner teclado = new Scanner(System.in);
        JuegoAdivinaNumero jan = new JuegoAdivinaNumero(5,5);
        JuegoAdivinaPar jap = new JuegoAdivinaPar(5,6);
        JuegoAdivinaImpar jai = new JuegoAdivinaImpar(5,3);

        Jugable[] juegos = new Jugable[3];
        juegos[0] = jan;
        juegos[1] = jap;
        juegos[2] = jai;

        boolean esJuegoCorrecto = false;
        Jugable respuesta = null;

        do {
            System.out.println("Selecciona un Juego:");
            for (int i = 0; i < juegos.length; i++) {
                Jugable j = juegos[i];
                System.out.print(i + " - ");
                j.muestraNombre();
            }

            int juegoSeleccionado = teclado.nextInt();

            if (juegoSeleccionado >= 0 && juegoSeleccionado < juegos.length) {
                esJuegoCorrecto = true;
                respuesta = juegos[juegoSeleccionado];
            } else {
                esJuegoCorrecto = false;
                System.out.println("Selecciona un juego correcto!!");
            }
            //}while(esJuegoCorrecto == false);
        }while(!esJuegoCorrecto);

        return respuesta;
    }

}
