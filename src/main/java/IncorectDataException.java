import java.util.InputMismatchException;
import java.util.function.Supplier;

public class IncorectDataException extends RuntimeException {

    public IncorectDataException(String message) {
        super(message);
    }

    public IncorectDataException() {
        System.out.println("No elements provided");
    }



}
