package com.espacial.agencia.naves;

public class NaveCombate extends NaveEspacial {
    private int escudoEnergia;

    public NaveCombate(String nombre, int capacidadPasajeros, int escudoEnergia) {
        super(nombre, capacidadPasajeros);
        this.escudoEnergia = escudoEnergia;
    }

    @Override
    public void viajar(int distancia) {
        double combustibleUsado = distancia * 0.8;

        double combustibleFinal = this.getCombustible() - combustibleUsado;

        if(combustibleFinal < 0){
            System.out.println("Viaje invalido, te has quedado tirado!!");
            setCombustible(0);
        }else{
            setCombustible(combustibleFinal);
        }
    }

    public int getEscudoEnergia() {
        return escudoEnergia;
    }

    public void setEscudoEnergia(int escudoEnergia) {
        this.escudoEnergia = escudoEnergia;
    }
}
