package ATM_Project;

public class Main {
    public static void main(String[] args) {
        // Interface reference → Runtime polymorphism
        BankServices bankService;

        // Abstract class reference → child object
        Bank bank;

        // SBI
        bank = new SBI(15000);
        bank.showBankName();
        bank.withdraw(2000);
        bank.deposit(500);
        bank.checkBalance();

        // HDFC
        bank = new HDFC(25000);
        bank.showBankName();
        bank.withdraw(5000);
        bank.deposit(1000);
        bank.checkBalance();

        // Interface polymorphism
        bankService = new SBI(12000);
        bankService.withdraw(1000);  // SBI implementation runs

        // Overloading examples
        SBI sbi = new SBI(20000);
        sbi.withdraw(3000, 1234);         // PIN
        sbi.withdraw(4000, "ATM-1020");   // ATM ID

        HDFC hdfc = new HDFC(35000);
        hdfc.withdraw(5000, "OTP884", 32);  // OTP+Device
    }
}
