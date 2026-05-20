package juegos;

public abstract class Juego {

    private int numVidas;
    private int numVidasIniciales;
    private static int record;

    public Juego(int numVidas) {
        this.numVidas = numVidas;
        this.numVidasIniciales = numVidas;
    }

    public void muestraVidasRestantes(){
        System.out.println("Te quedan: " + this.numVidas);
    }

    public boolean quitaVida(){
        this.numVidas--;

        if(this.numVidas > 0){
            return true;
        }else{
            System.out.println("Fin del juego");
            return false;
        }
    }

    public void reiniciarPartida(){
        this.numVidas = this.numVidasIniciales;
    }

    public void actualizaRecord(){
        if(this.numVidas > Juego.record){
            Juego.record = this.numVidas;
            System.out.println("Has superado el record");
        }else if(this.numVidas == Juego.record){
            System.out.println("Has igualado el record");
        }
    }
}
