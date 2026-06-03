package com.harrypotter.gringots.models;

import com.harrypotter.gringots.dto.ConversionDTO;

public class ConversorModel {

    private final double TASA_CAMBIO = 5;

    public ConversionDTO calcularGaleones(ConversionDTO conversion) {

        if(conversion.getEuros() < 0){
            conversion.setMensajeError("Euros negativos");
            conversion.setGaleones(0);
        }else{
            conversion.setMensajeError(null);
            conversion.setGaleones(conversion.getEuros()/TASA_CAMBIO);
        }

        return conversion;
    }

}
