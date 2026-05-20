package juegos;

public class JuegoAdivinaImpar extends JuegoAdivinaNumero{
    public JuegoAdivinaImpar(int numVidas, int numeroSecreto){
        super(numVidas, numeroSecreto);
    }

    @Override
    public void muestraNombre() {
        System.out.println("Adivina un número impar");
    }

    @Override
    public void muestraInfo() {
        System.out.println("Encuentra el numero IMPAR entre el 0 y el 10");
    }

    @Override
    public boolean validaNumero(int numero) {
        boolean esValido = super.validaNumero(numero);

        if(esValido){
            //if(esValido == true){
            if(numero%2 != 0){
                return true;
            }else{
                System.out.println("El numero introducido debe ser IMPAR");
                return false;
            }
        }else{
            return false;
        }

    }
}
