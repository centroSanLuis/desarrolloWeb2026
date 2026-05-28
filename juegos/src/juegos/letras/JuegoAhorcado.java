package juegos.letras;

import juegos.Juego;
import juegos.excepciones.JuegoException;
import juegos.interfaces.Jugable;

import java.util.Scanner;

public class JuegoAhorcado extends Juego implements Jugable {

    private String palabraAdivinar;

    public JuegoAhorcado(int numVidas, String palabraAdivinar) throws JuegoException {
        super(numVidas);

        for(int i=0;i<palabraAdivinar.length();i++){
            if(Character.isDigit(palabraAdivinar.charAt(i))){
                throw new JuegoException("Hay un digito en la palabra");
            }
        }

        this.palabraAdivinar = palabraAdivinar;
    }

    @Override
    public void muestraInfo() {
        System.out.println("Adivina la palabra oculta");
    }

    @Override
    public void muestraNombre() {
        System.out.println("Ahorcado");
    }

    @Override
    public void juega() {
        reiniciarPartida();
        Scanner teclado = new Scanner(System.in);

        String palabraLetrasOcultas = "";

        for(int i=0;i<palabraAdivinar.length();i++){
            //palabraLetrasOcultas = palabraLetrasOcultas + "_";
            palabraLetrasOcultas += "_";
        }

        boolean seguirJugando = false;

        do {
            System.out.println(palabraLetrasOcultas);

            System.out.println("Introduce un caracter que creas que este en la palabra:");
            String letra = teclado.nextLine();

            boolean contieneLetra = palabraAdivinar.contains(letra);

            if (contieneLetra) {
                for (int i = 0; i < palabraAdivinar.length(); i++) {
                    if (palabraAdivinar.charAt(i) == letra.charAt(0)) {
                        palabraLetrasOcultas = palabraLetrasOcultas.substring(0, i)
                                + letra
                                + palabraLetrasOcultas.substring(i + 1);
                    }
                }

                if(palabraAdivinar.equals(palabraLetrasOcultas)){
                    seguirJugando = false;
                    System.out.println(palabraLetrasOcultas);
                    actualizaRecord();
                }else{
                    seguirJugando = true;
                }

            } else {
                seguirJugando = quitaVida();
            }
        }while(seguirJugando);
    }
}
