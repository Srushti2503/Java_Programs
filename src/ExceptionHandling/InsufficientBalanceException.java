package ExceptionHandling;

public class InsufficientBalanceException extends Exception {

    // Constructor to accept the exception message
    public InsufficientBalanceException(String message) {
        super(message);
    }

    static void withdraw(int balance, int amount)
            throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance");
        }

        System.out.println("Withdrawal successful");
    }

    public static void main(String[] args) {

        try {
            withdraw(5000, 8000);
        }
        catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}


