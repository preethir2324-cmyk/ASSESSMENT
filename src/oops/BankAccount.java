package oops;

public class BankAccount {
    String AccountHolder;
    double Balance;

    public BankAccount(String AccountHolder, double d) {
        this.AccountHolder = AccountHolder;
        Balance = d;
    }

    void deposit(double amount) {
        Balance += amount;
        System.out.println("Deposit Amount" + amount);
        System.out.println("update Amount" + Balance);
    }

    void withdraw(double amount) {
        if (amount <= Balance) {
            Balance -= amount;
            System.out.println(" Amount Withdraw:" + amount);
        } else {
            System.out.println("Insufficent balance.");
        }
    }

    void displayBlance() {
        System.out.println("Account Holder:" + AccountHolder);
        System.out.println("Current blance:" + Balance);
    }
}

    class Bank {
        static void main() {
            BankAccount b1 = new BankAccount("preethi", 5000);
            b1.displayBlance();
            b1.deposit(4000);
            b1.displayBlance();
            b1.withdraw(2000);
            b1.displayBlance();
        }
    }
