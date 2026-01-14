public class BankAccount {

    private String AccountNumber;
    private String AccountType;
    private double Balance;
    private String Status;
    private int Pin;

    public BankAccount(String bankAccount, String accountType, double balance, String status, int pin) {
        super();
        AccountNumber = bankAccount;
        AccountType = accountType;
        Balance = balance;
        Status = status;
        Pin = pin;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            Balance += amount;
            System.out.println(amount + " " + "has been deposited successfully!");
            System.out.println("Your balance is " + " " + Balance);
        } else {
            System.out.println("Deposit unsuccessful");
        }
    }

    public void withdrawal(double amount) {
        if (amount > 0 && amount <= Balance) {
            Balance -= amount;
            System.out.println(amount + " " + "has been withdrawn successfully");
            System.out.println("Your balance is " + " " + Balance);
        } else {
            System.out.println("Withdrawal unsuccessful. Insufficient Balance");
        }
    }

    public void checkBalance(int pin) {
        if (pin == Pin) {
            System.out.println("Your balance is " + " " + Balance);
        } else {
            System.out.println("Incorrect Pin!");
        }

    }

    public void transfer(double amount) {
        if (amount > 0 && amount <= Balance) {
            Balance -= amount;
            System.out.println("Transfer successful!");
        } else {
            System.out.println("Transfer unsuccessful. Insufficient balance");
        }
    }

    public String accountType() {
        return AccountType;
    }

    public String accountStatus() {
        return Status;
    }

    public String getAccountNumber() {

        return AccountNumber;
    }

    public void accountDetails() {
        System.out.println("Account Number" + " - " + AccountNumber);
        System.out.println("Account Type" + " - " + AccountType);
        System.out.println("Account Balance" + " - " + Balance);
        System.out.println("Account Status" + "- " + Status);
    }

    public static void main(String[] args) {
        System.out.println("BANK ACCOUNT DETAILS");
        BankAccount acc1 = new BankAccount("123", "Student", 123.90, "Active", 1234);
        acc1.checkBalance(1234);
        ;
    }

}
