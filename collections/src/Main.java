import java.util.ArrayList;

public class Main {
    static void main() {
        //crear Array
        String[] arrayStr = new String[2];
        String[] arrayStr2 = {"lunes", "martes", "miercoles"};

        //crear arraylist
        ArrayList<String> arrayList = new ArrayList<>();

        //añadir valores
        arrayStr[0] = "lunes";
        arrayList.add("lunes");

        //eliminar valores
        arrayStr[0] = "";
        arrayList.remove(0);

        //acceder a un valor
        System.out.println(arrayStr[0]);
        System.out.println(arrayList.get(0));

        //obtener la dimension
        System.out.println(arrayStr.length);
        System.out.println(arrayList.size());

        Persona p1 = new Persona("Alberto");
        Persona p2 = new Persona("Alberto");

        System.out.println(p1);
        System.out.println(p2);

        if(p1.equals(p2)){
            System.out.println("son iguales");
        }else{
            System.out.println("no son iguales");
        }

        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(p1);
        personas.add(p1);
        personas.add(p1);
        personas.add(p1);
        personas.remove(p2);

        System.out.println(personas.size());

    }
}
