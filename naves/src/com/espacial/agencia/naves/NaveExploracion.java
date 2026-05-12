package com.espacial.agencia.naves;

public class NaveExploracion extends NaveEspacial{
    private int cantidadSensores;

    public NaveExploracion(String nombre, int capacidadPasajeros, int cantidadSensores) {
        super(nombre, capacidadPasajeros);
        this.cantidadSensores = cantidadSensores;
    }

    @Override
    public void viajar(int distancia) {
        double combustibleUsado = distancia * 0.2;

        double combustibleFinal = this.getCombustible() - combustibleUsado;

        if(combustibleFinal < 0){
            System.out.println("Viaje invalido, te has quedado tirado!!");
            setCombustible(0);
        }else{
            setCombustible(combustibleFinal);
        }
    }

    public void escanearPlaneta(){
        System.out.println("Estamos escaneando el planeta con " + this.cantidadSensores);
    }

    public int getCantidadSensores() {
        return cantidadSensores;
    }

    public void setCantidadSensores(int cantidadSensores) {
        this.cantidadSensores = cantidadSensores;
    }
}
