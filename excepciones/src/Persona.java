public class Persona {

    private String nombre;

    public Persona(String nombre) throws MalformedNameException{
        if(nombre.length()<3){
            throw new MalformedNameException();
        }else{
            this.nombre = nombre;
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws MalformedNameException{
        if(nombre.length()<3) {
            throw new MalformedNameException();
        }else{
            this.nombre = nombre;
        }
    }
}
