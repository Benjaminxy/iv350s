package se.kth.iv1350.amazingpos.model.exception;

/**
 * This exception is thrown when a payment fails to process like the paid less money.
 */
public class PaymentFailedException extends Exception {
    /**
     * Creates a new instance with the  error message.
     *
     * @param errorMessage The message describing the error.
     */
    public PaymentFailedException(String errorMessage) {
        super(errorMessage);
    }

    /**
     * Creates a new instance with the  error message and cause.
     *
     * @param errorMessage The message will describing the error.
     * @param error This is the cause of the error.
     */
    public PaymentFailedException(String errorMessage, Throwable error) {
        super(errorMessage, error);
    }
}
