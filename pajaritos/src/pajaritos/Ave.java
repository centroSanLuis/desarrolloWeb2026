package pajaritos;

public class Ave {
	
	//atributos
	public char sexo;
	public int edad;
	
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
	
}
