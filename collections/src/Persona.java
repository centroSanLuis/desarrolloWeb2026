public class Persona {

    public String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Persona) {
            Persona p = (Persona) obj;

            if(this.nombre == p.nombre){
                return true;
            }else {
                return false;
            }
        }else{
            return false;
        }

    }
}
