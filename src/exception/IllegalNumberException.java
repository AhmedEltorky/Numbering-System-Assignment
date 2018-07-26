package exception;

/**
 *
 * @author Ahmed El-Torky
 */
public class IllegalNumberException extends Throwable {

    public IllegalNumberException(String message) {
        super(message);
        System.out.println("Invalid Entry");
    }

}
