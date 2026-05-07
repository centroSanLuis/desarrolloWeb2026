package main;

import enums.Region;
import pajaritos.Ave;
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
		
		p.tamano = 15.5;
		p.obtenerTamano();
		
		loro.region = Region.S;
		loro.deDondeEres();
		
		System.out.println(Ave.numAves);
		
	}

}
