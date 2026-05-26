import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static void main() {

        Scanner sc = new Scanner(System.in);


        try{
            System.out.println("introduce un numero");
            int n1 = sc.nextInt();

            System.out.println("introduce un numero");
            int n2 = sc.nextInt();

            System.out.println("El resultado de la division es " + (n1/n2));
        }catch (InputMismatchException e){
            System.out.println("Debes introducir un numero");
        }catch(ArithmeticException e){
            System.out.println("El divisor no puede ser 0");
        }catch (Exception e) {
            System.out.println("La aplicación ha fallado por vete tu a saber que...");
        }

        try{
            Persona p = new Persona("Alberto");
            p.setNombre("Al");
        }catch (MalformedNameException e){
            System.out.println(e.getMessage());
        }


    }

    public static void abrirFichero(){
        try {
            FileReader fileReader = new FileReader("cosa.txt");
        } catch (FileNotFoundException e) {
            //crea el fichero
            abrirFichero();
        }
    }

}
