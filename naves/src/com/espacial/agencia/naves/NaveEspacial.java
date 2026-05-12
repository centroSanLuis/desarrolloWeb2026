package com.espacial.agencia.naves;

public abstract class NaveEspacial {
    private String nombre;
    private double combustible;
    protected int capacidadPasajeros;

    public NaveEspacial(String nombre, int capacidadPasajeros){
        this.nombre = nombre;
        this.capacidadPasajeros = capacidadPasajeros;
        this.combustible = 100;
    }

    public abstract void viajar(int distancia);

    public void recargarCobustible(){
        this.combustible = 100;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCombustible() {
        return combustible;
    }

    public void setCombustible(double combustible) {
        if(combustible >= 0 && combustible <= 100){
            this.combustible = combustible;
        }else{
            System.out.println("Combustible invalido");
        }
    }
}
