public class MalformedNameException extends RuntimeException {
    public MalformedNameException() {
        super("El nombre es demasiado corto");
    }
}
