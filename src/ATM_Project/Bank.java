package ATM_Project;

abstract class Bank implements BankServices {

    protected String bankName;
    protected double balance;

    Bank(String bankName, double balance) {
        this.bankName = bankName;
        this.balance = balance;
    }

    // Concrete (shared) method
    public void showBankName() {
        System.out.println("Bank: " + bankName);
    }

    // Shared method for deposit (inherited by all banks)
    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println(bankName + ": Deposited ₹" + amount);
    }

    // Abstract method (must be implemented differently)
    public abstract void withdraw(double amount);
}

