public class FechaException extends RuntimeException{
    public FechaException(){ super(); }
    public FechaException(String message){ super(message); }
    public FechaException(Throwable cause){ super(cause); }
    public FechaException(String message,Throwable cause){ super(message,cause); }
}
