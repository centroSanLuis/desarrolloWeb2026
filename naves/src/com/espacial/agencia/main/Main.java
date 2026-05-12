package com.espacial.agencia.main;

import com.espacial.agencia.naves.*;

public class Main {

    static void main(String[] args) {

        NaveEspacial[] naves = new NaveEspacial[3];

        NaveCarga carga = new NaveCarga("ISS Enterprise", 100, 500);
        NaveExploracion exploracion = new  NaveExploracion("Osiris 2", 50, 30);
        NaveCombate combate = new  NaveCombate("X-Wing", 1, 100);

        naves[0] = carga;
        naves[1] = exploracion;
        naves[2] = combate;

        for (int i = 0; i < naves.length; i++) {
            naves[i].viajar(150);
        }

        for (int i = 0; i < naves.length; i++) {
            System.out.println(naves[i].getNombre() + " " + naves[i].getCombustible());
        }

        EstacionEspacial estacion = new EstacionEspacial("10,20,30", 100);

        estacion.anclarNave(carga);
    }


}
