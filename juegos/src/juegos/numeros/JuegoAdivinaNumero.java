package juegos.numeros;

import juegos.Juego;
import juegos.interfaces.Jugable;

import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinaNumero extends Juego implements Jugable {

    private int numeroSecreto;
    private Random random = new Random();

    public JuegoAdivinaNumero(int numVidas){
        super(numVidas);
        this.numeroSecreto = numeroSecreto;
    }

    public void juega() {
        reiniciarPartida();

        //System.out.println("Adivina un numero entre el 0 y el 10");

        Scanner teclado = new Scanner(System.in);
        boolean seguirJugando = true;

        //for, while 0...n; do...while 1...n
        do {

            boolean esNumeroValido = false;
            int numeroPosible = 0;

            do {
                System.out.println("Introduce un numero:");
                numeroPosible = teclado.nextInt();

                esNumeroValido = validaNumero(numeroPosible);
            }while(!esNumeroValido);
            //}while (esNumeroValido==false);


            if (numeroPosible == numeroSecreto) {
                System.out.println("Acertaste!!");
                actualizaRecord();
                seguirJugando = false;
            } else {
                seguirJugando = quitaVida();

                if(seguirJugando){
                    if(numeroPosible > numeroSecreto){
                        System.out.println("El numero que buscas es menor");
                    }else{
                        System.out.println("El numero que buscas es mayor");
                    }
                }
            }
        } while(seguirJugando);

        //teclado.close();
    }

    @Override
    public void muestraNombre() {
        System.out.println("Adivina numero");
    }

    @Override
    public void muestraInfo() {
        System.out.println("Encuentra el numero secreto entre el 0 y el 10");
    }

    public boolean validaNumero(int numero){
        if(numero <= 10 && numero >= 0){
            return true;
        }else {
            System.out.println("El numero introducido es incorrecto prueba con un numero del 0 al 10");
            return false;
        }
    }
}
