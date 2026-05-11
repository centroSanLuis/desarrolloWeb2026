package pajaritos;

public class Piolin extends Canario{

	private int numPeliculas;

	public Piolin(char sexo, int edad, double tamano, int numPeliculas) {
		super(sexo, edad, tamano);
		this.numPeliculas = numPeliculas;
	}
	
	@Override
	public void cantar() {
		System.out.println("Pio pio soy un Piolin");
	}

	public int getNumPeliculas() {
		return numPeliculas;
	}

	public void setNumPeliculas(int numPeliculas) {
		this.numPeliculas = numPeliculas;
	}

}
