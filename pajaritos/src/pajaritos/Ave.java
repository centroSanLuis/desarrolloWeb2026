package pajaritos;

public abstract class Ave {
	
	//{sexo: 'M', edad:12, plumaje: 'mucho'} 
	
	//atributos
	private char sexo;
	private int edad;
	private DatosPersonales datosPersonales;
	
	public static int numAves;
	
	//contructores
	public Ave(char sexo, int edad) {
		this.sexo = sexo;
		this.edad = edad;
		numAves++;
	}
	
	//metodos
	public static int obtenerNumAvesCreadas() {
		return numAves;
	}
	
	public void quienSoy() {
		System.out.println("Sexo:" + this.sexo);
		System.out.println("Edad:" + this.edad);
	}
	
	public abstract void cantar();

	//getter y setter
	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public DatosPersonales getDatosPersonales() {
		return datosPersonales;
	}

	public void setDatosPersonales(DatosPersonales datosPersonales) {
		this.datosPersonales = datosPersonales;
	}
	
}
