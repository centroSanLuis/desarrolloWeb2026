package pajaritos;

import enums.Region;

public class Loro extends Ave{
	
	public Region region;
	public String color;
	
	public Loro(char sexo, int edad, Region region, String color) {
		super(sexo, edad);
		this.region = region;
		this.color = color;
	}
	
	
	public void deDondeEres() {
		System.out.println("Soy del " + this.region.toString());
		
		/*switch(this.region) {
			case N:
				System.out.println("Norte");
				break;
			case S:
				System.out.println("Sur");
				break;
			case E:
				System.out.println("Este");
				break;
			case O:
				System.out.println("Oeste");
				break;
		}*/
		
	}

}
