import java.util.ArrayList;

public class Bank {
    private String bankName;
    private ArrayList<BankAccount> accounts;

    public Bank(String bankName, ArrayList<BankAccount> accounts) {
        super();
        this.bankName = bankName;
        this.accounts = accounts;
    }

    public void openAccount(BankAccount account) {
        accounts.add(account);
        System.out.println("Bank Account created successfully");
    }

    public void closeAccount(String accountNumber) {
        if (accountNumber != null) {
            System.out.println("Closed Successfully");

        } else {
            System.out.println("Account not found");
        }
    }

    public BankAccount findAccount(String accountNumber) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equals(accountNumber))
                ;
            return account;
        }
        return null;
    }

    public void displayAccount() {
        System.out.println("Bank Name" + " - " + bankName);
        System.out.println("Account" + "- " + accounts);

    }
}
