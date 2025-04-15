public class MyNoSuchElementException extends RuntimeException {
    public MyNoSuchElementException() {
        super("No such element");
    }

    public MyNoSuchElementException(String message) {
        super(message);
    }
}