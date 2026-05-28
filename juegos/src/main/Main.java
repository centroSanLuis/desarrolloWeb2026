package main;

import juegos.excepciones.JuegoException;
import juegos.interfaces.Jugable;
import juegos.letras.JuegoAhorcado;
import juegos.numeros.JuegoAdivinaImpar;
import juegos.numeros.JuegoAdivinaNumero;
import juegos.numeros.JuegoAdivinaPar;

import java.util.Scanner;

public class Main {

    private static Scanner teclado = new Scanner(System.in);

    static void main() {
        boolean seguirJugando = false;

            try{
                do {
                    Jugable juego = eligeJuego();
                    juego.muestraNombre();
                    juego.muestraInfo();
                    juego.juega();

                    System.out.println("¿Quieres seguir jugando? (s/n)");
                    teclado.nextLine();
                    String respuesta = teclado.nextLine();

                    if(respuesta.equals("s")){
                        seguirJugando = true;
                    }else{
                        System.out.println("Gracias por jugar!");
                        seguirJugando = false;
                    }
                }while(seguirJugando);
            } catch (JuegoException e) {
                System.out.println(e.getMessage());
                seguirJugando = false;
            } finally {
                System.out.println("Juego finalizado");
            }




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

    public static Jugable eligeJuego() throws JuegoException {

        JuegoAdivinaNumero jan = new JuegoAdivinaNumero(5);
        JuegoAdivinaPar jap = new JuegoAdivinaPar(5);
        JuegoAdivinaImpar jai = new JuegoAdivinaImpar(5);
        JuegoAhorcado jah = new JuegoAhorcado(5, "palabra");

        Jugable[] juegos = new Jugable[4];
        juegos[0] = jan;
        juegos[1] = jap;
        juegos[2] = jai;
        juegos[3] = jah;

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
