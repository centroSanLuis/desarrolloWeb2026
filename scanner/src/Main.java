//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Edad:");

    int edad =  teclado.nextInt();

    teclado.nextLine();

    System.out.print("Introduce tu nombre: ");

    String nombre = teclado.nextLine();

    System.out.println("Hola, " + nombre + "(" + edad +")");

    teclado.close();

}
