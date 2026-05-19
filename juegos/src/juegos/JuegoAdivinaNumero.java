package juegos;

import java.util.Scanner;

public class JuegoAdivinaNumero extends Juego{

    private int numeroSecreto;

    public JuegoAdivinaNumero(int numVidas, int numeroSecreto){
        super(numVidas);
        this.numeroSecreto = numeroSecreto;
    }

    @Override
    public void juega() {
        reiniciarPartida();

        System.out.println("Adivina un numero entre el 0 y el 10");

        Scanner teclado = new Scanner(System.in);
        boolean seguirJugando = true;

        //for, while 0...n; do...while 1...n
        do {
            System.out.println("Introduce un numero:");
            int numeroPosible = teclado.nextInt();

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

        teclado.close();
    }
}
