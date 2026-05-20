package juegos;

public class JuegoAdivinaPar extends JuegoAdivinaNumero{

    public JuegoAdivinaPar(int numVidas, int numeroSecreto){
        super(numVidas, numeroSecreto);
    }

    @Override
    public void muestraNombre() {
        System.out.println("Adivina un número par");
    }

    @Override
    public void muestraInfo() {
        System.out.println("Encuentra el numero PAR entre el 0 y el 10");
    }

    @Override
    public boolean validaNumero(int numero) {
        boolean esValido = super.validaNumero(numero);

        if(esValido){
        //if(esValido == true){
            if(numero%2 == 0){
                return true;
            }else{
                System.out.println("El numero introducido debe ser PAR");
                return false;
            }
        }else{
            return false;
        }

    }
}
