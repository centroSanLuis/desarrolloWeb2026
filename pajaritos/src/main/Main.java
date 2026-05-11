package main;

import enums.Region;
import pajaritos.Ave;
import pajaritos.DatosPersonales;
import pajaritos.Loro;
import pajaritos.Piolin;

public class Main {

	public static void main(String[] args) {
		Piolin p = new Piolin('M', 5, 6.5, 3);
		Loro loro = new Loro('H', 3, Region.N, "verde");
		
		p.quienSoy();
		loro.quienSoy();
		
		p.obtenerTamano();
		loro.deDondeEres();
		
		p.setTamano(15.5);
		p.obtenerTamano();
		
		loro.setRegion(Region.S);
		loro.deDondeEres();
		
		DatosPersonales datosLoro = new DatosPersonales("Lorito", "Alberto");
		DatosPersonales datosPiolin = new DatosPersonales("Piolin", "Hugo");
		
		loro.setDatosPersonales(datosLoro);
		p.setDatosPersonales(datosPiolin);
		
		System.out.println(Ave.numAves);
		
		Ave[] aves = new Ave[2];
		
		aves[0] = p;
		aves[1] = loro;
		
		for(int i=0;i<aves.length;i++) {
			aves[i].cantar();
		}
		
		
	}

}
