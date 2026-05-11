package pajaritos;

import enums.Region;

public class Loro extends Ave{
	
	private Region region;
	private String color;
	
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
	
	@Override
	public void cantar() {
		System.out.println("Pio pio soy un lorito bonito");
	}


	public Region getRegion() {
		return region;
	}


	public void setRegion(Region region) {
		this.region = region;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}
	

}
