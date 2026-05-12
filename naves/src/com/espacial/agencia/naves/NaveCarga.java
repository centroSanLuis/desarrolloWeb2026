package com.espacial.agencia.naves;

public class NaveCarga extends NaveEspacial{
    private int cargaMaxima;

    public NaveCarga(String nombre, int capacidadPasajeros, int cargaMaxima) {
        super(nombre, capacidadPasajeros);
        this.cargaMaxima = cargaMaxima;
    }

    @Override
    public void viajar(int distancia) {
        double combustibleUsado = distancia * 0.5;

        double combustibleFinal = this.getCombustible() - combustibleUsado;

        if(combustibleFinal < 0){
            System.out.println("Viaje invalido, te has quedado tirado!!");
            setCombustible(0);
        }else{
            setCombustible(combustibleFinal);
        }
    }

    public int getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(int cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }
}
