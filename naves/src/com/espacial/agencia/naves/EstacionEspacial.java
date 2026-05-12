package com.espacial.agencia.naves;

public class EstacionEspacial {

    private String ubicacion;
    private int energia;

    public EstacionEspacial(String ubicacion, int energia) {
        this.ubicacion = ubicacion;
        this.energia = energia;
    }

    public void anclarNave(NaveEspacial nave){
        System.out.println("La Nave " + nave.getNombre() + " se ha anclado");
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }
}
