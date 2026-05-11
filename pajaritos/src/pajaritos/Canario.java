package pajaritos;

public abstract class Canario extends Ave{
	
	private double tamano;
	
	public Canario(char sexo, int edad) {
		super(sexo, edad);
	}

	public Canario(char sexo, int edad, double tamano) {
		super(sexo, edad);
		this.tamano = tamano;
	}
	
	public void obtenerTamano() {
		if(this.tamano == 0.0) {
			System.out.println("No hay datos del tamaño del Canario");
		}else {
			System.out.print("El Canario es ");
			
			if(this.tamano > 30) {
				System.out.println("Alto");
			}else if(this.tamano < 15) {
				System.out.println("Bajo");
			}else {
				System.out.println("Mediano");
			}
		}
	}

	public double getTamano() {
		return tamano;
	}

	public void setTamano(double tamano) {
		this.tamano = tamano;
	}

}
