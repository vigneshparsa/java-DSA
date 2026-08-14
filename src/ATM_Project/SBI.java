package ATM_Project;

class SBI extends Bank {

    SBI(double balance) {
        super("SBI", balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("SBI: Withdraw ₹" + amount + " using ATM.");
        } else {
            System.out.println("SBI: Insufficient funds.");
        }
    }

    // Overloading #1
    public void withdraw(double amount, int pin) {
        System.out.println("SBI: Withdrawing ₹" + amount + " using PIN: " + pin);
    }

    // Overloading #2
    public void withdraw(double amount, String atmId) {
        System.out.println("SBI: Withdraw ₹" + amount + " from ATM ID: " + atmId);
    }

    @Override
    public void checkBalance() {
        System.out.println("SBI Balance: ₹" + balance);
    }
}
