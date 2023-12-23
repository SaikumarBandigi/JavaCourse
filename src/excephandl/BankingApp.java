package excephandl;


class BankAccount {
    double balance;

    public void deposit(int amount) {
        if (amount < 0) {
            throw new InvalidAmountException("Invalid Amount Exception: " + amount);
        }
        balance += amount;
        System.out.println("Deposit succes..." + balance);
    }

    public void withdraw(int amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient Funds Exception: " + amount);
        }
        balance -= amount;
        System.out.println("withdraw succes..." + balance);
    }


}


public class BankingApp {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();

        bankAccount.deposit(200);

        try {
            bankAccount.withdraw(201);
        } catch (InsufficientFundsException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }

    }
}

class InvalidAmountException extends RuntimeException {
    public InvalidAmountException(String msg) {
        super(msg);
    }
}

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String msg) {
        super(msg);
    }
}