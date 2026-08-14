package ATM_Project;

class HDFC extends Bank {

    HDFC(double balance) {
        super("HDFC", balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("HDFC: Withdraw ₹" + amount + " using NetBanking.");
        } else {
            System.out.println("HDFC: Insufficient funds.");
        }
    }

    // Overloading
    public void withdraw(double amount, String otp, int deviceId) {
        System.out.println("HDFC: Withdraw ₹" + amount +
                " using OTP: " + otp + " Device: " + deviceId);
    }

    @Override
    public void checkBalance() {
        System.out.println("HDFC Balance: ₹" + balance);
    }
}



