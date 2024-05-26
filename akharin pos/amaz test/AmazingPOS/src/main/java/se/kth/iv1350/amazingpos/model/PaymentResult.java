package se.kth.iv1350.amazingpos.model;

/**
 * Represents the result of a payment.
 */
public class PaymentResult {
    private final boolean successful;
    private final double totalDue;
    private final double change;
    private final String paymentMethod;

    /**
     * Creates a new instance representing the payment result.
     * 
     * @param successful If the payment was successful.
     * @param totalDue The total amount due.
     * @param change The change to be given back.
     * @param paymentMethod The method of payment used.
     */
    public PaymentResult(boolean successful, double totalDue, double change, String paymentMethod) {
        this.successful = successful;
        this.totalDue = totalDue;
        this.change = change;
        this.paymentMethod = paymentMethod;
    }

    /**
     * Checks if the payment was successful.
     * 
     * @return true if the payment was successful.
     */
    public boolean isSuccessful() {
        return successful;
    }

    /**
     * Gets the total amount due.
     * 
     * @return The total amount due.
     */
    public double getTotalDue() {
        return totalDue;
    }

    /**
     * Gets the change to be given back.
     * 
     * @return The change amount.
     */
    public double getChange() {
        return change;
    }

    /**
     * Gets the payment method used.
     * 
     * @return The payment method.
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }
}
