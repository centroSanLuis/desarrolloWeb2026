public class Cosa {
    static void main() {
        Object[] array = new Object[3];

        array[0] = new Persona();
        array[1] = new Persona();
        array[2] = "hola";

        for(int i = 0; i < array.length; i++){
            if(array[i] instanceof Persona){
                Persona p =  (Persona) array[i];
                p.hablar();
            }
        }
    }
}
